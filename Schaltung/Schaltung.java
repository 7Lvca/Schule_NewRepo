package Schaltung;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Schaltung extends JPanel {
	Schaltung() {
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(null);
		
		Lampe lampe = new Lampe(20, 20);	
		Schalter schalter = new Schalter(55, 55);
		
		this.add(lampe);
		this.add(new Schalter(220, 110));
		this.add(new Schalter(50, 90));
		this.add(schalter);
		
		
	}
}