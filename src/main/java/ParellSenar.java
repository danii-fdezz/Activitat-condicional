// Activitat 02 — Parell o senar
import java.util.Scanner;

public class ParellSenar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entra un número enter:\n");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número és parell");
        } else {
            System.out.println("El número és senar");
        }
        
        scanner.close();
    }
}
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        // TODO: llegeix un número enter i digues si és parell o senar
        //   Recorda: numero % 2 == 0 -> parell
    

