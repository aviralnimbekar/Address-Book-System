package com.bridgelabz;

/**
 * Purpose - Simulation of address book program
 *
 * @author - Aviral N
 * @version - 1.3
 * date     - 21-08-2021
 */
public class AddressBook {

    /**
     * Purpose - Execution of all methods
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        MultipleBooks book = new MultipleBooks();
        book.crateBook();
    }
}