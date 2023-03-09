package pl.zadania;

public class Zad1 {
        public static void main(String[] args) {
            System.out.println("Kody i odpowiadające im znaki:");
            for (int i = 48; i <= 124; i++) {
                char c = (char) i;
                System.out.println("Kod: "+ i + " odpowiada znakowi: " + c);
            }
        }
}
