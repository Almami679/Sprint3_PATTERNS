package Nivel3.Main;

import Nivel3.Command.ActionInvoker;
import Nivel3.Modules.Bicycle;
import Nivel3.Modules.Car;
import Nivel3.Modules.Plane;
import Nivel3.Modules.Ship;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static Nivel3.Main.Main.mainInvoker;
import static Nivel3.Main.Main.exit;
import static Nivel3.Main.ScreenArt.printWindow;

public class Logic {

    private static final Scanner input = new Scanner(System.in);

    public static int selectVehicle() {
        ArrayList<Integer> posiblesOptions = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int vehicle = 0;
        do {
            System.out.println("What vehicle do you want to use?\n" +
                    "[1] Ship     [2] Car      [3] Bicycle    [4] Plane");
            vehicle = input.nextInt();
            switch (vehicle) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid option, please try again");
            }
        } while (!posiblesOptions.contains(vehicle));
        input.nextLine();
        return vehicle;
    }

    public static ActionInvoker selectInvoker(int vehicle) {
        ActionInvoker mainInvoker = new ActionInvoker(new Plane());
        if (vehicle == 1) {
            mainInvoker = new ActionInvoker(new Ship());
        } else if (vehicle == 2) {
            mainInvoker = new ActionInvoker(new Car());
        } else if (vehicle == 3) {
            mainInvoker = new ActionInvoker(new Bicycle());

        }
        return mainInvoker;
    }

    public static void pressKey() {
        char key = input.next().trim().toLowerCase().charAt(0);
        if (key == 'q'){
            exit = true;
        } else if (key == 'r') {
            int mainVehicle = selectVehicle();
            mainInvoker = selectInvoker(mainVehicle);
        } else {
            mainInvoker.action(key);
        }
    }

    public static void ClsScreen() throws IOException, InterruptedException {
        
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
    }



