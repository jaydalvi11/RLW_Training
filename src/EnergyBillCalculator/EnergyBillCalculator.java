package RailworldJavaBasics.ObjectCollaboration.EnergyBillCalculator;

import java.util.Scanner;

public class EnergyBillCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the units consumed: ");
        int unitsConsumed = scanner.nextInt();
        scanner.close();

        double energyBillAmount = calculateBill(unitsConsumed);
        System.out.println("Bill Amount : Rs." + energyBillAmount);
    }


    public static double calculateBillForFirst100Units(int units) {
        return units * 2;
    }

    public static double calculateBillForFirst150Units(int units) {
        return 100 * 2 + (units - 100) * 3;
    }

    public static double calculateBillForFirst200Units(int units) {
        return 100 * 2 + 50 * 3 + (units - 150) * 4;
    }

    public static double calculateBillForFirst250Units(int units) {
        return 100 * 2 + 50 * 3 + 50 * 4 + (units - 200) * 5;
    }

    public static double calculateBillForFirst300Units(int units) {
        return 100 * 2 + 50 * 3 + 50 * 4 + 50 * 5 + (units - 250) * 6;
    }

    public static double calculateBillForFirst500Units(int units) {
        return 100 * 2 + 50 * 3 + 50 * 4 + 50 * 5 + 50 * 6 + (units - 300) * 7;
    }

    public static double calculateBillForAbove500Units(int units) {
        return 100 * 2 + 50 * 3 + 50 * 4 + 50 * 5 + 50 * 6 + 200 * 7 + (units - 500) * 8;
    }


    public static double calculateBill(int units) {
        return units <= 100 ? calculateBillForFirst100Units(units) :
                units <= 150 ? calculateBillForFirst150Units(units) :
                units <= 200 ? calculateBillForFirst200Units(units) :
                units <= 250 ? calculateBillForFirst250Units(units) :
                units <= 300 ? calculateBillForFirst300Units(units) :
                units <= 500 ? calculateBillForFirst500Units(units) :
                calculateBillForAbove500Units(units);
    }

}
