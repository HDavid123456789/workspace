package kocka;

import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Toolkit;
public class FoKocka extends JFrame{
	
	
	public static void main(String arg[]) {
		new FoKocka();
	}
	public FoKocka() {
		setSize(728, 486);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Grafkocka t = new Grafkocka();
		add(t);
		setVisible(true);
		

		//billentyûzet érték beolvasása	
		
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
		
		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
			}
			public void keyReleased(KeyEvent e) {
				t.gombelenged=e.getKeyCode();
			}
			public void keyPressed(KeyEvent e){
				t.gomb=e.getKeyCode();
			}
		});
		
		}
}
