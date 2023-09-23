package ru.geekbrains.lesson1;

public class ChocolateBar extends Product{

    private int mass; // вес
    private int type; // тип

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public ChocolateBar(String brand, String name, double price, int mass, int type) {
        super(brand, name, price);
        this.mass = mass;
        this.type = type;

    }

    @Override
    public  String displayInfo() {
        return String.format("[ШОКОЛАДКА] %s - %s - %.2f - вес: %d; тип: %d",
                brand, name, price, mass, type);
    }
}