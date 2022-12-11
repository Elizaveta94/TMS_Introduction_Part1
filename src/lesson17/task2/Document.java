package lesson17.task2;

import java.util.List;

public class Document {
    private List<String> docNumbers;
    private String phoneNumber;
    private String email;

    public Document(List<String> docNumbers, String phoneNumber, String email) {
        this.docNumbers = docNumbers;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public List<String> getDocNumbers() {
        return docNumbers;
    }

    public void setDocNumbers(List<String> docNumbers) {
        this.docNumbers = docNumbers;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
