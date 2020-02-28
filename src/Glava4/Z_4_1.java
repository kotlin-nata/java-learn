/*
Задание 4.1
Напишите класс, который принимает с клавиатуры целое положительное двузначное число и выводит на экран его цифры,
разделенные знаком «пробел».

Задание 4.2 Напишите класс, который принимает с клавиатуры целое положительное трехзначное число и выводит на экран
его цифры, разделенные знаком «пробел».

Задание 4.3 Напишите класс, который принимает с клавиатуры целое положитель­ное двузначное число и выводит на экран
его цифры, разделенные знаком «пробел», но в обратном порядке. То есть для числа 45 будет выведено на экран 5 4.

Задание 4.4 Напишите класс, который принимает с клавиатуры целое положитель­ное трехзначное число и выводит на экран
 его цифры, разделенные знаком «пробел», но в обратном порядке. То есть для числа 415 будет выведено на экран 5 1 4.
 */


package Glava4;

import java.util.Scanner;

public class Z_4_1 {
    public static Scanner in = new Scanner(System.in);
    private static void main (String[] args) throws Exception{
        int a, w;
        System.out.println("Введите положительное двузначное число: ");
        a=in.nextInt();
        int b = a %10;
        int c = a/10;

        System.out.println("Результат с пробелом: " + c + " " + b); // Задание 4.1
        System.out.println("И наоборот: " +  + b + " " + c); // Задание 4.3


        System.out.println("Введите положительное трехзначное число: ");
        w= in.nextInt();

        String str = Integer.toString(w);
        str = str.charAt(0) + " "+ str.charAt(1)+ " " + str.charAt(2);
        System.out.println("Результат с пробелом: " + str); // Задание 4.2
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("И наоборот: " + reverse); // Задание 4.4
    }
}

/*
Можно было так:

public static Scanner in=new Scanner(System.in);
public static void main (String[] args) {
int х, х1, х2,х3;
x=in. next!nt();
х1=х/100;
х2=(х%100)/10;
х3=х%10;
System.out.println(x3+" "+х2+" "+х1);

 */