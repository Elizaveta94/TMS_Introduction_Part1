package lesson18.task3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        Employee employye = new Employee("firstNameTset", "lastNameTest", "titleTest", "lineTest");
        //murshal();
        unmarshal();
    }

    private static void unmarshal() throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(Employee.class);
        Employee employee = (Employee) context.createUnmarshaller().unmarshal(new File("src\\task3\\document.xml"));
        System.out.println(employee);
    }

    private static void murshal(Employee employee) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Employee.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(employee, new File("src\\task3\\document.xml"));
    }
}
