package ua.eithillel.oop_gradle.homework7.menu.items;

import ua.eithillel.oop_gradle.homework7.menu.ContactView;
import ua.eithillel.oop_gradle.homework7.menu.MenuItem;
import ua.eithillel.oop_gradle.homework7.services.ContactService;

public class DeleteContactMenuItem extends MenuItem {
    ContactService contactService;
    ContactView contactView;

    public DeleteContactMenuItem(ContactService contactService, ContactView contactView) {
        this.contactService = contactService;
        this.contactView = contactView;
    }

    @Override
    public String getName() {
        return "Remove The Contact";
    }

    @Override
    public void run() {
        contactService.removeContact(contactView.deleteContact());
        System.out.println("------------------");
    }
}



