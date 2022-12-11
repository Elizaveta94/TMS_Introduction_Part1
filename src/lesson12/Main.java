package lesson12;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //C:\study\TMS-introduction\Lesson12\documents.txt
            String FileName = reader.readLine();
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(FileName)));

            BufferedWriter writerValid = new BufferedWriter(new FileWriter("C:\\study\\TMS-introduction\\Lesson12\\valid_documents.txt"));
            BufferedWriter writerInValid = new BufferedWriter(new FileWriter("C:\\study\\TMS-introduction\\Lesson12\\invalid_documents.txt"));
            String docNumber = reader.readLine();

            while (docNumber != null) {
                if ((docNumber.startsWith("contract") || docNumber.startsWith("docnum")) && docNumber.length() == 15) {
                    writerValid.append(docNumber + "\n");
                } else if (((docNumber.startsWith("contract") || docNumber.startsWith("docnum")) && docNumber.length() != 15)) {
                    writerInValid.append(docNumber + "- The number of symbols in the document is not 15" + "\n");
                } else if (!(docNumber.startsWith("docnum") && !(docNumber.startsWith("contract")) && docNumber.length() != 15)) {
                    writerInValid.append(docNumber + "- Document starts wrong and the number of symbols in the document is not 15" + "\n");
                } else {
                    writerInValid.append(docNumber + "- Document starts wrong" + "\n");
                }
                docNumber = reader.readLine();
            }
            reader.close();
            writerValid.close();
            writerInValid.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
