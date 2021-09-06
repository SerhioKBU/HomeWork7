package ua.eithillel.oop_gradle.homework7.services;


import ua.eithillel.oop_gradle.homework7.models.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class InMemoryContactsService implements ContactService {
    List<Contact> contacts = new ArrayList<>();

    @Override
    public List<Contact> showAllContacts() {
        return contacts;
    }

//    Function<String, List> function = new Function<>(){
//
//        @Override
//        public List<Contact> apply(String name) {
//            List<Contact> findNameResult = new ArrayList<>();
//        for (Contact contact: contacts) {
//            if(contact.getName().startsWith(name)) {
//                findNameResult.add(contact);
//            }
//        }
//        return findNameResult;
//        }
//    };


    @Override
    public List<Contact> findContactName(String name) {
        List<Contact> findNameResult = new ArrayList<>();
        for (Contact contact: contacts) {
            if(contact.getName().startsWith(name)) {
                findNameResult.add(contact);
            }
        }
        return findNameResult;
    }

    @Override
    public void removeContact(int index) {
        contacts.remove(index);
    }

    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }
}

