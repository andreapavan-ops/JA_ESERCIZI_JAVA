import javax.swing.*;

import apple.laf.JRSUIConstants.FrameOnly;

public class PrimaFinestra {
    public static void main(String[] args) {
        // 1. Crea la finestra
        JFrame frame = new JFrame("Ciao Mondo!");

        // 2. Imposta le dimensioni (larghezza x altezza in pixel)
        frame.setSize(400, 400);

        // 3. IMPORTANTE: Chiudi il programma quando chiudi la finestra
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 4. Centra la finestra nello schermo
        frame.setLocation(0, 0);

        // 5. FONDAMENTALE: Rendi visibile la finestra!
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setVisible(true);
    }
}