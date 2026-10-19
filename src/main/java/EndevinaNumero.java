// Activitat 18 — Endevina el número
// Ajuda: java.util.Random -> random.nextInt(10) + 1  (número entre 1 i 10)

import java.util.Random;
import java.util.Scanner;

public class EndevinaNumero {
    public static void main(String[] args) {
       
        Random generador = new Random();

        int numero = generador.nextInt(1,11); //1 i 10
        System.out.println(numero);

        String frase;
        frase = "Hola avui plou";
        System.out.println(frase);
        frase = "No ha plogut molt";
        System.out.println(frase);

        String nom = "Ana";

       //if(nom == "Ana"); //EERROOOOORRR

        if (nom.equals("Ana")) {
            System.out.println("siiiiiii");


            }
       
       Scanner teclat = new Scanner (System.in);
       String paraula;
       paraula = teclat.nextLine();
       System.out.println(paraula);
       
       
    
        // TODO: genera un número aleatori entre 1 i 10
        //   Demana a l'usuari que l'endevini
        //   Si l'encerta, felicita'l; si no, digues quin número era
    }
}
