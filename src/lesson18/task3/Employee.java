package lesson18.task3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "company")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
    @XmlElement
    private String firstName;
    @XmlElement
    private String lastName;
    @XmlElement
    private String title;
    @XmlElement
    private String line;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String title, String line) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.line = line;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public String getLine() {
        return line;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", line='" + line + '\'' +
                '}';
    }
}

