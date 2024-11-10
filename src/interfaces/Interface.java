package interfaces;

import domain.Contact;
import domain.Contactbook;

public class Interface {
    private Contactbook contactbook;

    public Interface() {
        contactbook = new Contactbook();
    }

    public void processPetition(String statement) {
        String[] parts = statement.split(" ");
        if (parts[0].equals("add") && parts.length == 3) {
            String name = parts[1];
            String phoneNumber = parts[2];
            contactbook.addContact(new Contact(name, phoneNumber));
            System.out.println("Contact added: " + name);
        } else if (parts[0].equals("list")) {
            System.out.println(contactbook.toString());
        } else {
            System.out.println("Invalid command");
        }
    }
}

