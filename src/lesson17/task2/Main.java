package lesson17.task2;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        File docFolder;
        int docCount;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the folder: ");
            File folder = new File(scanner.next());
            if (folder.exists() && folder.isDirectory()) {
                docFolder = folder;
            } else {
                throw new RuntimeException("Error. The entered folder not exist!");
            }
            System.out.println("Enter count of files: ");
            docCount = scanner.nextInt();
        }

        Map<String, Document> docs = processDocuments(docFolder, docCount);
        long invalidDocCount = Arrays.stream(docFolder.listFiles()).filter(f -> !f.getName().endsWith(".txt")).count();
        System.out.println(docs.size() + " valid documents processed.");
        System.out.println(invalidDocCount + " invalid documents found.");
        System.out.println("Docs:");
        docs.forEach((docName, doc) -> System.out.println("Doc name: " + docName + ".\n" + "Doc content:\ndoc numbers: " +
                doc.getDocNumbers() + " ,phone numbers: " + doc.getPhoneNumber() + " ,email: " + doc.getEmail()));
    }

    private static Map<String, Document> processDocuments(File docFolder, int docCount) {
        List<File> docs = Arrays.stream(docFolder.listFiles())
                .filter(f -> f.getName().endsWith(".txt"))
                .limit(docCount)
                .toList();

        if (docs.size() == 0) {
            throw new RuntimeException("Error. The entered folder does not contain any txt file!");
        }

        return docs.stream().collect(
                Collectors.toMap(Main::getDocName, Main::parseDoc)
        );
    }

    private static String getDocName(File doc) {
        return doc.getName().replace(".txt", "");
    }

    private static Document parseDoc(File doc) {
        String docContent = readFile(doc);
        return new Document(extractDocNumbers(docContent), extractPhoneNumber(docContent), extractEmail(docContent));
    }

    private static String readFile(File file) {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            StringBuilder fileContent = new StringBuilder();
            String line = fileReader.readLine();
            while (line != null) {
                fileContent.append(line);
                line = fileReader.readLine();
            }
            return fileContent.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<String> extractDocNumbers(String docContent) {
        Pattern pattern = Pattern.compile("\\d\\d\\d\\d-[\\wа-яёА-ЯЁ][\\wа-яёА-ЯЁ][\\wа-яёА-ЯЁ]-\\d\\d\\d\\d-[\\wа-яёА-ЯЁ][\\wа-яёА-ЯЁ][\\wа-яёА-ЯЁ]-\\d[\\wа-яёА-ЯЁ]\\d[\\wа-яёА-ЯЁ]");
        Matcher matcher = pattern.matcher(docContent);
        List<String> docNumbers = new ArrayList<>();
        while (matcher.find()) {
            docNumbers.add(matcher.group());
        }
        return docNumbers;
    }

    private static String extractPhoneNumber(String docContent) {
        Pattern pattern = Pattern.compile("\\+\\(\\d\\d\\)\\d{7}");
        Matcher matcher = pattern.matcher(docContent);
        String phoneNumber = null;
        if (matcher.find()) {
            phoneNumber = matcher.group();
        }
        return phoneNumber;
    }

    private static String extractEmail(String docContent) {
        Pattern pattern = Pattern.compile("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}");
        Matcher matcher = pattern.matcher(docContent);
        String email = null;
        if (matcher.find()) {
            email = matcher.group();
        }
        return email;
    }
}
