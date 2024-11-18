package Nivel2.Products.Phones;

import Nivel2.Products.Phone;

public class SpainPhone implements Phone {

    private final String PREFIX = "+34 ";
    private String phoneNumber;

    public SpainPhone(String phone) {
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
