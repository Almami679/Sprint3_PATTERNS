package Nivel2.Products.Phones;

import Nivel2.Products.Phone;

public class FrenchPhone implements Phone {

    private final String PREFIX = "+33 ";
    private String phoneNumber;

    public FrenchPhone(String phone) {
        this.phoneNumber = phone;
    }

    @Override
    public String toString() {
        return PREFIX + this.phoneNumber;
    }

    @Override
    public void setPhone(String phone) {
        this.phoneNumber = phone;
    }
}
