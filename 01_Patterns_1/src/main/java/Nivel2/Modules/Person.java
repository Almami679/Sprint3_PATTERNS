package Nivel2.Modules;

import java.util.ArrayList;

public class Person <T> {

    private String name;
    private ArrayList<T> data;

    public Person(String name) {
        this.name = name;
        this.data = new ArrayList<>();
    }

    public void addData(T phone, T address) {
        this.data.add(phone);
        this.data.add(address);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "- " + this.name + "\n Phone: " + this.data.getFirst().toString() +
                "\n Address: " + this.data.getLast().toString();
    }
}
