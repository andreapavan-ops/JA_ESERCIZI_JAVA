
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ListaDellaSpesa 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
            
        System.out.print("Aggiungi articolo: ");
        String articolo = scanner.nextLine();  // legge il nome dell'articolo

        System.out.print("Aggiungi categoria: ");
        String categoria = scanner.nextLine();  // legge il nome dell'articolo

        System.out.print("Prezzo articolo: ");
        double prezzo_articolo = scanner.nextDouble();

        System.out.print("Quantità articoli: ");
        double n_articolo = scanner.nextDouble();


        System.out.println("Hai aggiunto: " + articolo + "- categoria " + categoria + " - Prezzo: " + prezzo_articolo + "€" + "- Unità N:" + n_articolo);
    } 
}    



public class ListaDellaSpesa 
{
            private List<Map<String, Object>> articoli;
            private Scanner scanner;

    public ListaDellaSpesa() 
    {
        articoli = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void avvia() 
    {
        int scelta;

        do {
            System.out.println("\n--- MENU LISTA DELLA SPESA ---");
            System.out.println("1. Aggiungi articolo");
            System.out.println("2. Visualizza articoli");
            System.out.println("3. Esci");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();
            scanner.nextLine(); // pulizia buffer

            switch (scelta) {
                case 1:
                    aggiungiArticolo();
                    break;
                case 2:
                    visualizzaArticoli();
                    break;
                case 3:
                    System.out.println("Uscita...");
                    break;
                default:
                    System.out.println("Scelta non valida!");
            }
    
    }
             /* 
            // Attributi
            // Costruttore
            public ListaDellaSpesa() { }

            // Menu
            private void mostraMenu() { }
            private void elaboraScelta(int scelta) { }

            // Operazioni CRUD
            private void aggiungiArticolo() { }
            private void visualizzaLista() { }
            private void rimuoviArticolo() { }
            private void cercaArticolo() { }
            private void marcaAcquistato() { }

            // Calcoli
            private void calcolaTotale() { }
            private double calcolaSpesaTotale() { }
            private double calcolaSpesaNonAcquistata() { }

            // File
            private void salvasuFile() { }
            private void caricaDaFile() { }

            // Metodo principale
            public void esegui() { }

            public static void main(String[] args) { }

            */

    }

}
