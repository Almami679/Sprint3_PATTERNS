package Main;

import products.Shirt;
import products.Shoe;
import products.Trousers;

public interface ClothesFactory {

    Shoe createShoes();
    Shirt createShirt();
    Trousers createTrousers();
}
