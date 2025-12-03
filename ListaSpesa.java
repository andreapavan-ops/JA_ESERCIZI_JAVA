import java.util.List;
import java.util.Map;
import java.util.Scanner;




public class ListaSpesa {
    

    public static void main(String[] args) 

    private void mostraMenu() {

 Scanner scanner = new Scanner(System.in);
    int scelta;

    do {
        System.out.println("===== MENU =====");
        System.out.println("1. Aggiungi articolo");
        System.out.println("2. Visualizza lista");
        System.out.println("3. Rimuovi articolo");
        System.out.println("3. Cerca articolo");




        System.out.print("Inserisci la tua scelta: ");

        scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                System.out.println("Hai scelto l’opzione 1");
                break;
            case 2:
                System.out.println("Hai scelto l’opzione 2");
                break;
            case 3:
                System.out.println("Uscita dal menu…");
                break;
            default:
                System.out.println("Scelta non valida.");
        }





        
    }
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


public class ListaDellaSpesa {

    // Attributi
    private List<Map<String, Object>> articoli;
    private Scanner scanner;

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
}




    
}

