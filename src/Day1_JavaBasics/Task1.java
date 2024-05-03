package Day1_JavaBasics;

import java.text.DecimalFormat;

public class Task1 {
    public static void main(String[] args) {
        float floatVariable = 2.3467f;
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(df.format(floatVariable));
    }
}

