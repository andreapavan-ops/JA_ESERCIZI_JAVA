import javax.swing.*;
import java.awt.*;

public class SalutoApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Saluto");
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Inserisci il tuo nome:");
        JTextField campo = new JTextField(15);
        JButton bottone = new JButton("Saluta!");
        JLabel risultato = new JLabel("");

        // Quando clicchi il bottone...
        bottone.addActionListener(e -> {
            String nome = campo.getText();
            risultato.setText("Ciao, " + nome + "! 👋");
        });

        frame.add(label);
        frame.add(campo);
        frame.add(bottone);
        frame.add(risultato);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

