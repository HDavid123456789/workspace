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
		// monitor m�ret�nek bek�r�se
		//A TOOLKITN�L NEM AZ ELS� IMPORT A J� LEGT�BB ESETBEN!!!!!!!!!!!!!!
		Toolkit tk=Toolkit.getDefaultToolkit();
		int x=(int) tk.getScreenSize().getWidth();
		int y =(int)tk.getScreenSize().getHeight();
		
		//m�ret = xmax, ymax
		setSize(x, y);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Graf t = new Graf();
		add(t);
		setUndecorated(true);//l�that�-e a fels� sor
		setResizable(false);//m�retezhet�s
		setVisible(true);  //l�that�*e az ablak(ez mindig legyen true)
		t.x=x;  //�t�r�s a m�sik oszt�lyba
		t.y=y;

		
		//billenty�zet �rt�k beolvas�sa
		
		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
			}
			public void keyReleased(KeyEvent e) {
			}
			public void keyPressed(KeyEvent e) {
				t.gomb=e.getKeyCode();
			}
		});
		
		//kattint�s (ha elmozdul az eg�r kattint�s altt nem �rz�kel)
		
		addMouseListener (new MouseListener(){
	public void mouseExited(MouseEvent e) {
 
	}
	public void mouseEntered(MouseEvent e) {
		//katt
	}
	public void mouseReleased(MouseEvent e) {
		//elenged�s (kattint�s ut�ni)
	}
	public void mousePressed(MouseEvent e) {
		//koordin�t�k
		t.kattx=e.getX();
		t.katty=e.getY();
	}
	public void mouseClicked(MouseEvent e) {
	}
	});
		
		
		
		//vonszol�s (kattint�s alatti mozgat�s)
		
		addMouseMotionListener(new MouseMotionAdapter() {
	          public void mouseDragged(MouseEvent e) {
	        	  
	        	  //az�rt kell ide is megadni a sima eg�r mozg�s�t, mert alapb�l meg�llna a kurzor ahol utolj�ra nem volt vonszol�s
	        	  t.xmozgas=e.getX();
	        	  t.ymozgas=e.getY();
	              
	          }
	      });
		
		
		
		//alapmozg�s (mikor nincs kattint�s)
		
		  addMouseMotionListener(new MouseMotionAdapter() {
	          public void mouseMoved(MouseEvent e) {
	        	  t.xmozgas=e.getX();
	        	  t.ymozgas=e.getY();
	          }
	      });
		  
		  //kurzor elrejt�se
		  setCursor(Toolkit.getDefaultToolkit().createCustomCursor
		(new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB), 
		new Point(0, 0), "cursor"));
		}
}