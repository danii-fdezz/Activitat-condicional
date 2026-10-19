// Activitat 27 — Monedes mínimes
import java.util.Scanner;

public class MonedesMinimesCondicional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix una quantitat (cèntims euro): ");
        int quantitat = sc.nextInt();

        if (quantitat < 0) {
            System.out.println("Error: la quantitat ha de ser igual o superior a 0.");
        } else {

            int monedes2Euros = quantitat / 200;
            quantitat = quantitat % 200;

            int monedes1Euro = quantitat / 100;
            quantitat = quantitat % 100;

            int monedes50 = quantitat / 50;
            quantitat = quantitat % 50;

            int monedes20 = quantitat / 20;
            quantitat = quantitat % 20;

            int monedes10 = quantitat / 10;
            quantitat = quantitat % 10;

            int monedes5 = quantitat / 5;
            quantitat = quantitat % 5;

            int monedes2 = quantitat / 2;
            quantitat = quantitat % 2;

            int monedes1 = quantitat;

            if (monedes2Euros > 0)
                System.out.println(monedes2Euros + " moneda/es de 2 euros");

            if (monedes1Euro > 0)
                System.out.println(monedes1Euro + " moneda/es d'1 euro");

            if (monedes50 > 0)
                System.out.println(monedes50 + " moneda/es de 50 cèntims");

            if (monedes20 > 0)
                System.out.println(monedes20 + " moneda/es de 20 cèntims");

            if (monedes10 > 0)
                System.out.println(monedes10 + " moneda/es de 10 cèntims");

            if (monedes5 > 0)
                System.out.println(monedes5 + " moneda/es de 5 cèntims");

            if (monedes2 > 0)
                System.out.println(monedes2 + " moneda/es de 2 cèntims");

            if (monedes1 > 0)
                System.out.println(monedes1 + " moneda/es d'1 cèntim");
        }

        sc.close();
    }
}
         
       
        // TODO: llegeix una quantitat en cèntims (comprova que sigui >= 0)
        //   Mostra la quantitat mínima de monedes de 1, 2, 5, 10, 20, 50, 100 i 200 cèntims
        //   Només mostra les línies amb quantitat > 0
    

