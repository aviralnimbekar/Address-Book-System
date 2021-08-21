package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Purpose - Providing option to user to access different operations
 */
class OptionMenu extends AddOrRemove {

    public ArrayList<Contact> operation() {

        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        while (run) {

            System.out.println("\nWhat would u like to do with contacts? \n" +
                    "1. ADD     \n" +
                    "2. DISPLAY \n" +
                    "3. EDIT    \n" +
                    "4. REMOVE  \n" +
                    "0. EXIT    \n");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ArrayList contactList = addPerson();
                    break;

                case 2:
                    displayPerson();
                    break;

                case 3:
                    editPerson();
                    break;

                case 4:
                    removePerson();
                    break;

                default:
                    run = false;
            }
        }
        return contactList;
    }
}

/**
 * Purpose - create new Address Book
 */
class MultipleBooks {

    public void crateBook() {

        HashMap<String, ArrayList<Contact>> bookList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            OptionMenu option = new OptionMenu();

            System.out.println("\nWhat would you like to do? \n" +
                    "1. Crate new address book \n" +
                    "2. Continue with existing address book \n" +
                    "3. All books \n" +
                    "0. EXIT");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter name for Address book");
                    String addBookName = scanner.next();

                    bookList.put(addBookName, option.operation());
                    break;

                case 2:
                    System.out.println(bookList.keySet());

                    System.out.println("Which address book do you want to access?");
                    String key = scanner.next();

                    if (bookList.containsKey(key)) {

                        ArrayList<Contact> existingBook = bookList.get(key);
                        ArrayList contactList = option.operation();
                        contactList.add(contactList.size(), existingBook);
                        bookList.put(key, contactList);

                    } else {
                        System.out.println("Book not found");
                    }
                    break;

                case 3:
                    int i = 1;
                    for (String book : bookList.keySet()) {
                        System.out.println(i + ". " + book);
                        i++;
                    }

                    System.out.println("\n" + bookList);

                    break;

                default:
                    System.exit(0);
            }
        }
    }
}