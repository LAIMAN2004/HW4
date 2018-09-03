package MyStat.org;

import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два действительных положительных чисел ");
        double s;
        double g;
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        if (x > 0 & y > 0) {
            s = (x + y) / 2;
            System.out.println("Среднее арифметическая число = " + s);
            g = Math.sqrt(x * y);
            System.out.println("Среднее геометрическое число = " + g);
        }
    }
}



