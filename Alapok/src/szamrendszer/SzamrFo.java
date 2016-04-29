//HASZN�LAT:
//a g�rg�vel �s a k�t kis feh�r r�sszel lehet sz��mrendszert v�lasztanni(2-20)
//a sz�mot a billenyt�zeten l�v� sz�mok megnom�s�val lehet be�rni
package szamrendszer;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JFrame;
public class SzamrFo extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public static void main(String arg[]) {
		new SzamrFo();

	}
	public SzamrFo() {
		 setTitle("Sz�mrendszer - Horv�th D�vid");
		setSize(810, 425);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		SzamrGraf t = new SzamrGraf();
		add(t);
		setUndecorated(false);
		setResizable(true);
		setVisible(true);
		
		//billenty�zet �rt�k beolvas�sa
		
		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
			}
			public void keyReleased(KeyEvent e) {
			}
			public void keyPressed(KeyEvent e) {
				t.gomb=e.getKeyCode();
				t.gomb2=e.getKeyChar();
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
		t.egery=e.getY()-18;
		t.egergomb=e.getButton();
	}
	public void mouseClicked(MouseEvent e) {
	}
	});
		addMouseMotionListener(new MouseMotionAdapter() {
	          public void mouseDragged(MouseEvent e) {
	        	  t.xa=e.getX();
	        	  t.ya=e.getY();
	              
	          }
	          public void mouseMoved(MouseEvent e) {
	        	  t.xa=e.getX();
	        	  t.ya=e.getY()-18;
	              
	          }
	      });
		
		addMouseWheelListener(new MouseWheelListener() {
		    public void mouseWheelMoved(MouseWheelEvent e) {
		        t.gorgo=e.getWheelRotation();
		    }
		});

		}
}
