package ru.geekbrains.lesson7.observer;

public class Junior implements Observer {

    private String name;
    private int salary = 80000;

    public Junior(String name) {
        this.name = name;
    }

    private Boolean checkCondition(Vacation vacation) {
        return this.salary <= vacation.getSalary();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Boolean receiveOffer(Vacation vacation) {
        if ( this.checkCondition(vacation) ) {
            System.out.printf("Рабочий %s: Я готов к работе! (желаемая заработная плата: %d)\n", name, salary);
            this.salary = vacation.getSalary();
            return true;
        }

        System.out.printf("Рабочий %s: Не, найду работу получше! (желаемая заработная плата: %d)\n", name, salary);
        return false;

    }
}
