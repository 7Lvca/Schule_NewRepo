package Schaltung;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Kabel extends Baustein {
    Kabel(int x, int y) {
        super(x,y, 5, 70);
    }
    private Baustein start;
    private Baustein end;

    public void connect(Baustein start, Baustein end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(0, 0, height -1 , width- 1);
    }

    @Override
    protected void toggleZustand() {
    }
}
