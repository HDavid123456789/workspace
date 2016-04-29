package jatek003;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
public class FoFlappy extends JFrame{
	public static void main(String arg[]) {
		new FoFlappy();
	}
	
	public FoFlappy() {
		Toolkit tk=Toolkit.getDefaultToolkit();
		int x=(int) tk.getScreenSize().getWidth();
		int y =(int)tk.getScreenSize().getHeight();
		this.setSize(x, y);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GrafFlappy t = new GrafFlappy();
		add(t);
		setUndecorated(true);
		setResizable(false);
		setVisible(true);
		t.y=y;
		t.x=x;

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
		t.egerx=e.getX();
		t.egery=e.getY();
	}
	public void mouseClicked(MouseEvent e) {
	}
	});
		addMouseMotionListener(new MouseMotionAdapter() {
	          public void mouseDragged(MouseEvent e) {
	        	  t.xa=e.getX();
	        	  t.ya=e.getY();
	              
	          }
	      });
		  addMouseMotionListener(new MouseMotionAdapter() {
	          public void mouseMoved(MouseEvent e) {
	        	  t.xa=e.getX();
	        	  t.ya=e.getY();
	              
	          }
	      });
		  setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB), new Point(0, 0), "cursor"));
		}
}