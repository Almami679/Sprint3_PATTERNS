package Nivel2.Products.Addresses;

import Nivel2.Products.Address;

public class FrenchAddress implements Address {

    private final String country = "France";
    private String address1;
    private String address2;
    private String city;
    private String cp;

    public FrenchAddress(String address1, String address2, String city, String cp) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.cp = cp;
    }
    @Override
    public String toString() {
        return "C/" + address1 + ", " + address2 + "\n-- " + cp + " -- " + city + ", [" + country + "]";
    }

    @Override
    public void setAddress(String address1, String address2, String city, String cp) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.cp = cp;
    }
}
