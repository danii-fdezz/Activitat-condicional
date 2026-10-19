// Activitat 19 — Aposta A o B
// Ajuda: java.util.Random -> random.nextInt(10) + 1

import java.util.Random;
import java.util.Scanner;

public class ApostaAB {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        // Generem A i B sense mostrar-los
        int A = random.nextInt(10) + 1;
        int B = random.nextInt(10) + 1;

        // Preguntem per qui aposta
        System.out.print("Apostes per A o per B ? : ");
        String aposta = sc.nextLine();

        // Mostrem els números
        System.out.print("A treu un " + A + " i B treu un " + B + " ");

        // Comprovem si ha guanyat
        if ((aposta.equalsIgnoreCase("A") && A > B) ||
            (aposta.equalsIgnoreCase("B") && B > A)) {
            System.out.println("HAS GUANYAT!!!");
        } else if (A == B) {
            System.out.println("EMPAT!!!");
        } else {
            System.out.println("HAS PERDUT!!!");
        }

        sc.close();
    }
}
