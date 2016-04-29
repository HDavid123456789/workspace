package game01;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class Menu extends JPanel	{
	//
	 Image hatter; 
	 Image kurzor; 
	 Image kurzor2; 
	 Image kilepes1;
	 Image kilepes2;
	 Image jatek1; 
	 Image jatek2; 
	 //
	 
	int x=0; int y=0;
	int gomb=0;
	int egerx=0; int egery=0;
	int xa; int ya;
	int gorgo;
	//
	boolean jatek = false;
	boolean jatekvege = false;
	boolean kjatek =false;
	boolean kexit=false;
	boolean mutato=false;
	
	public Menu() {
		
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
		ImageIcon l = new ImageIcon (getClass().getResource("kurzor2.png"));
		kurzor2=l.getImage();
		
		
			
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
								
								if(egerx>x/2-(x/15)& egerx<x/2-(x/15)+x*10/75& egery>y/4*3-(y/15)& egery<y/4*3-(y/15)+y/15){
									System.exit(0);
								}
								if(xa>x/2-(x/15)& xa<x/2-(x/15)+x*10/75& ya>y/4*3-(y/15)& ya<y/4*3-(y/15)+y/15){
									kexit=true;
									mutato=true;
								}else{
									kexit=false;
									mutato=false;
								}
								
								if(xa>x/2-(x/10)+5& xa<x/2-(x/10)+x/5& ya>y/2-(y/10)& ya<y/2-(y/10)+y/10){
									kjatek=true;
									mutato=true;
								}else{
									kjatek=false;
								}
								
								if(egerx>x/2-(x/10)+5& egerx<x/2-(x/10)+x/5& egery>y/2-(y/10)& egery<y/2-(y/10)+y/10){
									egerx=0; egery=0;
									Elvalaszto t = new Elvalaszto();
									t.menu=false;
									t.jatek=true;
									mutato=false;
								}
								System.out.println(xa+" "+ya);
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
		public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
			g2.drawImage(hatter,0, 0, x, y, null);
			
			if(kjatek){
				g2.drawImage(jatek2,x/2-(x/10)+5, y/2-(y/10)+5, x/5-10, y/10-10, null);
			}else{
				g2.drawImage(jatek1,x/2-(x/10)+5, y/2-(y/10)+5, x/5-10, y/10-10, null);
			}
			
			if(kexit){
				g2.drawImage(kilepes2,x/2-(x/15)+5, y/4*3-(y/15)+5, x*10/75-10, y/15-10, null);
			}else{
			g2.drawImage(kilepes1,x/2-(x/15)+5, y/4*3-(y/15)+5, x*10/75-10, y/15-10, null);
			}
		
		
		if(mutato){
			g2.drawImage(kurzor2,xa, ya, 30, 45, null);	
		}else{
		g2.drawImage(kurzor,xa, ya, 30, 45, null);
		}
}
	}
