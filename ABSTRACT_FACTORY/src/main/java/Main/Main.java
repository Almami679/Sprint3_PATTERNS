package Main;

import factories.GalaClothesFactory;
import factories.SportClothesFactory;
import products.shirt.GalaShirt;
import products.shirt.SportShirt;
import products.shoes.GalaShoe;
import products.shoes.SportShoe;
import products.trousers.GalaTrousers;
import products.trousers.SportTrousers;

public class Main {
    public static void main(String[] args) {
        // Fabrica de ropa deportiva
        ClothesFactory sportClothesFactory = new SportClothesFactory();

        SportShirt sportShirt = (SportShirt) sportClothesFactory.createShirt();
        SportShoe sportShoe = (SportShoe) sportClothesFactory.createShoes();
        SportTrousers sportTrousers = (SportTrousers) sportClothesFactory.createTrousers();

        System.out.println("\n---> Ejemplo de ropa deportiva <---");
        sportShirt.hasButtons();
        sportTrousers.getClosureType();
        sportShoe.isRunningShoes();

        // Fabrica de ropa de gala
        ClothesFactory galaClothesFactory = new GalaClothesFactory();

        GalaShirt galaShirt = (GalaShirt) galaClothesFactory.createShirt();
        GalaTrousers galaTrousers = (GalaTrousers) galaClothesFactory.createTrousers();
        GalaShoe galaShoe = (GalaShoe) galaClothesFactory.createShoes();

        System.out.println("\n---> Ejemplo de ropa de gala <---");
        galaShirt.hasButtons();
        galaTrousers.getClosureType();
        galaShoe.isRunningShoes();
    }
}
