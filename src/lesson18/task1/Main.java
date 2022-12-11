package lesson18.task1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;
import java.rmi.RemoteException;
import java.util.*;
public class Main {
    private static Employee employee;

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        File file;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the folder: ");
            File folder = new File(scanner.next());
            File[] files = folder.listFiles();
            if (files == null) {
                throw new RuntimeException("Folder not exist");
            }
            if (files.length != 1) {
                throw new RuntimeException("Folder contains more than 1 file");
            }
            if (!files[0].getName().endsWith(".xml")) {
                throw new RemoteException("Folder does not contain xml file");
            }
            file = files[0];
        }
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        XMLHandler handler = new XMLHandler();
        parser.parse(file, handler);

        String fileName = employee.getFirstName() + " " + employee.getLastName() + " " + employee.getTitle() + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : employee.getLines()) {
                writer.write(line);
            }
        }
    }

    private static class XMLHandler extends DefaultHandler {
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) {
            if (qName.equals("employee")) {
                String firstName = attributes.getValue("firstName");
                String lastName = attributes.getValue("lastName");
                String title = attributes.getValue("title");
                employee = new Employee(firstName, lastName, title);
            }
            if (qName.equals("line")) {
                employee.addLine(attributes.getValue("line") + "\n");
            }
        }
    }
}
