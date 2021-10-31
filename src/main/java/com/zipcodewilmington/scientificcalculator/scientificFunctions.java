package com.zipcodewilmington.scientificcalculator;

import java.util.Locale;
import java.util.Scanner;

public class scientificFunctions {
    public static void switchDisplayMode() {



    }

    public static String switchDisplayMode(String mode) {




        return mode;
    }

    public static Double memoryFunction(Double memory, String value) {
        memory = 0.0;
        String choice;
        value = switchDisplayMode("5");
        double memoryValue = Double.parseDouble(value);

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter either M+(Store in memory), MC(Clear memory), or MRC(Recall current memory): ");
            choice = scanner.nextLine();

            switch (choice.toUpperCase(Locale.ROOT)) {
                case "M+":
                    memory = memoryValue;
                    break;
                case "MC":
                    memory = 0.0;
                    break;
                case "MRC":
                    return memory;
                default:
                    System.out.println("You may only enter M+, MC, or MRC.");
            }

        } while (choice.equals("M+") || choice.equals("MC") || choice.equals("MRC"));

        return null;
    }

    public static void switchUnitsMode() {
        //Math.toDegrees();
        //Math.toRadians();

    }

    public static String switchUnitsMode(String mode) {




        return mode;
    }

    public static Double trigFunctions(Double value) {
        double trigValue = 0.0;
        String choice;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter which function you want to use: sine, cosine, tangent, inverse sine, inverse cosine, or inverse tangent: ");
        choice = scanner.nextLine();

        switch (choice.toLowerCase(Locale.ROOT)) {
            case "sine":
                trigValue = Math.sin(value);
                break;
            case "cosine":
                trigValue = Math.cos(value);
                break;
            case "tangent":
                trigValue = Math.tan(value);
                break;
            case "inverse sine":
                trigValue = Math.asin(value);
                break;
            case "inverse cosine":
                trigValue = Math.acos(value);
                break;
            case "inverse tangent":
                trigValue = Math.atan(value);
                break;
            default:
                System.out.println("Please enter one of the given choices.");
        }

        return trigValue;
    }

    public static Double logarithmicFunction(double value) {
        double logValue = 0.0;
        String choice;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter which function you want to use: log, inverse logarithm, natural logarithm, inverse natural logarithm: ");
        choice = scanner.nextLine();

        switch (choice.toLowerCase(Locale.ROOT)) {
            case "log":
                logValue = Math.log10(value);
                break;
            case "inverse logarithm,":
                logValue = Math.pow(10, value);
                break;
            case "natural logarithm":
                logValue = Math.log(value);
                break;
            case "inverse natural logarithm":
                logValue = Math.exp(value);
                break;
            default:
                System.out.println("Please enter one of the given choices.");
        }

        return logValue;
    }

    public static Double factorialFunction (Double value) {
        double factorial = 1.0;

        if (value > 0) {
            for (double i = value; i > 0; i--) {
                factorial *= i;
            }
        } else if(value < 0) {
            for (double i = value; i < 0; i++) {
                factorial *= i;
            }
        } else {
            factorial = 0.0;
        }

        return factorial;
    }
}
