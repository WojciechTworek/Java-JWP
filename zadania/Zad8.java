package pl.zadania;
import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj długość pierwszej przyprostokątnej: ");
        double a = scanner.nextDouble();

        System.out.print("Podaj długość drugiej przyprostokątnej: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(a*a + b*b);

        System.out.printf("Długość przeciwprostokątnej wynosi: %.3f", c);
    }
}
