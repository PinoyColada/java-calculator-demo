package com.Calculator;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Welcome to the Simple Calculator Program: ");
        System.out.println("Let's start off by entering the first number: ");
        while (!input.hasNextDouble()) {
            System.out.println("You did not enter a valid input! Please enter a number: ");
            input.nextLine();
        }
        double numOne = input.nextDouble();

        System.out.println("Then enter the second number: ");
        double numTwo = input.nextDouble();

        System.out.println("Lastly, please select an operator to use between the 2 numbers(+,-,*,/): ");
        String operator = input.next();

        Calc calc = new Calc(numOne,numTwo);
        label:
        while(true) {
            switch (operator) {
                case "+":
                    System.out.println(calc.add(numOne, numTwo));
                    break label;
                case "-":
                    System.out.println(calc.subtract(numOne, numTwo));
                    break label;
                case "*":
                    System.out.println(calc.multiply(numOne, numTwo));
                    break label;
                case "/":
                    System.out.println(calc.divide(numOne, numTwo));
                    break label;
                default:
                    System.out.println("You did not enter an operator, please choose an operator(+,-,*,/)");
                    operator = input.next();
            }
        }
        System.out.println("Would you like to run the program again? Enter Y for Yes or N for No");
        String yesOrNo = input.next().toUpperCase();

        while (true) {
            if (yesOrNo.equals("Y")) {
                Main.main(args);
            } else if (yesOrNo.equals("N")) {
                System.out.println("Program is now terminating...");
                System.exit(0);
            } else {
                System.out.println("Please enter a valid input ('Y' for Yes or 'N' for No))");
                yesOrNo = input.next().toUpperCase();
            }
        }


    }
}

