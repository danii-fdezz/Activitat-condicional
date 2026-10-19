// Activitat 10 — Caixer, comissió i saldo

import java.util.Scanner;

public class CaixerComissio {
    public static void main(String[] args) {
        
        Scanner teclat = new Scanner (System.in);

        System.out.println("Introdueix saldo");
        double saldo = teclat.nextDouble();

        
        System.out.println("Introdueix quantitat a treure");
        int quantitat = teclat.nextInt();
        


        System.out.println("Fas servir caixer propi: S/N");
        char caixerPropi = teclat.next().charAt(0);

        double commisio = 0;
        if (caixerPropi=='N') {
            commisio = quantitat * 0.05;
        }
        double quantitaRetirar = quantitat + commisio;
        
        if (quantitaRetirar > saldo) {
            System.out.println("No es pot fer l'operació");
         }
         else {
            saldo = saldo - quantitaRetirar;
            System.out.println("Et queden" + saldo + "euros");
            if(commisio>0)
            System.out.println("commisio" + commisio);
        System.out.println("Quantitat a treure" + quantitaRetirar);
        } 
        
        
        // TODO: llegeix el saldo actual, la quantitat a treure i si fas servir caixer propi (S/N)
        //   Si NO és caixer propi, aplica una comissió del 5% sobre la quantitat
        //   Si (quantitat + comissió) > saldo -> "No es pot fer la retirada. Saldo insuficient."
        //   Si no, mostra la quantitat, la comissió (si n'hi ha) i el saldo restant
        }
    }


