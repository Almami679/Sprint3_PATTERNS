package Nivel2.Main;


import Nivel2.Modules.DataFactory;
import Nivel2.Modules.Person;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Person> contacts = new ArrayList<Person>();
    public static DataFactory mainFactory;
    public static boolean exit = false;

    public static void main(String[] args) {

        do {
            Screen.menuLogic(Screen.printMenu());
        } while (!exit);



        //https://www.youtube.com/watch?v=VgFWKtaRAkU&ab_channel=UnProgramadorNace

    }
}