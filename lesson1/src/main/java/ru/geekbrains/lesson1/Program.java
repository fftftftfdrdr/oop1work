package ru.geekbrains.lesson1;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Product("ООО Источник", "_", -100);
        //product1.brand = "ООО Источник";
        //product1.name = "_";
        //product1.price = -100;
        product1.setName("43");
        System.out.println(product1.displayInfo());


        Product product2 = new Product();
        System.out.println(product2.displayInfo());


        Product product3 = new Product("Бутылка с водой (3)", 50);
        System.out.println(product3.displayInfo());

        Product bottleOfMilk1 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (1)", 150, 2, 15);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("ООО Источник", "Бутылка с водой (5)", 150, 2, 15);
        System.out.println(bottleOfWater1.displayInfo());

        Product chocolatebar1 = new ChocolateBar("ООО Матрешка", "Шоколадка (1)", 100, 110, 1);
        System.out.println(chocolatebar1.displayInfo());


        Product bottleOfMilk2 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (2)", 110, 1, 15);
        Product bottleOfMilk3 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (3)", 160, 2, 25);
        Product bottleOfMilk4 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (4)", 170, 3, 35);
        Product chocolatebar2 = new ChocolateBar("ООО Матрешка", "Шоколадка (2)", 120, 110, 2);
        Product chocolatebar3 = new ChocolateBar("ООО Матрешка", "Шоколадка (3)", 150, 110, 3);

        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(bottleOfMilk1);
        arrayList.add(bottleOfWater1);
        arrayList.add(chocolatebar1);
        arrayList.add(chocolatebar2);
        arrayList.add(chocolatebar3);
        arrayList.add(bottleOfMilk2);
        arrayList.add(bottleOfMilk3);
        arrayList.add(bottleOfMilk4);

        VendingMachine vendingMachine = new VendingMachine(arrayList);

        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk("Бутылка с молоком (3)", 2);
        if (bottleOfMilk != null){
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilk.displayInfo());
            System.out.println("И");
            System.out.println(chocolatebar2.displayInfo());
        }
        else {
            System.out.println("Такого товара нет в автомате.");
        }
     

    }

}
