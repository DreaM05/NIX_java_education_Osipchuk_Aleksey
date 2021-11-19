package nix.education.java.coffeemachine;

import java.util.Scanner;

class CoffeeMachine {
static Scanner scan = new Scanner(System.in);
    private double AMOUNT_OF_WATER, AMOUNT_OF_MILK, AMOUNT_OF_COFFEE_BEANS, AMOUNT_OF_CUPS, AMOUNT_OF_MONEY;

    public CoffeeMachine() {
        this.AMOUNT_OF_WATER = 400;
        this.AMOUNT_OF_MILK = 540;
        this.AMOUNT_OF_COFFEE_BEANS = 120;
        this.AMOUNT_OF_CUPS = 9;
        this.AMOUNT_OF_MONEY = 550;
        System.out.println("\n| Current Status: |\n");
        System.out.println("--- Available Water on coffee machine: " + AMOUNT_OF_WATER);
        System.out.println("--- Available Milk on coffee machine: " + AMOUNT_OF_MILK);
        System.out.println("--- Available Coffee Beans on coffee machine: " + AMOUNT_OF_COFFEE_BEANS);
        System.out.println("--- Available Cups on coffee machine: " + AMOUNT_OF_CUPS);
        System.out.println("--- Available Money on coffee machine: " + AMOUNT_OF_MONEY);
    }

    //статус ингредиентов
    private void GetIngredients() {
        System.out.println("\n| Current Status: |\n");
        System.out.println("--- Available Water on coffee machine: "+String.format("%.1f",this.AMOUNT_OF_WATER));
        System.out.println("--- Available Milk on coffee machine: "+String.format("%.1f", this.AMOUNT_OF_MILK));
        System.out.println("--- Available Coffee Beans on coffee machine: "+String.format("%.1f", this.AMOUNT_OF_COFFEE_BEANS));
        System.out.println("--- Available Cups on coffee machine: "+String.format("%.1f", this.AMOUNT_OF_CUPS));
        System.out.println("--- Available Money on coffee machine: "+String.format("%.1f", this.AMOUNT_OF_MONEY));
    }

    //меню добавления ингредиентов
    private void FillIngredients() {
        System.out.println("\nWrite how many ml of water you want to add:");
        int adding_water = scan.nextInt();
        AMOUNT_OF_WATER += adding_water;
        System.out.println("Write how many ml of milk you want to add:");
        int adding_milk = scan.nextInt();
        AMOUNT_OF_MILK += adding_milk;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int adding_coffee_beans = scan.nextInt();
        AMOUNT_OF_COFFEE_BEANS += adding_coffee_beans;
        System.out.println("Write how many cups of coffee you want to add:");
        int adding_cups = scan.nextInt();
        AMOUNT_OF_CUPS += adding_cups;
        System.out.println("\n| Current Status: |\n" + "--- Available Water on coffee machine: " + AMOUNT_OF_WATER + "\n--- Available Milk on coffee machine: " + AMOUNT_OF_MILK + "\n--- Available Coffee Beans on coffee machine: " + AMOUNT_OF_COFFEE_BEANS + "\n--- Available Cups on coffee machine: " + AMOUNT_OF_CUPS);
        this.start();
    }

    //меню изъятия денег
    public void GetMoney() {
        this.AMOUNT_OF_MONEY -= this.AMOUNT_OF_MONEY;
        System.out.println("\n--- Available Money on coffee machine: "+String.format("%.1f", this.AMOUNT_OF_MONEY));
        //this.GetIngredients();
        this.start();
    }

    //меню приготовления кофе
    private void BuyCoffee() {
        System.out.println("\nWhat do you want to buy?\n--- 1 - Espresso\n--- 2 - Latte\n--- 3 - Cappuccino\n--- 0 - Back to menu");
        char t = scan.next().charAt(0);
        switch (t) {
            case '1':
                this.Espresso();
                break;
            case '2':
                this.Latte();
                break;
            case '3':
                this.Cappuccino();
                break;
            case '0':
                break;
        }
        //this.GetIngredients();
        this.start();
    }

    //рецепт Эспрессо
    private void Espresso () {
        if (this.AMOUNT_OF_WATER >= 250 && this.AMOUNT_OF_COFFEE_BEANS >= 16 && this.AMOUNT_OF_CUPS >= 1) {
            this.AMOUNT_OF_MONEY += 4;
            System.out.println("\nMaking Espresso...");
            System.out.println("Taking 1 Cup.");
            this.AMOUNT_OF_CUPS -= 1;
            System.out.println("Taking 10gm of Coffee Beans.");
            this.AMOUNT_OF_COFFEE_BEANS -= 16;
            System.out.println("Taking 250ml of Water.");
            this.AMOUNT_OF_WATER -= 250;
            System.out.println("Your Espresso is READY!");
            //this.GetIngredients();
        } else {
            System.out.println("Available Cups "+String.format("%.1f", this.AMOUNT_OF_CUPS));
            System.out.println("Available Water(ml) "+String.format("%.1f", this.AMOUNT_OF_WATER));
            System.out.println("Available Milk(ml) "+String.format("%.1f", this.AMOUNT_OF_MILK));
            System.out.println("Available Coffee Power(Gram) "+String.format("%.1f",this.AMOUNT_OF_COFFEE_BEANS));
            System.out.println("Some Items Are Not Available, Please Fill before Making Coffee.");
        }
        this.start();
    }

    //рецепт Латте
    private void Latte () {
        if (this.AMOUNT_OF_WATER >= 350 && this.AMOUNT_OF_MILK >= 75 && this.AMOUNT_OF_COFFEE_BEANS >= 20) {
            this.AMOUNT_OF_MONEY += 7;
            System.out.println("\nMaking Latte...");
            System.out.println("Taking 1 Cup.");
            this.AMOUNT_OF_CUPS -= 1;
            System.out.println("Taking 350ml of Water.");
            this.AMOUNT_OF_WATER -= 350;
            System.out.println("Taking 75ml of Milk.");
            this.AMOUNT_OF_MILK -= 75;
            System.out.println("Taking 20gm of Coffee Beans.");
            this.AMOUNT_OF_COFFEE_BEANS -= 20;
            System.out.println("Your Espresso is READY!");
            //this.GetIngredients();
        } else {
            System.out.println("Available Cups "+String.format("%.1f", this.AMOUNT_OF_CUPS));
            System.out.println("Available Water(ml) "+String.format("%.1f", this.AMOUNT_OF_WATER));
            System.out.println("Available Milk(ml) "+String.format("%.1f", this.AMOUNT_OF_MILK));
            System.out.println("Available Coffee Power(Gram) "+String.format("%.1f",this.AMOUNT_OF_COFFEE_BEANS));
            System.out.println("Some Items Are Not Available, Please Fill before Making Coffee.");
        }
        this.start();
    }

    //рецепт Капучино
    private void Cappuccino () {
        if (this.AMOUNT_OF_WATER >= 200 && this.AMOUNT_OF_MILK >= 100 && this.AMOUNT_OF_COFFEE_BEANS >= 12) {
            this.AMOUNT_OF_MONEY += 6;
            System.out.println("\nMaking Espresso...");
            System.out.println("Taking 1 Cup.");
            this.AMOUNT_OF_CUPS -= 1;
            System.out.println("Taking 200ml of Water.");
            this.AMOUNT_OF_WATER -= 200;
            System.out.println("Taking 100ml of Milk.");
            this.AMOUNT_OF_MILK -= 100;
            System.out.println("Taking 12gm of Coffee Beans.");
            this.AMOUNT_OF_COFFEE_BEANS -= 12;
            System.out.println("Your Espresso is READY!");
            //this.GetIngredients();
        } else {
            System.out.println("Available Cups "+String.format("%.1f", this.AMOUNT_OF_CUPS));
            System.out.println("Available Water(ml) "+String.format("%.1f", this.AMOUNT_OF_WATER));
            System.out.println("Available Milk(ml) "+String.format("%.1f", this.AMOUNT_OF_MILK));
            System.out.println("Available Coffee Power(Gram) "+String.format("%.1f",this.AMOUNT_OF_COFFEE_BEANS));
            System.out.println("Some Items Are Not Available, Please Fill before Making Coffee.");
        }
        this.start();
    }

    //меню выбора кофемашины
    public void start() {
        boolean t = true;
        while (t) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            String action = scan.next();
            switch (action) {
                case "buy" -> this.BuyCoffee();
                case "fill" -> this.FillIngredients();
                case "take" -> this.GetMoney();
                case "remaining" -> this.GetIngredients();
                case "exit" -> t = false;
            }

        }
    }
}

//запуск кофе мащини
class MakeCoffee {
    public static void main(String[] args) {
        System.out.println("\nWants to Start Machine Y or N ?");
        Scanner scan = new Scanner(System.in);
        char d;
        d = scan.next().charAt(0);
        if(d == 'Y' || d == 'y') {
            System.out.print("""
                    Starting to make a coffee
                    Grinding coffee beans
                    Boiling water
                    Mixing boiled water with crushed coffee beans
                    Pouring coffee into the cup
                    Pouring some milk into the cup
                    Coffee Machine is ready!
                    """);
            CoffeeMachine cm = new CoffeeMachine();
            cm.start();
            System.out.println("Shutting Down...\n");
        } else {
            System.out.println("Shutting Down...\n");
        }
    }
}
