/*
Задание 3.10
Подрабатывая в течение года, Вася собрал себе определенную сумму на поездку за границу, а родители добавили ему от себя
еще некоторую сумму. Напишите класс, который принимает с клавиатуры три значения: первое -сумма в рублях, заработанная
Васей, второе -сумма в рублях, которую ему дали родители, третье - курс рубля по отношению к евро. Класс должен
подсчитать и вывести на экран сумму в евро, которая имеется у Васи для поездки за границу.
 */


package Glava1_2_3;
import java.util.Scanner;

public class Z_3_10 {
    public static Scanner in = new Scanner(System.in);
    private static void main (String[] args) throws Exception {
            double a,b,c = 69.8;
            System.out.println("Вася заработал: ");
            a=in.nextDouble();
            System.out.println("Родители добавили: ");
            b=in.nextDouble();
            System.out.println("Итого EURO: " + (a+b)/c);

    }
}
