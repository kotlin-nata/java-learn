package Glava1_2_3;

import java.util.Scanner;

public class Z_3_5 {
    public static Scanner in = new Scanner(System.in);
    private static void main(String[] args) throws Exception{
        double k1;
        double k2;
        double g;

        System.out.println("Введите длину первой стороны треугольника: ");
        k1 = in.nextDouble();

        System.out.println("Введите высоту второй стороны треугольника: ");
        k2 = in.nextDouble();

        System.out.println("Введите длину гипотенузы: ");
        g = in.nextDouble();

        double S = ((k2 / 2) * g);
        System.out.println("Площадь треугольника равна: " + S);

        double P = k1+k2+g;
        System.out.println("Периметр равен: " + P);

        System.out.println();

    }
}

