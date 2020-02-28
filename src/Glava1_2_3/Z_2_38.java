package Glava1_2_3;

/*
Задание 2.38 Напишите класс, который принимает с клавиатуры фамилию, имя и отчество, а затем выводит на экран инициалы
(без пробела между инициалами).
 */


import java.util.Scanner;

public class Z_2_38 {
    public static Scanner in = new Scanner(System.in);
    private static void main(String[]args) {
        String name, fam, ot, fio;
        System.out.println("Ввелите вашу фамилию: ");
        name = in.nextLine();
        System.out.println("Ввелите ваше имя: ");
        fam = in.nextLine();
        System.out.println("Ввелите ваше отчество: ");
        ot = in.nextLine();
        fio = name.charAt(0) +"."+ fam.charAt(0)+"."+ ot.charAt(0);
        System.out.println();
        System.out.println("Инициалы: " + fio);


    }
}
