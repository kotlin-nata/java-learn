/**3/6
 * Напишите класс, который принимает с клавиатуры целое число и выводит на экран (в одной строке) три следующих за ним
 * целых числа так, чтобы разница между каждым числом и следующим за ним составляла 2. Например: для введенного с
 * клавиатуры числа 6 надо вывести на эк­ран числа 8, 10, 12
 *
 * 3/7
 * Напишите класс, который принимает с клавиатуры целое число и вы­водит на экран три предыдущих ему целых числа,
 * причем каждое -в отдельной строке.
 */


package Glava1_2_3;
import java.util.Scanner;

public class Z_3_6  {
     public static Scanner in=new Scanner(System.in);
     private static void main (String[] args) throws Exception {
         int a, a1, a2, a3;
         System.out.println("Ввведите целое положительное число: ");
         a = in.nextInt();
         a1 = a + 2;
         a2 = a1 + 2;
         a3 = a2 + 2;
         System.out.println(a1 + " " + a2 + " " + a3);
         System.out.println();

         a1 = a-1;
         a2 = a-2;
         a3 = a-3;
         System.out.println(a1 + " " + a2 + " " + a3);


     }
}
