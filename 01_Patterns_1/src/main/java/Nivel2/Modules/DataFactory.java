package Nivel2.Modules;

import Nivel2.Products.Address;
import Nivel2.Products.Phone;

public interface DataFactory {

    Address createAddress(String address1, String address2, String city, String cp);
    Phone createPhone(String phone);
}
