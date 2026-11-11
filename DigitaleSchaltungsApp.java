package Schaltung;

import javax.swing.JFrame;

public class DigitaleSchaltungsApp extends JFrame {
    final int screenX = 300;
    final int screenY = 200;

	DigitaleSchaltungsApp() {
        this.setSize(screenX,
                screenY);
        this.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        Schaltung schaltung = new Schaltung();
        add(schaltung);
	}
}
