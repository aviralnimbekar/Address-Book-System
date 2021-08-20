package com.bridgelabz;

import java.util.Scanner;

/**
 * Purpose - Manipulate contact i.e. add edit of delete
 */
class AddOrRemove {

    Scanner scanner = new Scanner(System.in);
    Contact contact = new Contact();

    /**
     * Purpose - Adding new contacts into the list
     */
    public void addPerson() {

        System.out.println("Enter following details \n" +
                "First Name :");
        String firstName = scanner.nextLine();
        System.out.println("Last Name :");
        String lastName = scanner.nextLine();
        System.out.println("Address :");
        String address = scanner.nextLine();
        System.out.println("City :");
        String city = scanner.nextLine();
        System.out.println("State :");
        String state = scanner.nextLine();
        System.out.println("Zip Code :");
        int zip = scanner.nextInt();
        System.out.println("Phone Number :");
        long phoneNo = scanner.nextLong();
        System.out.println("Email :");
        String email = scanner.next();

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhoneNo(phoneNo);
        contact.setEmail(email);
    }

    /**
     * Purpose - Display all saved contacts
     */
    public void displayPerson() {

        System.out.println("First Name   : " + contact.getFirstName());
        System.out.println("Last Name    : " + contact.getLastName());
        System.out.println("Address      : " + contact.getAddress());
        System.out.println("City         : " + contact.getCity());
        System.out.println("State        : " + contact.getState());
        System.out.println("Zip code     : " + contact.getZip());
        System.out.println("Phone Number : " + contact.getPhoneNo());
        System.out.println("Email ID     : " + contact.getEmail());
    }

    /**
     * Purpose - Editing existing contact
     */
    public void editPerson() {

        System.out.println("What do you want to edit \n" +
                "1. First Name / 2. Last Name / 3. Address / 4. City / 5. State / 6. Zip code / 7. Phone Number / 8. Email");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter new First Name");
                String newFirstName = scanner.next();
                contact.setFirstName(newFirstName);
                break;

            case 2:
                System.out.println("Enter new Last Name");
                String newLastName = scanner.next();
                contact.setLastName(newLastName);
                break;

            case 3:
                System.out.println("Enter new Address");
                String newAddress = scanner.next();
                contact.setAddress(newAddress);
                break;

            case 4:
                System.out.println("Enter new City");
                String newCity = scanner.next();
                contact.setCity(newCity);
                break;

            case 5:
                System.out.println("Enter new State");
                String newState = scanner.next();
                contact.setState(newState);
                break;

            case 6:
                System.out.println("Enter new Zip code");
                int newZip = scanner.nextInt();
                contact.setZip(newZip);
                break;

            case 7:
                System.out.println("Enter new Phone Number");
                long newPhoneNo = scanner.nextLong();
                contact.setPhoneNo(newPhoneNo);
                break;

            case 8:
                System.out.println("Enter new Email");
                String newEmail = scanner.next();
                contact.setEmail(newEmail);
                break;
        }
    }

    /**
     * Purpose - Remove existing contact
     */
    public void removePerson() {
        contact.setFirstName(null);
        contact.setLastName(null);
        contact.setAddress(null);
        contact.setCity(null);
        contact.setState(null);
        contact.setZip(0);
        contact.setPhoneNo(0);
        contact.setEmail(null);
    }
}