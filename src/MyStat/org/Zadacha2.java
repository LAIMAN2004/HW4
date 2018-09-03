package MyStat.org;
import java.util.Scanner;
public class Zadacha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите катеты прямоугольного трехугольника ");
        double z;
        double s;
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        z=Math.sqrt( (x*x)+(y*y));
        s=(x*y)/2;
        System.out.println("Гупотинуза равна" + z);
        System.out.println("Площадь прямоугольного трехугольника равна" + s);
    }
}



