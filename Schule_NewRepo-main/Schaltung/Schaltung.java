package Schaltung;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JMenu;

public class Schaltung extends JPanel {
	Schaltung() {
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(null);

    	BausteinFactory bausteinFactory = new BausteinFactory();
		Baustein lampe = bausteinFactory.erstellen("Lampe");

		JMenuBar menuBar = new JMenuBar();
		JMenu erstellenMenu = new JMenu("Erstellen");

		JMenuItem addLampe = new JMenuItem("Lampe");
		JMenuItem addSchalter = new JMenuItem("Schalter");
		JMenuItem addKabel = new JMenuItem("Kabel");

		erstellenMenu.add(addKabel);
		menuBar.add(addKabel);

		this.add(menuBar);
		this.add(lampe);
	}
}