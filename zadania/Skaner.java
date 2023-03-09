package pl.zadania;
import java.util.Scanner;

public class Skaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj temperaturę w stopniach Celsjusza: ");
        double celcjusze = scanner.nextDouble();

        double fahrenheit = celcjusze * 1.8 + 32.0;

        System.out.printf("%.1f stopni Celsjusza to %.1f stopni Fahrenheita.", celcjusze, fahrenheit);
    }
}
