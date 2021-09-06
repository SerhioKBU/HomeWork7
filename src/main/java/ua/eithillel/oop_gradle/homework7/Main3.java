package ua.eithillel.oop_gradle.homework7;


import ua.eithillel.oop_gradle.homework7.menu.ContactView;
import ua.eithillel.oop_gradle.homework7.menu.Menu;
import ua.eithillel.oop_gradle.homework7.menu.MenuItem;
import ua.eithillel.oop_gradle.homework7.menu.items.*;
import ua.eithillel.oop_gradle.homework7.services.ContactService;
import ua.eithillel.oop_gradle.homework7.services.InMemoryContactsService;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContactService contactService = new InMemoryContactsService();
        ContactView contactView = new ContactView(scanner);
        List<MenuItem> menuItemList = Arrays.asList(
                new AddContactMenuItem(scanner, contactService),
                new ShowContactsMenuItem(contactService, contactView),
                new DeleteContactMenuItem(contactService, contactView),
                new FindContactMenuItem(contactService, contactView, scanner),
                new SaveFileContactsMenuItem(contactService, contactView)
        );
        Menu menu = new Menu(scanner, menuItemList);
        menu.makeMenu();
    }
}
