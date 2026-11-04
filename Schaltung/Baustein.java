package Schaltung;
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class Baustein extends JComponent {
	int height = 30;
	int width = 30;
	int posX = 0;
	int posY = 0;
	protected boolean zustand = true;
	
	protected abstract void toggleZustand();
	
	public Baustein(int x, int y) {
		this.posX = x;
		this.posY = y;
		this.setBounds(this.getPosX(), this.getPosY(), height, width);
		this.addMouseListener(new MeinMouseListener());
	}
	
	public Baustein() {
		this(0, 0);
	}
	
	int getPosX() { return posX; }
	int getPosY() { return posY; }
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawRect(0, 0, height -1 , width- 1);
		
	}
	

	
	private class MeinMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			toggleZustand();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
