package ua.eithillel.oop_gradle.homework7.services;


import ua.eithillel.oop_gradle.homework7.models.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> showAllContacts();
    List<Contact> findContactName(String name);
    void removeContact(int index);
    void addContact(Contact contact);
}
