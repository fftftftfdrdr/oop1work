package ru.geekbrains.lesson7.observer;

public interface Publisher {

    void sendOffer(Vacation vacation);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

}
