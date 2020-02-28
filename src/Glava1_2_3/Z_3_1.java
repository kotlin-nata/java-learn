package Glava1_2_3;

/*
Задание 3.1 Связь между температурой по шкале Цельсия и температурой по шкале Фаренгейта выражается формулой:
C=S(F-32)/9, где С -температура по шкале Цельсия, F -температура по шкале Фаренгейта. Напишите класс, который принимает
 с клавиатуры температуру по шкале Фаренгейта, а затем выводит на экран эту же температуру, но по шкале Цельсия.
 */

import java.util.Scanner;

public class Z_3_1 {
    public static Scanner in = new Scanner(System.in);
    private static void main(String[]args){
        double tempF;
        int tempC;
        tempC=in.nextInt();
        tempF=5.0*(tempC-32)/9;
        System.out.println(tempF);
    }
}
