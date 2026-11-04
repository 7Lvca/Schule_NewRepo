package Schaltung;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Lampe extends Baustein {
	Lampe(int x, int y) {
		super(x, y);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.yellow);
		g.fillRect(0, 0, height -1 , width- 1);
	}
	
	@Override
	protected void toggleZustand() {
	}
}
