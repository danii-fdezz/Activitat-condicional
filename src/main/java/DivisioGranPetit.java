// Activitat 07 — Dividir el més gran entre el més petit

import java.util.Scanner;

public class DivisioGranPetit {
    public static void main(String[] args) {
       
        
        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Introdueix el primer número");
        int numero1 = teclat.nextInt();

    
        System.out.println("Introdueix el segon número");
        int numero2 = teclat.nextInt();

        int gran, petit;

       if(numero1==numero2); {

        System.out.println("Els numeros son iguals");
       }
        else {
        
            if (numero1>numero2) {
                gran = numero1;
                petit = numero2;
                if (numero2!=0) 
                    int resultat = numero1/numero2;
                System.out.println("El resultat és" + resultat);
            }
            else  {
                gran = numero2;
                petit = numero1;
                int resultat = numero2/numero1;
                System.out.println("El resultat és" +resultat);
             }
             else {
                System.out.println("El divisor es 0");
             }

        // TODO: llegeix 2 números diferents
        //   Si són iguals -> "Els números han de ser diferents"
        //   Troba el més gran i el més petit
        //   Si el més petit és 0 -> "El divisor no pot ser 0"
        //   Si no, mostra el resultat de dividir el gran entre el petit
    
        }

    }
}

