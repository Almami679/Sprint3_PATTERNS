package Nivel2.Main;

import Nivel2.Main.Exceptions.ContactsEmpty;
import Nivel2.Modules.DataFactory;
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
import java.util.Scanner;
import static Nivel2.Main.Screen.frame;


public class DataLogic {

    private static final Scanner INPUT = new Scanner(System.in);
    private static final ArrayList<Person> CONTACTS = new ArrayList<Person>();
    private static DataFactory mainFactory;
    private static boolean exit = false;

    public static void chooseCountry() {
        System.out.println("""
                Choose Country
                [1]Spain           [2]Italy
                [3]Germany         [4]France
                """);
        int option = INPUT.nextInt();
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
        INPUT.nextLine();
    }

    public static void deleteContact() {
        int option = -1;
        if (checkContacts()) {
            System.out.println("No Contacts to Show");
            System.out.println("Which one do you want to delete");
            CONTACTS.forEach(contact -> System.out.println(
                    "[" + (CONTACTS.indexOf(contact) + 1) + "] "
                            + contact.getName()));
            option = INPUT.nextInt() -1;
            while(!(option < CONTACTS.size()) || !(option > 0)) {
                System.out.println("Number out of range, please try again");
                option = INPUT.nextInt();
            }
            System.out.println("Contact " + CONTACTS.get(option).getName() + " has been deleted.");
            CONTACTS.remove(option);
        }
    }

    public static boolean checkContacts() throws ContactsEmpty {
        boolean output = false;
        if (CONTACTS.isEmpty()) {
            throw new ContactsEmpty("Contacts is empty");
        } else {
            output = true;
        }
        return output;
    }

    public static void printAll() {
        try {
            if (checkContacts()) {
                CONTACTS.forEach(System.out::println);
            }
        } catch (ContactsEmpty e) {
            System.out.println(e.getMessage());
        }
    }

    public static void orderByAz() {
        CONTACTS.sort(Comparator.comparingInt(contact -> contact.getName().charAt(0)));

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
        dataAddress.add(INPUT.nextLine());
        System.out.println("What additional information needs to be added?\n" +
                "(number, floor, staircase...)");
        dataAddress.add(INPUT.nextLine());
        System.out.println("What is the name of the city?");
        dataAddress.add(INPUT.nextLine());
        System.out.println("What is the zip code?");
        dataAddress.add(INPUT.nextLine());
        return dataAddress;
    }

    public static void newContact() {
        char option = 0;
        ArrayList<Character> options = new ArrayList<Character>(Arrays.asList('n', 'y'));
        String message = "";
        System.out.println("Whrite a name");
        CONTACTS.add(new Person<>(INPUT.nextLine()));
        System.out.println("Whrite a Phone number");
        Phone phone = newPhoneNumber(INPUT.nextLine());
        do {
            System.out.println("Do you want to insert addres for contact "
                    + CONTACTS.getLast().getName() + "?\n[Y]es      [N]o");
            option = INPUT.nextLine().toLowerCase().charAt(0);

            switch(option) {
                case 'y':
                    Address address = newAddress(askDataAddress());
                    CONTACTS.getLast().addData(phone, address);
                    message = "Contact " + CONTACTS.getLast().getName() +
                            " created with phone number and address";
                    break;
                case 'n':
                    CONTACTS.getLast().addData(phone, "No address assigned to the contact");
                    message = "Contact " + CONTACTS.getLast().getName() +
                                                                   " created only with phone number";
                    break;
                default:
                    System.out.println("Option invalid, please try again.");

            }
        } while(!options.contains(option));
        System.out.println(message);
    }

    public static int askOption() {
        return INPUT.nextInt();
    }

    public static void menuLogic(int option) {

        switch(option){
            case 1:
                System.out.println(frame);
                DataLogic.chooseCountry();
                DataLogic.newContact();

                break;
            case 2:
                DataLogic.orderByAz();
                DataLogic.deleteContact();
                break;
            case 3:
                DataLogic.orderByAz();
                DataLogic.printAll();
                break;
            case 4:
                exit = true;
                break;
            default:
                System.out.println("Option Invalid, please try again");

        }
    }

    public static void innitMenu(){

        do {
            Screen.printMenu();
            DataLogic.menuLogic(DataLogic.askOption());
        } while (!exit);
    }



}
