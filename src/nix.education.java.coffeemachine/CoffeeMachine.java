package nix.education.java.coffeemachine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args){
        //Этап №1
        System.out.print("Starting to make a coffee\n" + "Grinding coffee beans\n" + "Boiling water\n" + "Mixing boiled water with crushed coffee beans\n" + "Pouring coffee into the cup\n" + "Pouring some milk into the cup\n" + "Coffee is ready!\n");

        //Этап №2
        Scanner cups = new Scanner(System.in);
        final int WATER = 200;
        final int MILK = 50;
        final int COFFEE_BEANS = 15;
        System.out.println("Write how many cups of coffee you will need:");
        int cup = cups.nextInt();
        System.out.print("For " + cup + " cups of coffee you will need: \n" + (WATER * cup) + " ml of water\n" + (MILK * cup) + " ml of milk\n" + (COFFEE_BEANS * cup) + " g of coffee beans\n");
    }
}
