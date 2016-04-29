package jatek003;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class GrafFlappy2 extends JPanel	{
	public static void main(String arg[]) {
		new GrafFlappy2();
	}
	
	
	Image hatter; 
	Image madar; 
	Image kurzor;
	Image kilepes1;
	Image kilepes2;
	Image jatek1; 
	Image jatek2;
	Image fu; 
	Image fold; 
	Image sor;
	
	int xk=0;
	int yk=0;
	int gomb=0;
	int egerx=0; int egery=0;
	int xa; int ya;
	int xi=0;
	int yi=0;
	
	boolean vmenu=true;;
	boolean vbonusz=false;
	
	
	public GrafFlappy2() {
		ImageIcon c = new ImageIcon (getClass().getResource("grassbg1.gif"));
		hatter=c.getImage();
		ImageIcon b = new ImageIcon (getClass().getResource("kurzor.png"));
		kurzor=b.getImage();
		ImageIcon d = new ImageIcon (getClass().getResource("kilépés.png"));
		kilepes1=d.getImage();
		ImageIcon e = new ImageIcon (getClass().getResource("kilpés2.png"));
		kilepes2=e.getImage();
		ImageIcon f = new ImageIcon (getClass().getResource("játék1.png"));
		jatek1=f.getImage();
		ImageIcon g = new ImageIcon (getClass().getResource("játék2.png"));
		jatek2=g.getImage();
		ImageIcon h = new ImageIcon (getClass().getResource("fû.png"));
		fu=h.getImage();
		ImageIcon i = new ImageIcon (getClass().getResource("föld.png"));
		fold=i.getImage();
		ImageIcon j = new ImageIcon (getClass().getResource("sor.png"));
		sor=j.getImage();
		
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
								GrafMenu menu = new GrafMenu();
								GrafBonusz bonusz = new GrafBonusz();
								
								
								if(vmenu){
									add(menu);
								}
								if(menu.a){
									vmenu=false;
									vbonusz=true;
								}
								
								
								if(vbonusz){
									add(bonusz);
								}
										
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
		
		GrafMenu menu = new GrafMenu();
		GrafBonusz bonusz = new GrafBonusz();
		
		
		//menü
		
		if(vmenu){
			g2.drawImage(hatter,0, 0, xk, yk*21/19, null);		
			g2.setColor(Color.black);
			g2.fillRect(xk/2-(xk/10), yk/2-(yk/10), xk/5, yk/10);
			g2.fillRect(xk/2-(xk/15), yk/4*3-(yk/15), xk*10/75, yk/15);
			
			if(menu.kjatek){
				g2.drawImage(jatek2,xk/2-(xk/10)+5, yk/2-(yk/10)+5, xk/5-10, yk/10-10, null);
			}else{
				g2.drawImage(jatek1,xk/2-(xk/10)+5, yk/2-(yk/10)+5, xk/5-10, yk/10-10, null);
			}
			
			if(menu.kexit){
				g2.drawImage(kilepes2,xk/2-(xk/15)+5, yk/4*3-(yk/15)+5, xk*10/75-10, yk/15-10, null);
			}else{
			g2.drawImage(kilepes1,xk/2-(xk/15)+5, yk/4*3-(yk/15)+5, xk*10/75-10, yk/15-10, null);
			}
		}
		
		
		
		
		
		
		
		//bonusz
		
		if(vbonusz){
			xi=0; yi=-1;
		for(int i=0; i<bonusz.alap.length(); i=i+1){
			xi=xi+1;
			if(bonusz.alap.charAt(i)==bonusz.jelek.charAt(1)){
			g2.drawImage(fu, xi*xk/15, yi*yk/9, xk/15, yk/9,null);
			}
			if(bonusz.alap.charAt(i)==bonusz.jelek.charAt(2)){
				g2.drawImage(fold, xi*xk/15, yi*yk/9, xk/15, yk/9,null);
			}
			if(bonusz.alap.charAt(i)==bonusz.jelek.charAt(3)){
				xi=-1;
				yi=yi+1;
			}
			}
		}
		
		//
		
		
		g2.drawImage(kurzor,xa, ya, 30, 45, null);
}
	}

