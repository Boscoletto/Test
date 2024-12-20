import java.util.Scanner;

public class BuoniPropositi {
    public static void main(String[] args) {
        String[] buoniPropositi = {
            "Fare più attività fisica",
            "Esercitarsi su Java",
            "Leggere almeno un libro al mese",
            "Mangiare più sano",
            "Dormire almeno 8 ore a notte"
        };
        boolean[] completati = new boolean[buoniPropositi.length];
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean tuttiCompletati = true;
            for (boolean completato : completati) {
                if (!completato) {
                    tuttiCompletati = false;
                    break;
                }
            }
            if (tuttiCompletati) {
                System.out.println("\nHai completato tutti i tuoi buoni propositi! Bravissimo!");
                break;
            }

            System.out.println("\nEcco i tuoi buoni propositi:");
            for (int i = 0; i < buoniPropositi.length; i++) {
                if (!completati[i]) {
                    System.out.println((i + 1) + ". " + buoniPropositi[i]);
                }
            }

            System.out.print("\nIndica il numero del proposito che hai completato: ");
            int scelta = scanner.nextInt();

            if (scelta >= 1 && scelta <= buoniPropositi.length && !completati[scelta - 1]) {
                completati[scelta - 1] = true;
                System.out.println("Complimenti! Hai completato: \"" + buoniPropositi[scelta - 1] + "\".");
            } else {
                System.out.println("Scelta non valida o già completata. Riprova.");
            }
        }

        scanner.close();
    }
}