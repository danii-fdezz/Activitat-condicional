// Activitat 06 — Rectangle o quadrat

import java.util.Scanner;

public class RectangleQuadrat {
    public static void main(String[] args) {
       
       Scanner teclat = new Scanner (System.in);

       System.out.println("Introdueix el costat gran del rectangle");
       int CostatGran = teclat.nextInt();

       System.out.println("Introdueix el costat petit del rectangle");
       int CostatPetit = teclat.nextInt();

       int perimetre = (CostatGran * 2) + (CostatPetit * 2);
       int area = CostatGran * CostatPetit;

       System.out.println("Perimetre del rectangle = " + perimetre);
       System.out.println("Area del rectangle = " + area);

       if (CostatGran == CostatPetit) {
        System.out.println("És un quadrat fr");

    } else {

        System.out.println("No es un quadrat fr");

        }


    teclat.close();

    }

       
       
       
       
       
       
       
       
       
       
       
       
       
       
        // TODO: llegeix el costat gran i el costat petit d'un rectangle
        //   Mostra el perímetre (costatGran*2 + costatPetit*2) i l'àrea (costatGran*costatPetit)
        //   Digues si és un quadrat (els dos costats iguals) o no
    }
