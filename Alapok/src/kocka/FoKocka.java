package kocka;


import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
public class FoKocka extends JFrame{
	
	
	public static void main(String arg[]) {
		new FoKocka();
	}
	public FoKocka() {
		
		
		setSize(508, 286);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Grafkocka t = new Grafkocka();
		add(t);
		setVisible(true);
		

		//billentyûzet érték beolvasása
		
		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
			}
			public void keyReleased(KeyEvent e) {
				t.gombelenged=e.getKeyCode();
			}
			public void keyPressed(KeyEvent e) {
				t.gomb=e.getKeyCode();
			}
		});
		
		
		
		addMouseListener (new MouseListener(){
	public void mouseExited(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		t.egerf=1;
	}
	public void mousePressed(MouseEvent e) {
		t.egerx=e.getX()-8;
		t.egery=e.getY()-36;
	}
	public void mouseClicked(MouseEvent e) {
	}
		});

	}
}