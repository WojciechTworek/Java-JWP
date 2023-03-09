package pl.zadania;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) throws IOException{
        File plik = new File("dane.txt");
        Scanner input = new Scanner(plik);
        while(input.hasNext()) {
            String imie = input.next();
            String nazwisko = input.next();
            int godzinyPracy = input.nextInt();
            double stawkaGodzina = input.nextDouble();

            double placa = godzinyPracy * stawkaGodzina;

            System.out.printf("%s %s %.2f\n", imie, nazwisko, placa);
        }
        input.close();
    }
}
