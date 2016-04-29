package uj;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
public class Fo extends JFrame{
	
	public static void main(String arg[]) {
		new Fo();
	}
	
	public Fo() {
		// monitor méretének bekérése
		//A TOOLKITNÉL NEM AZ ELSÕ IMPORT A JÓ LEGTÖBB ESETBEN!!!!!!!!!!!!!!
		Toolkit tk=Toolkit.getDefaultToolkit();
		int x=(int) tk.getScreenSize().getWidth();
		int y =(int)tk.getScreenSize().getHeight();
		
		//méret = xmax, ymax
		setSize(x, y);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Graf t = new Graf();
		add(t);
		setUndecorated(true);//látható-e a felsõ sor
		setResizable(false);//méretezhetés
		setVisible(true);  //látható*e az ablak(ez mindig legyen true)
		t.x=x;  //átírás a másik osztályba
		t.y=y;

		
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
		
		//kattintás (ha elmozdul az egér kattintás altt nem érzékel)
		
		addMouseListener (new MouseListener(){
	public void mouseExited(MouseEvent e) {
 
	}
	public void mouseEntered(MouseEvent e) {
		//katt
	}
	public void mouseReleased(MouseEvent e) {
		//elengedés (kattintás utáni)
	}
	public void mousePressed(MouseEvent e) {
		//koordináták
		t.kattx=e.getX();
		t.katty=e.getY();
	}
	public void mouseClicked(MouseEvent e) {
	}
	});
		
		
		
		//vonszolás (kattintás alatti mozgatás)
		
		addMouseMotionListener(new MouseMotionAdapter() {
	          public void mouseDragged(MouseEvent e) {
	        	  
	        	  //azért kell ide is megadni a sima egér mozgását, mert alapból megállna a kurzor ahol utoljára nem volt vonszolás
	        	  t.xmozgas=e.getX();
	        	  t.ymozgas=e.getY();
	              
	          }
	      });
		
		
		
		//alapmozgás (mikor nincs kattintás)
		
		  addMouseMotionListener(new MouseMotionAdapter() {
	          public void mouseMoved(MouseEvent e) {
	        	  t.xmozgas=e.getX();
	        	  t.ymozgas=e.getY();
	          }
	      });
		  
		  //kurzor elrejtése
		  setCursor(Toolkit.getDefaultToolkit().createCustomCursor
		(new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB), 
		new Point(0, 0), "cursor"));
		}
}