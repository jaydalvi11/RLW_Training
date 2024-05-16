package RailworldJavaBasics.DateTime;

public class LeapYear {

    public static void main(String[] args) {
        int year = 2024;
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                }
            } else {
                leap = true;
            }
        }

        if (leap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

}
