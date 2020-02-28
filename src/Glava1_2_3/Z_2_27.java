package Glava1_2_3;

/*
Задание 2.27
Напишите класс, который принимает с клавиатуры целое число, представляющее собой массу тела в граммах,
и выводящую на экран массу этого тела в килограммах
 */


import java.util.Scanner;

public class Z_2_27 {
    public static Scanner in = new Scanner(System.in);
    private static void main(String[]args){
        int data;
        System.out.println("Введите массу тела в граммах: ");
        data = in.nextInt();
        System.out.println("Вес в кг: " + data/1000);


    }
}
