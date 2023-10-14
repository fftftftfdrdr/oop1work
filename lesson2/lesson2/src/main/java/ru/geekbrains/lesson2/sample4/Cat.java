package ru.geekbrains.lesson2.sample4;


public class Cat {
    private String name;
    private int appetite;
    private int satiety;
    private int MaxSatiety;
    public Cat(String name, int appetite, int satiety, int MaxSatiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
        this.MaxSatiety = MaxSatiety;
    }

    public String getName() {
        return name;
    }

    public void eat(int satiety, int MaxSatiety, int food, int appetite){
        if (satiety == 0 & food >= MaxSatiety){
            satiety = satiety + food - appetite;
            food -= appetite;
            System.out.format("Котик наелся:)");
        }
        else {
        System.out.println("Слишком мало еды, котик огорчен("); 
        }
    }
}
