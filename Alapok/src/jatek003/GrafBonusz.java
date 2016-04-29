package jatek003;
import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class GrafBonusz extends JPanel	{
	public static void main(String arg[]) {
		new GrafBonusz();
	}
	 Image hatter;
	 Image kurzor;
	 Image fu; 
	 Image fold;
	 Image sor;
	//változók
	int xk=0;
	int yk=0;
	int gomb=0;
	int egerx=0; int egery=0;
	int xa; int ya;
	int xhatter=0;
	int xi=0;
	int yi=0;
	Random r = new Random();
	
	String alap=
	"/***************"+
	"/***************"+
	"/***************"+
	"/***************"+
	"/***************"+
	"/*********aaa***"+
	"/***************"+
	"/***************"+
	"/aaaaaaaaaaaaaaa";
	
	String jelek="*ab/";
	
	public GrafBonusz() {
		
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
			
								
						
							}
							repaint(); 
							try {
								Thread.sleep(1); 
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				}).start();
	}
	

	
	

	//kijelzés
		//színek
	
		public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		//háttér
		
		g2.drawImage(hatter,xhatter, 0, xk, yk*21/19, null);	
			xi=0; yi=-1;
		for(int i=0; i<alap.length(); i=i+1){
			xi=xi+1;
			if(alap.charAt(i)==jelek.charAt(1)){
			g2.drawImage(fu, xi*xk/15, yi*yk/9, xk/15, yk/9,null);
			}
			if(alap.charAt(i)==jelek.charAt(2)){
				g2.drawImage(fold, xi*xk/15, yi*yk/9, xk/15, yk/9,null);
			}
			if(alap.charAt(i)==jelek.charAt(3)){
				xi=-1;
				yi=yi+1;
			}
			}
		
		
		g2.drawImage(kurzor,xa, ya, 30, 45, null);
}
	}
