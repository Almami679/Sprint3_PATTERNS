package Nivel2.Main;

import Nivel2.Modules.Factories.FrenchDataFactory;
import Nivel2.Modules.Factories.GermanyDataFactory;
import Nivel2.Modules.Factories.ItalyDataFactory;
import Nivel2.Modules.Factories.SpainDataFactory;
import Nivel2.Modules.Person;
import Nivel2.Products.Address;
import Nivel2.Products.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static Nivel2.Main.Main.*;
import static Nivel2.Main.Main.contacts;


public class DataLogic {

    public static void chooseCountry() {
        System.out.println("""
                Choose Country
                [1]Spain           [2]Italy
                [3]Germany         [4]France
                """);
        int option = input.nextInt();
        switch (option) {
            case 1:
                mainFactory = new SpainDataFactory();
                break;
            case 2:
                mainFactory = new ItalyDataFactory();
                break;
            case 3:
                mainFactory = new GermanyDataFactory();
                break;
            case 4:
                mainFactory = new FrenchDataFactory();
                break;
            default:
                System.out.println("Option Invalid, please try again");
        }
        input.nextLine();
    }

    public static void deleteContact() {
        int option = -1;
        if (checkContacts()) {
            System.out.println("No Contacts to Show");
            System.out.println("Which one do you want to delete");
            contacts.forEach(contact -> System.out.println(
                    "[" + contacts.indexOf(contact) + 1 + "] "
                            + contact.getName()));
            option = input.nextInt() -1;
            while(!(option < contacts.size()) || !(option > 0)) {
                System.out.println("Number out of range, please try again");
                option = input.nextInt();
            }
            System.out.println("Contact " + contacts.get(option).getName() + " has been deleted.");
            contacts.remove(option);
        }
    }

    public static boolean checkContacts() {
        boolean output = false;
        if (contacts.isEmpty()) {
            System.out.println("No Contacts to Show");
        } else {
            output = true;
        }
        return output;
    }

    public static void printAll() {
        if (checkContacts()) {
            contacts.forEach(System.out::println);
        }
    }

    public static void orderByAz() {
        contacts.sort(Comparator.comparingInt(contact -> contact.getName().charAt(0)));

    }

    private static Phone newPhoneNumber(String phoneNumber) {
        return mainFactory.createPhone(phoneNumber);
    }

    private static Address newAddress(ArrayList<String> dataAddress) {
        return mainFactory.createAddress(dataAddress.get(0), dataAddress.get(1),
                                            dataAddress.get(2), dataAddress.get(3));
    }

    private static ArrayList<String> askDataAddress() {
        ArrayList<String> dataAddress = new ArrayList<>();
        System.out.println(("What is the name of the street?"));
        dataAddress.add(input.nextLine());
        System.out.println("What additional information needs to be added?\n" +
                "(number, floor, staircase...)");
        dataAddress.add(input.nextLine());
        System.out.println("What is the name of the city?");
        dataAddress.add(input.nextLine());
        System.out.println("What is the zip code?");
        dataAddress.add(input.nextLine());
        return dataAddress;
    }

    public static void newContact() {
        char option = 0;
        ArrayList<Character> options = new ArrayList<Character>(Arrays.asList('n', 'y'));
        String message = "";
        ///
        System.out.println("Whrite a name");
        contacts.add(new Person<>(input.nextLine()));
        System.out.println("Whrite a Phone number");
        Phone phone = newPhoneNumber(input.nextLine());
        do {
            System.out.println("Do you want to insert addres for contact "
                    + contacts.getLast().getName() + "?\n[Y]es      [N]o");
            option = input.nextLine().toLowerCase().charAt(0);

            switch(option) {
                case 'y':
                    Address address = newAddress(askDataAddress());
                    contacts.getLast().addData(phone, address);
                    message = "Contact " + contacts.getLast().getName() +
                            " created with phone number and address";
                    break;
                case 'n':
                    contacts.getLast().addData(phone, "No address assigned to the contact");
                    message = "Contact " + contacts.getLast().getName() +
                                                                   " created only with phone number";
                    break;
                default:
                    System.out.println("Option invalid, please try again.");

            }
        } while(!options.contains(option));
        System.out.println(message);
    }



}
