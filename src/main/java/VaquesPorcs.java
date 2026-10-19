// Activitat 03 — Vaques i porcs
import java.util.Scanner;

public class VaquesPorcs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantes vaques hi ha a la granja?\n");
        int vaques = scanner.nextInt();
        
        System.out.print("Quants porcs hi ha a la granja?\n");
        int porcs = scanner.nextInt();
        
        
        int totalAnimals = vaques + porcs;
        
        
        if (totalAnimals > 0) {
            // Calculem els percentatges convertint a double per no perdre decimals
            double percentatgeVaques = (double) vaques / totalAnimals * 100;
            double percentatgePorcs = (double) porcs / totalAnimals * 100;
            
            
            System.out.println("El percentatge és: " + (int)percentatgeVaques + "% de vaques i " + (int)percentatgePorcs + "% de porcs.");
            
            
            if (vaques > porcs) {
                System.out.println("Hi ha més vaques que porcs!");
            } else if (porcs > vaques) {
                System.out.println("Hi ha més porcs que vaques!");
            } else {
                System.out.println("Hi ha el mateix nombre de vaques que de porcs!");
            }
        } else {
            System.out.println("No hi ha animals a la granja.");
        }
        
        scanner.close();
    }
}
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        // TODO: llegeix el número de vaques i de porcs
        //   Calcula el percentatge de cada un sobre el total i mostra'ls
        //   Digues quin dels dos percentatges és més gran (o si empaten)
    

