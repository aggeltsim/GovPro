package Percentage;

import javax.swing.SwingUtilities;

public class Main { public static void main(String[] args) {
        // Start the GUI application on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> new GUI());
    }
}
