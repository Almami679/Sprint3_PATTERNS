package Nivel2.Main;

import Nivel2.Modules.Person;

import static Nivel2.Main.Main.*;


public class Screen {

    public static String frame = "-------------------------------------------\n" +
            "----------------- CONTACTS ----------------\n" +
            "-------------------------------------------\n";

    public static int printMenu() {
        System.out.println(frame +
                "[1]New Contact            [2]Delete Contact\n" +
                "[3]View All Contacts      [4]Exit\n");
        return input.nextInt();
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

}
