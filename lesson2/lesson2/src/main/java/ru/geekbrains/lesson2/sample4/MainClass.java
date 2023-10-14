package ru.geekbrains.lesson2.sample4;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Компот", 75, 0, 75);
        Cat cat2 = new Cat("Коржик", 50, 0, 50);
        Cat cat3 = new Cat("Карамелька", 35, 0,35);
        Plate plate1 = new Plate(200,200);
        

        plate1.info(200, 200);
        cat1.eat(0, 75, 100, 75);

        

        Cat[] cats = new Cat[3];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;

        printResults(plate1,cats);
    }

    public static void printResults(Plate plate1, Cat[] cats){
        for (Cat kot: cats) {
            plate1.info(200, 200);
            kot.getName();
            kot.eat(0, 50, 100, 50);

            
            
        }
    
        
    }


        
   

    
}