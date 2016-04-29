package idopixel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JFrame;
public class Fo extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public static void main(String arg[]) {
		new Fo();

	}
	public Fo() {
		 setTitle("Ido (pottyok kirajzolasa");
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Graf t = new Graf();
		add(t);
		setResizable(false);
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
		t.egerx=e.getX();
		t.egery=e.getY();
		t.egergomb=e.getButton();
	}
	public void mouseClicked(MouseEvent e) {
	}
	});
		addMouseMotionListener(new MouseMotionAdapter() {
	          public void mouseDragged(MouseEvent e) {
	        	  t.xv=e.getX();
	        	  t.yv=e.getY();
	              
	          }
	          public void mouseMoved(MouseEvent e) {
	        	  t.xa=e.getX();
	        	  t.ya=e.getY();
	              
	          }
	      });
		
		addMouseWheelListener(new MouseWheelListener() {
		    public void mouseWheelMoved(MouseWheelEvent e) {
		        t.gorgo=e.getWheelRotation();
		    }
		});
		}
}
