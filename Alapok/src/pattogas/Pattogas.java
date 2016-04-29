package pattogas;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Pattogas extends JFrame {
	public static void main(String arg[]) {
		new Pattogas();
	}
	public Pattogas() {
		setSize(700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		final Rajztabla t = new Rajztabla();
		add(t);
		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
			}
			public void keyReleased(KeyEvent e) {
			}
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());
				if (e.getKeyCode() == 65) {
					if (t.pattogEppen()) {
						t.pattogj(false);
					} else {
						t.pattogj(true);
					}
				}
			}
		});
		setVisible(true);
	}
}
