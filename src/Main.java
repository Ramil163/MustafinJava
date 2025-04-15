import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число a: ");
        float a = scan.nextFloat();

        System.out.print("Введите число b: ");
        float b = scan.nextFloat();

        if
                (Float.compare(a, b) == 0) {
            System.out.println("a=b");
        }

        if
        (Float.compare(a, b) < 0) {
            System.out.println("a<b");
        }
        if
        (Float.compare(a, b) > 0) {
            System.out.println("a>b");
        }


        System.out.println("Результат сложения: " + (a + b) + "\nРезультат вычитания: " + (a - b) + "\nРезультат деления: " + (a / b ) +  "\nРезультат умножения: " + (a*b));




    }
}
