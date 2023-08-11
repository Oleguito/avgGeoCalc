import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int one, two;
        System.out.print("Введите первое число: ");
        try {
            one = s.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
            return;
        }
        System.out.print("Введите второе число: ");
        try {
            two = s.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
            return;
        }
        /*  Так как числа целые, я подозреваю результат должен быть целым
            поэтому привожу к int */
        System.out.println("Среднее арифметическое: " + ((one + two) / 2));
        System.out.println("Среднее геометрическое: " + (int) Math.sqrt(one * two));
    }
}