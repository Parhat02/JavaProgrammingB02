package week07.day19_array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.000");

        double n = 10.4598753;

        System.out.println(df.format(n));
    }
}
