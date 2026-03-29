import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Prova_icona {
    public static void main(String[] args) {
        try {
            // Carica il font FontAwesome Solid
            Font fontAwesome = Font.createFont(Font.TRUETYPE_FONT, 
                new File("Font_Awesome_7_Free-Solid-900.otf")).deriveFont(48f);
            
            JFrame frame = new JFrame("Test Icone FontAwesome");
            frame.setLayout(new FlowLayout());
            
            // Icona cuore rosso
            JLabel heart = new JLabel("\uf004");
            heart.setFont(fontAwesome);
            heart.setForeground(Color.RED);
            
            // Icona stella arancione (più grande)
            JLabel star = new JLabel("\uf005");
            star.setFont(fontAwesome.deriveFont(64f));
            star.setForeground(Color.ORANGE);
            
            // Icona casa blu (più piccola)
            JLabel home = new JLabel("\uf015");
            home.setFont(fontAwesome.deriveFont(32f));
            home.setForeground(Color.BLUE);
            
            frame.add(heart);
            frame.add(star);
            frame.add(home);
            
            frame.setSize(400, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}