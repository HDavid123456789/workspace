package pattogas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Rajztabla extends JPanel {
	int vonalHossz = 10;
	int y = 0;
	boolean fel = true;
	boolean labdaLathato = false;
	boolean pattog = true;
	public Rajztabla() {
		new Thread(new Runnable() {
			public void run() {
				while (true) {
					if (pattog) {
						if (getWidth() != 0) {
							if (vonalHossz < getWidth()) {
								vonalHossz = vonalHossz + 5;
							} else {
								labdaLathato = true;
								if (fel == true) {
									y++;
									if (y > 300) {
										fel = false;
									}
								} else {
									y--;
									if (y < 0) {
										fel = true;
									}
								}
							}
						}
					}
					repaint(); // újrarajzolás kikényszerítése
					try {
						Thread.sleep(5); // A szál elaltatása. Jobb egér
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
	public void paintComponent(Graphics g) { // megjelenítés
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0, getWidth(), getHeight());
		g2.setColor(Color.BLACK);
		g2.drawLine(getWidth(), 400, getWidth() - vonalHossz, 400);
		g2.drawLine(0, 80, vonalHossz, 80);
		if (labdaLathato) {
			g2.setColor(Color.RED);
			g2.fillArc(100, 380 - y, 20, 20, 0, 360);
			g2.setColor(Color.YELLOW);
			g2.fillArc(200, 380 - y, 20, 20, 0, 360);
			g2.setColor(Color.GREEN);
			g2.fillArc(300, 380 - y, 20, 20, 0, 360);
			g2.setColor(Color.BLUE);
			g2.fillArc(400, 380 - y, 20, 20, 0, 360);
		}
	}
	
	public void pattogj(boolean pattogas) {
		this.pattog = pattogas;
	}
	public boolean pattogEppen() {
		return pattog;
	}
}
