public class Contact {

    private String contactName;
    private String contactNumber;

    public Contact(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    @Override
    public String toString() {
        return ("Contact Name: " + getContactName().toString() +
                "\n" + "Contact Phone: " + getContactNumber().toString());
    }

    public String changeName(String newName){
        return contactName = newName;
    }

    public String changeNumber(String newNumber){
        return contactNumber = newNumber;
    }

}
