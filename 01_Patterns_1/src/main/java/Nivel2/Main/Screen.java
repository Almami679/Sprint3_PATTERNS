package Nivel2.Main;


import static Nivel2.Main.Main.*;


public class Screen {

    public static String frame = "-------------------------------------------\n" +
            "----------------- CONTACTS ----------------\n" +
            "-------------------------------------------\n";

    public static void printMenu() {
        System.out.println(frame +
                "[1]New Contact            [2]Delete Contact\n" +
                "[3]View All Contacts      [4]Exit\n");

    }



}
