package nix.education.java.chatbot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        //этап №1
        String botName = "Phill Bot";
        System.out.println("Hello! My name is " + botName);
        int birth_year = 2021;
        System.out.println("I was created in " + birth_year);

        //этап №2
        Scanner in = new Scanner(System.in);
        System.out.println("Please, remind me your name.");
        String name = in.nextLine();
        System.out.println("What a great name you have, " + name + "!");

        //этап №3
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = in.nextInt();
        int remainder5 = in.nextInt();
        int remainder7 = in.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");

        //этап №4
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int x = in.nextInt();
        int y = 0;
        while (y <= x) {
            System.out.println(y + " !");
            y++;
        }

        //этап №5
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        while (true) {
            int answer = in.nextInt();
            if (answer == 2.) {
                System.out.println("Great, you right!");
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }
        System.out.println("Goodbye, have a nice day!");
        in.close();
    }
}