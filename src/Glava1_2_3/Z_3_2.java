package Glava1_2_3;

import java.util.Scanner;

public class Z_3_2 { //и 3.3
    public static Scanner in = new Scanner(System.in);
    private static void main(String[] args) {
        double cm;
        double dm;
        System.out.println("Введите число в сантиметрах: ");
        cm = in.nextDouble();
        System.out.println("Результат в дюймах: " + cm/2.54);
        System.out.println();

        System.out.println("Введите число в дюймах: ");
        dm = in.nextDouble();
        System.out.println("Результат в сантиметрах: " + dm*2.54);
        System.out.println();



    }
}
