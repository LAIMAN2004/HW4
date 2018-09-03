package MyStat.org;
import java.util.Scanner;
public class Zadacha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое имя и возраст ");
        String i= scanner.next();
        int m = scanner.nextInt();
        System.out.println("Возраст у " + i + m);
        }
}
