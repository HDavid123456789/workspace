package szamolas;

import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.sun.glass.events.WindowEvent;

public class Tort extends JFrame{
	public static void main(String arg[]) {
		new Tort();
	}
	public Tort() {
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		TortGrafika t = new TortGrafika();
		add(t);
		setVisible(true);
		

		//billentyûzet érték beolvasása
		
		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
			}
			public void keyReleased(KeyEvent e) {
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
		 
			}
			public void mousePressed(MouseEvent e) {
		 
			}
			public void mouseClicked(MouseEvent e) {
				setTitle("törtszám számoló    koordináták: "+Integer.toString(e.getX()) + " " + Integer.toString(e.getY()));
				t.egerx=e.getX();
				t.egery=e.getY();
				t.katt=true;
				
			}
			});
		
		
		}
}