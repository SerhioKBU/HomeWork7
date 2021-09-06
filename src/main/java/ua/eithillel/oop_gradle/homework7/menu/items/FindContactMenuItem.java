package ua.eithillel.oop_gradle.homework7.menu.items;

import lombok.RequiredArgsConstructor;
import ua.eithillel.oop_gradle.homework7.menu.ContactView;
import ua.eithillel.oop_gradle.homework7.menu.MenuItem;
import ua.eithillel.oop_gradle.homework7.models.Contact;
import ua.eithillel.oop_gradle.homework7.services.ContactService;


import java.util.List;
import java.util.Scanner;

@RequiredArgsConstructor
public class FindContactMenuItem extends MenuItem {
    private final ContactService contactService;
    private final ContactView contactView;
    private final Scanner scanner;

    @Override
    public String getName() {
        return "Find contact name";
    }

    @Override
    public void run() {
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        List<Contact> contacts = contactService.findContactName(name);
        contactView.writeFindNameContacts(contacts);
    }
}
