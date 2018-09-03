package MyStat.org;

import java.util.Scanner;

public class Zadacha4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи чисело ");
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println("Число является четным и к нему добавляется 2, а сумма равна " + (x + 2));
        } else {
            System.out.println("Число является нечетным и к нему добавляется 1, а сумма равна " + (x + 1));
        }
    }
}