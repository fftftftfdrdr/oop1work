package ru.geekbrains.lesson2.sample4;

public class Plate {
    private int food;
    private int MaxFood;
    public Plate(int food, int MaxFood) {
        this.food = food;
        this.MaxFood = MaxFood;
    }
    public void info(int food, int MaxFood) {
        System.out.println("plate: " + food);
    }
}