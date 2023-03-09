package pl.zadania;
import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String[] dniTygodnia = {"Niedziela", "Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota"};

        System.out.print("Podaj datę w formacie dd.mm.rrrr: ");
        String dateStr = scanner.nextLine();
        int dzien = Integer.parseInt(dateStr.substring(0, 2));
        int miesiac = Integer.parseInt(dateStr.substring(3, 5));
        int rok = Integer.parseInt(dateStr.substring(6));
        int z = miesiac <= 2 ? rok - 1 : rok;
        int c = miesiac <= 2 ? 0 : 2;
        int dt = (23 * miesiac / 9 + dzien + 4 + rok + z / 4 - z / 100 + z / 400 - c) % 7;
        System.out.println(dniTygodnia[dt]);
    }
}
 