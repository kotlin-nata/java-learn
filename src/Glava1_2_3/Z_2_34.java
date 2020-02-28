package Glava1_2_3;


/* Задание 2.34
Напишите класс, который сначала заносит в переменную строковое значение Привет, а затем принимает с клавиатуры ваше имя.
 Класс должен вывести на экран в одной строке сообщение, составлен­ное из строкового значения Привет, знака «запятая» и
 вашего имени.
 */

import java.util.Scanner;

public class Z_2_34 {
    public static Scanner in = new Scanner(System.in);
    private static void main(String[]args) {
        String name, fam;
        System.out.println("Представьтесь: ");
        name = in.nextLine();

        System.out.println("Привет, " + name+"!");
        System.out.println("Назови фамилию: ");
        fam = in.nextLine();
        System.out.println("Axaxa - "+fam+ " у тебя самая крутая фамилия))))");
    }
}
