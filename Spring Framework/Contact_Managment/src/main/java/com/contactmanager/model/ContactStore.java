package com.contactmanager.model;

import java.util.ArrayList;
import java.util.List;

public class ContactStore {
    private static List<Contact> contacts = new ArrayList<>();

    public static void addContact(Contact contact) {
        contacts.add(contact);
    }

    public static List<Contact> getContacts() {
        return contacts;
    }
}
