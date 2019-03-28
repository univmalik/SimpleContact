import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    public ArrayList<Contact> myContacts;

    public MobilePhone(ArrayList<Contact> myContacts) {
        this.myContacts = myContacts;
    }

    public void addContact(String name, String number) {

        myContacts.add(new Contact(name, number));
    }

    public void addContact() {

        System.out.println("Please enter a contact name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Please enter contact number: ");
        String number = sc.nextLine();
        //Creates new object Contact with name and number.
        myContacts.add(new Contact(name, number));
    }

    public void viewContacts() {
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(displayContact(i));
        }

    }

    //method displays Contact with index.
    public String displayContact(int index) {
        return myContacts.get(index).toString();
    }

    //method finds Contact with name
    public void findContactByName(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (name.equals(myContacts.get(i).getContactName())) {
                System.out.println("Contact " + name + " exists, and his phone number is " +
                        myContacts.get(i).getContactNumber());
            } else {
                if (i == (myContacts.size() - 1)) {
                    System.out.println("Contact " + name + " does not exist!");
                }
            }
        }
    }

    public void removeContactByName(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (name.equals(myContacts.get(i).getContactName())) {
                myContacts.remove(i);
                System.out.println("Contact " + name + " has been deleted.");
            } else {
                if (i == (myContacts.size() - 1)) {
                    System.out.println("Contact " + name + " does not exist!");

                }
            }
        }
    }

    public void modifyContactName(String name, String newName) {
        for (int i = 0; i < myContacts.size(); i++) {

            if (name.equals(myContacts.get(i).getContactName())) {
                myContacts.get(i).changeName(newName);
                System.out.println("Name changed from " + name + " to " + newName);
            } else {
                if (i == (myContacts.size() - 1)) {
                    System.out.println("Contact " + name + " does not exist!");

                }
            }


        }
    }

    public void modifyContactNumber(String name, String newNumber) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (name.equals(myContacts.get(i).getContactName())) {
                myContacts.get(i).changeNumber(newNumber);
                String number = myContacts.get(i).getContactNumber();
                System.out.println("Number of " + name + " changed from " + number + " to " + newNumber);
            } else {
                if (i == (myContacts.size() - 1)) {
                    System.out.println("Contact " + name + " does not exist!");

                }
            }

        }
    }
}