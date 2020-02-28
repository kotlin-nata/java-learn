package Glava1_2_3;

/*
Напишите класс, который принимает с клавиатуры два целых числа, первое из которых представляет собой год
рождения, а второе -нынешний (текущий) год. Класс должен вывести на экран возраст (в целых годах).
 */


import java.util.Scanner;

public class Z_2_26 {
    public static Scanner in = new Scanner(System.in);
    private static void main(String[]args) {
        int data;
        int year = 2020;
        System.out.println("Введите дату рождения: ");
        data = in.nextInt();
        System.out.println("Ваш возраст: " + (year - data));
        System.out.println();



    }
}
