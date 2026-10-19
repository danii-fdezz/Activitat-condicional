// Activitat 11 — Preu d'una entrada de cinema
// Ajuda: per llegir una lletra amb Scanner
//   char lletra = teclat.next().charAt(0);

import java.util.Scanner;

public class PreuEntradaCinema {
    public static void main(String[] args) {
       
       
       Scanner teclat = new Scanner(System.in);

       System.out.println("Es un dia laborable (L) o cap de setmana (C)?");
       char dia = teclat.next().charAt(0);
        
       System.out.println("Tens el carnet jove? (S/N)");
       char carnet = teclat.next().charAt(0);

       double preu = 5.0;

       if (dia == 'C' || dia == 'c'); {
        preu = preu + (preu * 0.10); 

       }

       System.out.println("El preu de l'entrada és: " + preu + "€");

       teclat.close();




       
       

       
       
        // TODO: l'entrada normal val 5€
        //   Un 10% més en cap de setmana (pregunta L=laborable o C=cap de setmana)
        //   Un 15% de descompte addicional amb Carnet Jove (pregunta S/N)
        //   Mostra el preu final
    }
}
