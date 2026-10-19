// Activitat 23 — Dies del mes (switch amb casos agrupats)
import java.util.Scanner;

public class DiesDelMes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix un número de mes (1-12):");
        int mes = sc.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Aquest mes té 31 dies");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Aquest mes té 30 dies");
                break;

            case 2:
                System.out.println("Aquest mes té 28 dies");
                break;

            default:
                System.out.println("Error: el número de mes ha d'estar entre 1 i 12");
        }

        sc.close();
    }
}