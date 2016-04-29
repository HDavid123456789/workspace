package jatek002;

import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.sun.glass.events.WindowEvent;

public class Foprogram extends JFrame{
	
	
	public static void main(String arg[]) {
		new Foprogram();
	}
	public Foprogram() {
		
		
		setSize(700, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Grafika t = new Grafika();
		add(t);
		setVisible(true);
		

		//billentyûzet érték beolvasása
		
		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
			}
			public void keyReleased(KeyEvent e) {
			}
			public void keyPressed(KeyEvent e) {
					t.billentyu=e.getKeyCode();
			}
		});
		
		
		
		addMouseListener (new MouseListener(){
	public void mouseExited(MouseEvent e) {
 
	}
	public void mouseEntered(MouseEvent e) {
 
	}
	public void mouseReleased(MouseEvent e) {
 
	}
	public void mousePressed(MouseEvent e) {
 
	}
	public void mouseClicked(MouseEvent e) {
		setTitle(Integer.toString(e.getX()) + " " + Integer.toString(e.getY()));
		System.out.println(e.getX()+ " " + Integer.toString(e.getY()));
	}
	});
		
		
		}
}