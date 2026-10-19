import java.util.Calendar;

public class AccesDiaHora {

    public static void main(String[] args) {
        // 1. Fecha del ordinador 
        Calendar ara = Calendar.getInstance();

        // 2. Dia i hora actual
        int dia = ara.get(Calendar.DAY_OF_WEEK);
        int hora = ara.get(Calendar.HOUR_OF_DAY);

        if (dia == Calendar.SATURDAY) {
            System.out.println("NO pots entrar: és dissabte!");
        } else {
            if (dia == Calendar.SUNDAY) {
                System.out.println("No pots entrar: és diumenge!");
            } else {
                if (hora < 8) {
                    System.out.println("No pots entrar: Encara no són es 08:00 hores!");
                } else {
                    System.out.println("Benvingut a l'aplicació!!");
                }
            }
        }
    }
}

// Aquesta activitat depèn de l'hora real de l'ordinador, no té una sortida fixa per provar.*********