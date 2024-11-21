package factories;

import Main.ClothesFactory;
import products.Shirt;
import products.Shoe;
import products.Trousers;
import products.shirt.GalaShirt;
import products.shoes.GalaShoe;
import products.trousers.GalaTrousers;

public class GalaClothesFactory implements ClothesFactory {

    @Override
    public Shoe createShoes() {
        return new GalaShoe();
    }

    @Override
    public Shirt createShirt() {
        return new GalaShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new GalaTrousers();
    }
}