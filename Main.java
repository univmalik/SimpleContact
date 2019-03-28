import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Contact> myContacts = new ArrayList<>();
        MobilePhone iPhone = new MobilePhone(myContacts);

        iPhone.addContact();
        iPhone.addContact();
        iPhone.addContact("Roger", "3485038940");

        iPhone.viewContacts();
        iPhone.findContactByName("Novak");
        iPhone.removeContactByName("Novak");
        iPhone.viewContacts();

        iPhone.modifyContactName("Roger", "Rafael");
        iPhone.modifyContactNumber("Rafael", "439085903489");

        iPhone.viewContacts();
    }
}
