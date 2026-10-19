// Activitat 01 — Febre
import java.util.Scanner;

public class Febre {
    public static void main(String[] args) {

        

        Scanner teclat = new Scanner (System.in);
        
        System.out.print("Entra la temperatura:\n");
        
        double temperatura = teclat.nextDouble();
        
        
        if (temperatura > 37.0) {
            System.out.println("Tens febre, has d'anar cap a casa a descansar!!!");
         } else {   
            System.out.println("Estas bé de temperatura, pots fer classe.");
            }
        
        if (temperatura < 35.0) {
            System.out.println("Nah, es mentira no estás bé, tens hipotermia. ");
        teclat.close(); 
        
        }
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO: llegeix la temperatura (real, per teclat) i digues si hi ha febre
        //   Si temperatura > 37 -> "Tens febre, has d'anar cap a casa a descansar!!"
        //   Si no -> un altre missatge (per exemple, que pot quedar-se)
    

