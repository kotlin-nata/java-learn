/*Задание 3.9

Компания по продаже минеральной воды проводит конкурс «Балл под крышкой»: на внутренней стороне пробок, которыми закрыты
 бутылки, выпускаемые компанией, напечатаны призовые баллы. Есть пробки, «равные» 10 баллам, есть -100, есть -1000.
 Напишите класс, который принимает с клавиатуры три числа, означающие количество пробок каждого типа, собранных Васей,
 и выводит на экран общее количество баллов, которые Вася получил.
 */


package Glava1_2_3;

import java.util.Scanner;

public class Z_3_9 {
    public static Scanner in = new Scanner(System.in);
    private static void main (String[] args) throws Exception {
        int a,b,c,all;
        a=in.nextInt(); b=in.nextInt(); c=in.nextInt();
        all=a*10+b*100+c*1000;
        System.out.println(all);
    }
}
