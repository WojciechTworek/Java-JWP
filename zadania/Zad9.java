package pl.zadania;
import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        String s = "Jan Nowak 150 25,3";
        Scanner input = new Scanner(s);

        String imie = input.next();
        String nazwisko = input.next();
        int godzinyPracy = input.nextInt();
        double stawkaGodzina = input.nextDouble();

        double placa = godzinyPracy * stawkaGodzina;

        System.out.printf("%s %s %.2f\n", imie, nazwisko, placa);

        input.close();
    }
}

