import java.util.*;
import java.io.*;

public class ListaDellaSpesa {
    // Attributi
    private List<Map<String, Object>> articoli;
    private Scanner scanner;

     // Costruttore
    public ListaDellaSpesa() {
        articoli = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // ----------------- Menu -----------------
    private void mostraMenu() {
        System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("║    GESTIONE LISTA DELLA SPESA        ║");
        System.out.println("╠═══════════════════════════════════════╣");
        System.out.println("║ 1. Aggiungi articolo                 ║");
        System.out.println("║ 2. Visualizza lista                  ║");
        System.out.println("║ 3. Rimuovi articolo                  ║");
        System.out.println("║ 4. Cerca articolo                    ║");
        System.out.println("║ 5. Marca come acquistato             ║");
        System.out.println("║ 6. Calcola totale spesa              ║");
        System.out.println("║ 7. Salva su file                     ║");
        System.out.println("║ 8. Carica da file                    ║");
        System.out.println("║ 9. Esci                              ║");
        System.out.println("╚═══════════════════════════════════════╝");
        System.out.print("Seleziona un'opzione: ");
    }

    // -------------- Opzione 1 ---------------
    private void aggiungiArticolo() {
        System.out.print("Inserisci nome articolo: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci categoria: ");
        String categoria = scanner.nextLine();

        System.out.print("Inserisci prezzo unitario: ");
        double prezzo = Double.parseDouble(scanner.nextLine());

        System.out.print("Inserisci quantità: ");
        int quantita = Integer.parseInt(scanner.nextLine());

        Map<String, Object> articolo = new HashMap<>();
        articolo.put("nome", nome);
        articolo.put("categoria", categoria);
        articolo.put("prezzo", prezzo);
        articolo.put("quantita", quantita);
        articolo.put("acquistato", false);

        articoli.add(articolo);

        System.out.println("\n✓ Articolo aggiunto!\n");
    }

    // -------------- Opzione 2 ---------------
    public void visualizzaLista() {
        if (articoli.isEmpty()) {
            System.out.println("\nLa lista è vuota.\n");
            return;
        }

        System.out.println("\nLista della spesa:");
        int i = 1;
        for (Map<String, Object> a : articoli) {
            System.out.println(i + ". " + a.get("nome") +
                    " | Categoria: " + a.get("categoria") +
                    " | Prezzo: " + a.get("prezzo") +
                    " | Quantità: " + a.get("quantita") +
                    " | Acquistato: " + ((boolean)a.get("acquistato") ? "Sì" : "No"));
            i++;
        }
        System.out.println();
    }

    // -------------- Opzione 3 ---------------
    public void rimuoviArticolo() {
        visualizzaLista();
        if (articoli.isEmpty()) return;

        System.out.print("Inserisci il numero dell'articolo da rimuovere: ");
        int idx = Integer.parseInt(scanner.nextLine()) - 1;

        if (idx >= 0 && idx < articoli.size()) {
            articoli.remove(idx);
            System.out.println("\n✓ Articolo rimosso!\n");
        } else {
            System.out.println("\n❌ Numero non valido.\n");
        }
    }

    // -------------- Opzione 4 ---------------
    public void cercaArticolo() {
        System.out.print("Inserisci il nome dell'articolo da cercare: ");
        String nome = scanner.nextLine().toLowerCase();

        boolean trovato = false;
        for (Map<String, Object> a : articoli) {
            if (((String)a.get("nome")).toLowerCase().contains(nome)) {
                System.out.println("- " + a.get("nome") +
                        " | Categoria: " + a.get("categoria") +
                        " | Prezzo: " + a.get("prezzo") +
                        " | Quantità: " + a.get("quantita") +
                        " | Acquistato: " + ((boolean)a.get("acquistato") ? "Sì" : "No"));
                trovato = true;
            }
        }

        if (!trovato) System.out.println("\nNessun articolo trovato.\n");
        else System.out.println();
    }

    // -------------- Opzione 5 ---------------
    public void marcaAcquistato() {
        visualizzaLista();
        if (articoli.isEmpty()) return;

        System.out.print("Inserisci il numero dell'articolo da marcare come acquistato: ");
        int idx = Integer.parseInt(scanner.nextLine()) - 1;

        if (idx >= 0 && idx < articoli.size()) {
            articoli.get(idx).put("acquistato", true);
            System.out.println("\n✓ Articolo marcato come acquistato!\n");
        } else {
            System.out.println("\n❌ Numero non valido.\n");
        }
    }

    // Calcoli
    // -------------- Opzione 6 ---------------
    public void calcolaTotale() {
        double totale = 0;
        for (Map<String, Object> a : articoli) {
            totale += (double)a.get("prezzo") * (int)a.get("quantita");
        }
        System.out.println("\nTotale spesa: " + totale + " €\n");
    }

    // -------------- Opzione 7 ---------------
    public void salvaSuFile() {
        System.out.print("Inserisci nome file: ");
        String fileName = scanner.nextLine();

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(articoli);
            System.out.println("\n✓ Lista salvata su file!\n");
        } catch (IOException e) {
            System.out.println("\n❌ Errore nel salvataggio del file.\n");
        }
    }

    // File
    // -------------- Opzione 8 ---------------
    public void caricaDaFile() {
        System.out.print("Inserisci nome file: ");
        String fileName = scanner.nextLine();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            articoli = (List<Map<String, Object>>) in.readObject();
            System.out.println("\n✓ Lista caricata dal file!\n");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("\n❌ Errore nel caricamento del file.\n");
        }
    }

    // -------------- Metodo principale ---------------
    public static void main(String[] args) {
        ListaDellaSpesa lista = new ListaDellaSpesa();
        Scanner sc = new Scanner(System.in);
        int scelta;

        do {
            lista.mostraMenu();
            scelta = Integer.parseInt(sc.nextLine());

            switch (scelta) {
                case 1 -> lista.aggiungiArticolo();
                case 2 -> lista.visualizzaLista();
                case 3 -> lista.rimuoviArticolo();
                case 4 -> lista.cercaArticolo();
                case 5 -> lista.marcaAcquistato();
                case 6 -> lista.calcolaTotale();
                case 7 -> lista.salvaSuFile();
                case 8 -> lista.caricaDaFile();
                case 9 -> System.out.println("Arrivederci!");
                default -> System.out.println("Opzione non valida.");
            }
        } while (scelta != 9);
    }
}
