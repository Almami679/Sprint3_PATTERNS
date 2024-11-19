package Nivel3.Main;

import Nivel3.Command.ActionInvoker;

import java.io.IOException;

import static Nivel3.Main.Logic.*;
import static Nivel3.Main.ScreenArt.printWindow;

public class Main {

    public static ActionInvoker mainInvoker;
    public static boolean exit = false;

    public static void main (String[] args) {

        int mainVehicle = selectVehicle();
        mainInvoker = selectInvoker(mainVehicle);

        do {
            printWindow(mainVehicle);
            pressKey();
            try {
                Thread.sleep(2008);
                Logic.ClsScreen();
            } catch (InterruptedException | IOException e) {
                System.out.println(e.getMessage());
            }

        } while(!exit);



////https://www.youtube.com/watch?v=Tvd7tR7TKIY&ab_channel=LuigiCode



    }
}
