import java.util.Random;
import java.util.Scanner;

public class PedraPaperTisora {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        Random random = new Random();

        // 1. Pedir la jugada al usuario
        System.out.println("Entra pedra, paper o tisora:");
        String jugadaUsuari = teclat.nextLine().toLowerCase().trim();

        // 2. Generar la jugada del ordenador (0 = pedra, 1 = paper, 2 = tisora)
        int numOrdinador = random.nextInt(3);
        String jugadaOrdinador = "";

        if (numOrdinador == 0) {
            jugadaOrdinador = "pedra";
        } else if (numOrdinador == 1) {
            jugadaOrdinador = "paper";
        } else if (numOrdinador == 2) {
            jugadaOrdinador = "tisora";
        }

        // Mostrar lo que ha sacado el bot
        System.out.println("Ordinador ha tret: " + jugadaOrdinador);

        // 3. Comprobar el resultadoooo
        if (jugadaUsuari.equals(jugadaOrdinador)) {
            System.out.println("Heu empatat!!");
        } else if (
            (jugadaUsuari.equals("pedra") && jugadaOrdinador.equals("tisora")) ||
            (jugadaUsuari.equals("paper") && jugadaOrdinador.equals("pedra")) ||
            (jugadaUsuari.equals("tisora") && jugadaOrdinador.equals("paper"))
        ) {
            System.out.println("Has guanyaaat!");
            System.out.println("Que bonaaa!!");
        } else {
            System.out.println("Has perduuuuut!");
            System.out.println("Que malament!!!!!");
        }

        teclat.close();
    }
}


// TODO: l'ordinador tria a l'atzar pedra, paper o tisora
        //   L'usuari entra la seva opció per teclat
        //   Mostra què ha tret l'ordinador i qui guanya (tisores>paper>pedra>tisores)