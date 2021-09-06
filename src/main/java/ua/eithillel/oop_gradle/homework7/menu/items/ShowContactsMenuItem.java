package ua.eithillel.oop_gradle.homework7.menu.items;


import ua.eithillel.oop_gradle.homework7.menu.ContactView;
import ua.eithillel.oop_gradle.homework7.menu.MenuItem;
import ua.eithillel.oop_gradle.homework7.models.Contact;
import ua.eithillel.oop_gradle.homework7.services.ContactService;

import java.util.List;

public class ShowContactsMenuItem extends MenuItem {
    ContactService contactService;
    ContactView contactView;

    public ShowContactsMenuItem(ContactService contactService, ContactView contactView) {
        this.contactService = contactService;
        this.contactView = contactView;
    }

    @Override
    public String getName() {
        return "Show Contacts List";
    }

    @Override
    public void run() {
        List<Contact> contacts = contactService.showAllContacts();
        contactView.writeContacts(contacts);
    }
}
