// Activitat 24 — Signes del zodíac (switch)
import java.util.Scanner;

public class SignesZodiac {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a) Mostrem el llistat
        System.out.println("1. Àries      2. Capricorn   3. Balança     4. Cranc");
        System.out.println("5. Lleó       6. Taure       7. Aquari      8. Escorpió");
        System.out.println("9. Sagitari   10. Verge      11. Bessons    12. Peixos");

        // b) Demanem el número
        System.out.println("Introdueix el número del teu signe:");
        int signe = sc.nextInt();

        // c) Indiquem la categoria amb switch
        switch (signe) {
            case 1:
            case 5:
            case 9:
                System.out.println("Categoria: Foc");
                break;

            case 2:
            case 6:
            case 10:
                System.out.println("Categoria: Terra");
                break;

            case 3:
            case 7:
            case 11:
                System.out.println("Categoria: Aire");
                break;

            case 4:
            case 8:
            case 12:
                System.out.println("Categoria: Aigua");
                break;

            default:
                System.out.println("ERROR: " + signe + " no associat a cap signe.");
        }

        sc.close();
    }
}
       
          
        // TODO:
        //   a) Mostra el llistat dels 12 signes amb el seu número
        //   b) Demana un número per teclat
        //   c) Amb un switch, mostra la categoria (Foc, Terra, Aire o Aigua)
        //   Si el número no correspon a cap signe: "ERROR: <número> no associat a cap signe."
    

