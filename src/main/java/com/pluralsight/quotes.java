package com.pluralsight;
import java.util.Scanner;
public class quotes {
    public static void main(String[] args) {
        String[] qoutes = {
                "To be, or not to be, that is the question.",
                "The only thing we have to fear is fear itself.",
                "In the middle of difficulty lies opportunity.",
                "I think, therefore I am.",
                "Not all those who wander are lost.",
                "Be the change that you wish to see in the world.",
                "The journey of a thousand miles begins with one step.",
                "That which does not kill us makes us stronger.",
                "Life is what happens when you're busy making other plans.",
                "Stay hungry, stay foolish."
        };
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Pick a qoute 1-10 to print: ");
            int number = scanner.nextInt();
            number--;
            System.out.println(qoutes[number]);
        }
        catch (Exception e) {
            System.out.println("Invalid choice! Pick a number from 1 to 10.");
            e.printStackTrace();
        }
        scanner.close();
    }
}
