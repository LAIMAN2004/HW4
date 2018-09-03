package MyStat.org;

import java.util.Scanner;

public class Zadacha6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = (int) (Math.random() * 18 + 2);
        int m;
        int i = 0;
        //System.out.println("Случайное число - " + n); //Для проверки самого себя
        System.out.println("Введи число - ");
        while (i < 5) {
            m = scanner.nextInt();
            if (n == m) {
                System.out.println("ПОБЕДА!!!");
            } else {
                System.out.println("ПРОИГРЫШ!!!");
                if (n > m) {
                    System.out.println("БОЛЬШЕ!!!");
                }
                if (n < m) {
                    System.out.println("МЕНЬШЕ!!!");
                }
            }
            i++;
        }
    }
}
