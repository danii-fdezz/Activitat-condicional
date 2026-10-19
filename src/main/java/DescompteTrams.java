// Activitat 16 — Descompte per trams
import java.util.Scanner;

public class DescompteTrams {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una quantitat:");
        double n = sc.nextDouble();

        double descompte;

        if (n < 500) {
            descompte = 0.05;
        } else if (n < 1000) {
            descompte = 0.08;
        } else if (n <= 5000) {
            descompte = 0.15;
        } else {
            descompte = 0.25;
        }

        double resultat = n - (n * descompte);

        System.out.println("El resultat és: " + resultat);

        sc.close();
    }
}