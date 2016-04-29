package szimulacio;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
public class Fo extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public static void main(String arg[]) {
		new Fo();

	}
	public Fo() {
		 setTitle("J�t�k - Horv�th D�vid");
		Toolkit tk=Toolkit.getDefaultToolkit();
		int x=(int) tk.getScreenSize().getWidth();
		int y =(int)tk.getScreenSize().getHeight();
		setSize(x, y);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Graf t = new Graf();
		add(t);
		setUndecorated(true);
		setResizable(false);
		setVisible(true);
		t.x=x;
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
		  setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB), new Point(0, 0), "cursor"));
		}
}