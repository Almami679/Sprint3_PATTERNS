package Nivel2.Modules.Factories;

import Nivel2.Modules.DataFactory;
import Nivel2.Products.Address;
import Nivel2.Products.Addresses.GermanAddress;
import Nivel2.Products.Phone;
import Nivel2.Products.Phones.GermanPhone;


public class GermanyDataFactory implements DataFactory {

    @Override
    public Address createAddress(String address1, String address2, String city, String cp) {
        return new GermanAddress(address1, address2, city, cp);
    }

    @Override
    public Phone createPhone(String phone) {
        return new GermanPhone(phone);
    }
}
