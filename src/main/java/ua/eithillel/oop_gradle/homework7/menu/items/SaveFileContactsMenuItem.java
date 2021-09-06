package ua.eithillel.oop_gradle.homework7.menu.items;

import lombok.RequiredArgsConstructor;
import ua.eithillel.oop_gradle.homework7.menu.ContactView;
import ua.eithillel.oop_gradle.homework7.menu.MenuItem;
import ua.eithillel.oop_gradle.homework7.models.Contact;
import ua.eithillel.oop_gradle.homework7.services.ContactService;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
public class SaveFileContactsMenuItem extends MenuItem {
    private final ContactService contactService;
    private final ContactView contactView;

    @Override
    public String getName() {
        return "Save contacts to file";
    }

    @Override
    public void run() {
        List<Contact> contacts = contactService.showAllContacts();
        try {
            contactView.createFile(contacts);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
