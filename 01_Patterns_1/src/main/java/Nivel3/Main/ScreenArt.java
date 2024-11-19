package Nivel3.Main;


public class ScreenArt {

    private static String artPlane = "         __/\\__\n" +
            "           `==/\\==`\n" +
            " ____________/__\\____________\n" +
            "/____________________________\\\n" +
            "  __||__||__/.--.\\__||__||__\n" +
            " /__|___|___( >< )___|___|__\\\n" +
            "           _/`--`\\_\n" +
            "          (/------\\)";

    private static String artCar = "        __-------__\n" +
                                   "      / _---------_ \\\n" +
            "     / /           \\ \\\n" +
            "     | |           | |\n" +
            "     |_|___________|_|\n" +
            " /-\\|                 |/-\\\n" +
            "| _ |\\       0       /| _ |\n" +
            "|(_)| \\      !      / |(_)|\n" +
            "|___|__\\_____!_____/__|___|\n" +
            "[_________|J-AVA|_________] \n" +
            " ||||    ~~~~~~~~     ||||\n" +
            " `--'                 `--'";

    private static String artBicylce = "                                $\"   *.      \n" +
            "              d$$$$$$$P\"                  $    J\n" +
            "                  ^$.                     4r  \"\n" +
            "                  d\"b                    .db\n" +
            "                 P   $                  e\" $\n" +
            "        ..ec.. .\"     *.              zP   $.zec..\n" +
            "    .^        3*b.     *.           .P\" .@\"4F      \"4\n" +
            "  .\"         d\"  ^b.    *c        .$\"  d\"   $         %\n" +
            " /          P      $.    \"c      d\"   @     3r         3\n" +
            "4        .eE........$r===e$$$$eeP    J       *..        b\n" +
            "$       $$$$$       $   4$$$$$$$     F       d$$$.      4\n" +
            "$       $$$$$       $   4$$$$$$$     L       *$$$\"      4\n" +
            "4         \"      \"\"3P ===$$$$$$\"     3                  P\n" +
            " *                 $       \"\"\"        b                J\n" +
            "  \".             .P                    %.             @\n" +
            "    %.         z*\"                      ^%.        .r\"\n" +
            "       \"*==*\"\"                             ^\"*==*\"\"";

    private static String artShip = "                  ~.\n" +
            "           Ya...___|__..aab     .   .\n" +
            "            Y88a  Y88o  Y88a   (     )\n" +
            "             Y88b  Y88b  Y88b   `.oo'\n" +
            "             :888  :888  :888  ( (`-'\n" +
            "    .---.    d88P  d88P  d88P   `.`.\n" +
            "   / .-._)  d8P'\"\"\"|\"\"\"'-Y8P      `.`.\n" +
            "  ( (`._) .-.  .-. |.-.  .-.  .-.   ) )\n" +
            "   \\ `---( O )( O )( O )( O )( O )-' /\n" +
            "    `.    `-'  `-'  `-'  `-'  `-'  .' \n" +
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

    public static void printWindow(int vehicle) {
        String mainVehicle = "";
        if (vehicle == 1) {
            mainVehicle = artShip;
        } else if(vehicle == 2) {
            mainVehicle = artCar;
        } else if(vehicle == 3) {
            mainVehicle = artBicylce;
        } else {
            mainVehicle = artPlane;
        }
        System.out.println("----------------------------------------------------\n" +
                mainVehicle + "\n" +
                "----------------------------------------------------\n" +
                "[I] Start Engine       [W] Accelerate      [S] Brake\n" +
                "[R] Return to select vehicle               [Q] quit");
    }

}
