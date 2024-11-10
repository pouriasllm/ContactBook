package domain;

import java.util.ArrayList;

public class Contactbook {
    private ArrayList<Contact> contacts;

    public Contactbook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }


    public String toString() {
        StringBuilder allContacts = new StringBuilder("Contact List:\n");
        for (Contact contact : contacts) {
            allContacts.append(contact.toString()).append("\n");
        }
        return allContacts.toString();
    }
}
