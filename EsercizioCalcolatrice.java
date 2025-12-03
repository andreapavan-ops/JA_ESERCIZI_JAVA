import java.util.Scanner;

public class EsercizioCalcolatrice {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Scrivi il primo numero: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Scrivi il secondo numero: ");
            double numero2 = scanner.nextDouble();

            scanner.nextLine(); // Consuma il newline rimasto dopo nextInt()

            System.out.print("Scrivi un'operazione (+, -, *, /): ");
            String operazione = scanner.nextLine(); // OPERAZIONE come String

    if ("+".equals(operazione)) 
        {
    double risultato = numero1 + numero2;
        System.out.println("Risultato: " + risultato);
        }
    else if ("-".equals(operazione)) 
        {
    double risultato = numero1 - numero2;
        System.out.println("Risultato: " + risultato);
        }
    else if ("*".equals(operazione)) 
        {
    double risultato = numero1 * numero2;
        System.out.println("Risultato: " + risultato);
        }
    else if ("/".equals(operazione)) 
        {
            if (numero2==0) {
                    System.out.println("Risultato: operazione impossibile dividere per zero");
            }
            else {
            double risultato = numero1 / numero2;
            System.out.println("Risultato: " + risultato);
            }
       }

    else {
        System.out.println("Operazione non riconosciuta");
    }

            scanner.close();
    }
}
