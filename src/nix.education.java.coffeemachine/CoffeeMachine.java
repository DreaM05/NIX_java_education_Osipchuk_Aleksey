package nix.education.java.coffeemachine;

import java.util.Arrays;
import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args){
        System.out.print("Starting to make a coffee\n" + "Grinding coffee beans\n" + "Boiling water\n" + "Mixing boiled water with crushed coffee beans\n" + "Pouring coffee into the cup\n" + "Pouring some milk into the cup\n" + "Coffee is ready!\n");

        Scanner scanner = new Scanner(System.in);
        //Scanner WATER = new Scanner(System.in);
        //Scanner MILK = new Scanner(System.in);
        //Scanner COFFEE_BEANS = new Scanner(System.in);
        final int WATER_NEEDED = 200;
        final int MILK_NEEDED = 50;
        final int COFFEE_BEANS_NEEDED = 15;
        System.out.println("Write how many ml of water the coffee machine has:");
        int water_of_mach = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk_of_mach = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffee_beans_of_mach = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cup_of_coffee = scanner.nextInt();
        int water_of_coffee = water_of_mach / WATER_NEEDED;
        int milk_of_coffee = milk_of_mach / MILK_NEEDED;
        int beans_of_coffee = coffee_beans_of_mach / COFFEE_BEANS_NEEDED;
        int[] coffee = {water_of_coffee, milk_of_coffee, beans_of_coffee};
        int min = Arrays.stream(coffee).min().getAsInt();
        int N = min - cup_of_coffee;
        if (min == cup_of_coffee) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (min > cup_of_coffee) {
            System.out.println("Yes, I can make that amount of coffee (and even " + N + " more than that)");
        } else {
            System.out.println("No, I can make only " + min + " cups of coffee");
        }
//        System.out.print("For " + cup_of_coffee + " cups of coffee you will need: \n" + (WATER * cup) + " ml of water\n" + (MILK * cup) + " ml of milk\n" + (COFFEE_BEANS * cup) + " g of coffee beans\n");
    }
}
