import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) < 0) {
            myContacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        if (findContact(oldContact) >= 0) {
            myContacts.set(findContact(oldContact), newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact theContact) {

        if (findContact(theContact) >= 0) {
            myContacts.remove(theContact);
            return true;
        } else {
            return false;
        }
    }

    private int findContact(Contact theContact) {

        if (myContacts.contains(theContact)) {
            return myContacts.indexOf(theContact);
        } else {
            return -1;
        }
    }

    public Contact queryContact(String theContactName) {

        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName() == theContactName) {
                return myContacts.get(i);
            }
        }

        return null;
    }

    private int findContact(String theContactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName() == theContactName) {
                return i;
            }
        }
        return -1;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for(int i = 0; i < myContacts.size(); i++) {
            System.out.println(i + 1 + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}