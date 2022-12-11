package lesson13;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> files = readFiles();    //C:\study\TMS-introduction\Lesson13\documents1.txt
        Set<String> docNumbers = readDocNumbers(files);
        Map<String, String> validatedDocs = validate(docNumbers);
        writeDocsToFile("report.txt", validatedDocs);
    }

    public static List<String> readFiles() {
        List<String> files = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            String file = scanner.next();
            while (!file.equals("0")) {
                files.add(file);
                file = scanner.next();
            }
        }
        return files;
    }

    public static Set<String> readDocNumbers(List<String> files) throws IOException {
        Set<String> docNumbers = new HashSet<>();
        for (String file : files) {
            try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
                String docNumber = fileReader.readLine();
                while (docNumber != null) {
                    docNumbers.add(docNumber);
                    docNumber = fileReader.readLine();
                }
            }
        }
        return docNumbers;
    }

    public static Map<String, String> validate(Set<String> docNumbers) {
        Map<String, String> validatedDocs = new HashMap<>();
        for (String docNumber : docNumbers) {
            if ((docNumber.startsWith("contract") || docNumber.startsWith("docnum")) && docNumber.length() == 15) {
                validatedDocs.put(docNumber, "Valid.");
            } else if (!(docNumber.startsWith("contract") || docNumber.startsWith("docnum"))) {
                validatedDocs.put(docNumber, "Invalid. Document must start with contract or docnum.");
            } else if (docNumber.length() != 15) {
                validatedDocs.put(docNumber, "Invalid. Document length must be 15.");
            }
        }
        return validatedDocs;
    }

    public static void writeDocsToFile(String reportFile, Map<String, String> validatedDocs) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(reportFile))) {
            for (Map.Entry<String, String> validatedDoc : validatedDocs.entrySet()) {
                writer.write(validatedDoc.getKey() + " - " + validatedDoc.getValue()+"\n");
            }
        }
    }
}
