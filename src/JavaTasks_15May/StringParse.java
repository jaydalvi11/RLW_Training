package RailworldJavaBasics;

public class StringParse {

    public static void main(String[] args) {
        String initialAmount = "$2000";
        int increment = 1;

        int initialAmt = Integer.parseInt(initialAmount.substring(1));

        int finalAmt = initialAmt + increment;

        System.out.println("Initial amount: " + initialAmount);
        System.out.println("Final amount: $" + finalAmt);
    }

}
