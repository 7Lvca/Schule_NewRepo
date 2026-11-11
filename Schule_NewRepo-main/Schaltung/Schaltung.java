package Schaltung;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Schaltung extends JPanel {
	private void erstelleKabel() {
		Kabel kabel = new Kabel(50, 50);
		this.add(kabel);
		this.repaint();
	}
	Schaltung() {
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(null);

		Lampe lampe = new Lampe(20, 20, 30, 30);
		Schalter schalter = new Schalter(55, 55, 30, 30);
		JButton button = new JButton("Neues Kabel");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				erstelleKabel();
			}
		});
		button.setBounds(100, 5, 130, 30) ;

		this.add(lampe);
		this.add(schalter);
		this.add(button);
	}
}