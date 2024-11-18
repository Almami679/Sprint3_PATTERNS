package Nivel2.Products.Phones;

import Nivel2.Products.Phone;

public class ItalyPhone implements Phone {

    private final String PREFIX = "+39 ";
    private String phoneNumber;

    public ItalyPhone(String phone) {
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
