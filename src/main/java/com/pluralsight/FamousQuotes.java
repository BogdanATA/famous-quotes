package com.pluralsight;


import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //list of quotes
        String[] quotes = new String[10];

        quotes[0] = "Action beats intention.";
        quotes[1] = "Small steps compound.";
        quotes[2] = "Clarity creates momentum.";
        quotes[3] = "Discipline over motivation.";
        quotes[4] = "Focus on what matters.";
        quotes[5] = "Consistency builds results.";
        quotes[6] = "Done is better than perfect.";
        quotes[7] = "Learn, adapt, repeat.";
        quotes[8] = "Time reveals truth.";
        quotes[9] = "Start before you’re ready.";


        boolean isDone = false;
        while (!isDone) {

            //get user input
            System.out.println("Pick a number 1 - 10:");
            System.out.println("Or enter R for a random quote");
            String command = scanner.nextLine();


            //hides error if user picks number out of range
            try {
                if (command.equalsIgnoreCase("R")) {
                    int randomIndex = (int)(Math.random() * quotes.length); // random number 0-1 multiplied by length of array
                    System.out.println(quotes[randomIndex] + "\n");
                } else {
                    //print out quote based on what number user entered
                    int choice = Integer.parseInt(command); // if integer entered converts the string into an integer
                    System.out.println(quotes[choice - 1] + "\n"); // prints quote choice index minus 1 to account for array starting at 0
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
            }

            System.out.println("Would you like to see another quote? (Y/N)");
            String answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("Y")) {
                isDone = true;
            }
        }
    }
}
