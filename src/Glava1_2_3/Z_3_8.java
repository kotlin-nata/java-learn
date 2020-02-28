/**
 * Задание 3.8
 * Напишите класс, который принимает с клавиатуры два значения:
 * первое - длина основания равнобедренного
 * треугольника, второе - высоту этого треугольника.
 *
 * Затем класс должен подсчитать и вывести на экран:
 * • площадь этого треугольника;
 * • периметр прямоугольника, сторонами которого являются основание и высота описанного в задаче треугольника
 */


package Glava1_2_3;
import java.util.Scanner;
public class Z_3_8 {
        public static Scanner in=new Scanner(System.in);
        private static void main (String[] args) throws Exception {
            int l,h;

            System.out.println("длина основания равнобедренного: ");
            l = in.nextInt();
            System.out.println("высота этого треугольника: ");
            h = in.nextInt();
            System.out.println("площадь этого треугольника: " + l/2*h);
            double p = ((l/2)*(l/2))+(h*h);
            System.out.println("периметр прямоугольника: " + Math.sqrt(p));



        }
}
