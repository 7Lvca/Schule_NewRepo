package Schaltung;
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public abstract class Baustein extends JComponent {
	int height = 30;
	int width = 30;
	int posX = 0;
	int posY = 0;
	protected boolean zustand = true;
	private boolean darfBewegen = false;
	
	protected abstract void toggleZustand();

	public Baustein(int x, int y, int h, int w) {
		this.posX = x;
		this.posY = y;
		this.height = h;
		this.width = w;
		this.setBounds(this.getPosX(), this.getPosY(), height, width);
		this.addMouseListener(new MeinMouseListener());
		this.addMouseMotionListener(new MeinMouseMotionListener());
	}
	
	public Baustein() {
		this(0, 0, 30, 30);
	}

	int getPosX() { return posX; }
	int getPosY() { return posY; }


	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	private class MeinMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON1) {
				toggleZustand();
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON1) {
				height = e.getXOnScreen();
				width = e.getYOnScreen();

				posX = getX();
				posY = getY();

				darfBewegen = true;
			}

			if (e.getButton() == MouseEvent.BUTTON3) {
				// Hier Linie malen
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			darfBewegen = false;
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
	private class MeinMouseMotionListener implements MouseMotionListener {
		@Override
		public void mouseDragged(MouseEvent e) {
			if (darfBewegen) {
				int deltaX = e.getXOnScreen() - height;
				int deltaY = e.getYOnScreen() - width;
				setLocation(posX + deltaX, posY + deltaY);
			}
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			}
	}
}
