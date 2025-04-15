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

        System.out.print("Введите строку a: ");
        String A = scan.nextLine();
        A = scan.nextLine();

        System.out.print("Введите строку b: ");
        String B = scan.nextLine();
        if (A.equals(B)) {
         System.out.println("Строки идентичны");
        }
        else {
            System.out.println("Строки неидентичны");
        }


        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        for (int i = 0; i < numbers.length; i++) {
            if((numbers[i] % 2) == 0) {System.out.println(numbers[i]);}
        };




    }
}
