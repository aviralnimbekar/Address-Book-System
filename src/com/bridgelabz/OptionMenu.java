package com.bridgelabz;

import java.util.Scanner;

/**
 * Purpose - Providing option to user to access different operations
 */
public class OptionMenu {

    public void menu() {

        Scanner sc = new Scanner(System.in);
        AddOrRemove addOrRemove = new AddOrRemove();

        while (true) {

            System.out.println("\nWhat would u like to do? \n" +
                    "1. Add contact \n" +
                    "2. Display contact \n" +
                    "3. Edit contact \n" +
                    "4. Remove contact \n" +
                    "0. Exit \n");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addOrRemove.addPerson();
                    break;

                case 2:
                    addOrRemove.displayPerson();
                    break;

                case 3:
                    addOrRemove.editPerson();
                    break;

                case 4:
                    addOrRemove.removePerson();
                    break;

                default:
                    System.exit(0);
                    break;
            }
        }
    }
}
