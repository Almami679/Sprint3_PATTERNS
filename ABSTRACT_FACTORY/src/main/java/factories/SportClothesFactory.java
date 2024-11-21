package factories;

import Main.ClothesFactory;
import products.Shirt;
import products.Shoe;
import products.Trousers;
import products.shirt.SportShirt;
import products.shoes.SportShoe;
import products.trousers.SportTrousers;

public class SportClothesFactory implements ClothesFactory {

    @Override
    public Shoe createShoes() {
        return new SportShoe();
    }

    @Override
    public Shirt createShirt() {
        return new SportShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new SportTrousers();
    }
}