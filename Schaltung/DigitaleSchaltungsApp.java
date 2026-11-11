package Schaltung;

import javax.swing.JFrame;

public class DigitaleSchaltungsApp extends JFrame {
	DigitaleSchaltungsApp() {
        this.setSize(300,
                      200);
        this.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        Schaltung schaltung = new Schaltung();
        var vorgaenger = schaltung.getComponent(0);
        
        for (var c : schaltung.getComponents()) {
        	if (c instanceof Schalter && ((Schalter) c).getZustand() == true && vorgaenger instanceof Lampe) {
        		vorgaenger.
        	}
        	vorgaenger = c;
        }
        add(schaltung); 
	}
}
