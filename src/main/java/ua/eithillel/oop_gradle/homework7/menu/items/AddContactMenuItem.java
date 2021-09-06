package ua.eithillel.oop_gradle.homework7.menu.items;


import ua.eithillel.oop_gradle.homework7.menu.MenuItem;
import ua.eithillel.oop_gradle.homework7.models.Contact;
import ua.eithillel.oop_gradle.homework7.services.ContactService;

import java.util.Scanner;

public class AddContactMenuItem extends MenuItem {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    Scanner scanner;
    ContactService contactService;

    public AddContactMenuItem(Scanner scanner, ContactService contactService) {
        this.scanner = scanner;
        this.contactService = contactService;
    }

    @Override
    public String getName() {
        return "Add New Contact";
    }

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Enter contact name: " + ANSI_RESET);
        String name = scanner.nextLine();
        System.out.println(ANSI_CYAN + "Enter contact number: " + ANSI_RESET);
        String number = scanner.nextLine();
        contactService.addContact(new Contact(name, number));
    }
}
