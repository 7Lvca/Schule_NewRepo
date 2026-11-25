package Schaltung;

import java.awt.Color;
import java.awt.Graphics;

public class Schalter extends Baustein {
	Schalter() {
        super(30, 20, 30, 30);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (zustand == true) {
			g.setColor(Color.GREEN);
		}
		else {
			g.setColor(Color.RED);
		}
		g.fillRect(0, 0, height -1 , width- 1);
	}
	
	@Override
	protected void toggleZustand() {
		zustand = !zustand;
		getParent().repaint();
	}
}
