package Chapter8.Task44;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    ArrayList<Contact> myContacts;

    public boolean addNewContact(Contact newContact) {
        if (findContact(newContact.getName()) < 0)
            myContacts.add(newContact);
        return findContact(newContact.getName()) <   0;
    }

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    public boolean updateContact(Contact oldContact,Contact newContact) {
        if (findContact(oldContact) >= 0)
            myContacts.set(myContacts.indexOf(oldContact), newContact);
        return findContact(oldContact) >= 0;
    }

    public Contact queryContact(String nameContact) {
        return findContact(nameContact) >= 0 ? myContacts.get(findContact(nameContact)) : null;
    }

    private int findContact(String nameContact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(nameContact))
                return i;
        }
        return -1;
    }

    public void printContacts() {
        System.out.println("Contacts");
        for (int i = 0; i < myContacts.size(); i++)
            System.out.println(myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
    }
}
