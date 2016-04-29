package jatek003;
import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class Mentes extends JPanel	{
	 Image hatter; Image madar; Image kurzor; Image kilepes1; Image kilepes2; Image jatek1; Image jatek2; Image fu; Image fold; Image sor;
	//változók
	int xk=0;
	int yk=0;
	int gyorsasag=8;
	int oszthato=0;
	int szam=0;
	int oszthato2=0;
	int szam2=0;
	int gomb=0;
	int egerx=0; int egery=0;
	int xa; int ya;
	int x=0;;
	int y[]=new int[300];
	int ykocka=0;
	int kocka=0;
	int xkocka=200;
	int pontszam=0;
	int lgpont=0;
	int xhatter=0;
	int xi=0;
	int yi=0;
	boolean jatek = false;
	boolean jatekvege = false;
	boolean kjatek =false;
	boolean kexit=false;
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
	
	public Mentes() {
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
									
									
									if(egerx>xk/2-(xk/15)& egerx<xk/2-(xk/15)+xk*10/75& egery>yk/4*3-(yk/15)& egery<yk/4*3-(yk/15)+yk/15){
										System.exit(0);
									}
									if(xa>xk/2-(xk/15)& xa<xk/2-(xk/15)+xk*10/75& ya>yk/4*3-(yk/15)& ya<yk/4*3-(yk/15)+yk/15){
										kexit=true;;
									}else{
										kexit=false;
									}
									
									if(xa>xk/2-(xk/10)+5& xa<xk/2-(xk/10)+xk/5& ya>yk/2-(yk/10)& ya<yk/2-(yk/10)+yk/10){
										kjatek=true;
									}else{
										kjatek=false;
									}
									
									if(egerx>xk/2-(xk/10)+5& egerx<xk/2-(xk/10)+xk/5& egery>yk/2-(yk/10)& egery<yk/2-(yk/10)+yk/10){
										jatekvege=false;
										jatek=true;
										gomb=-1;
										szam2=szam2+1;
										oszthato2=szam2/2;
										egerx=0; egery=0;
										x=xk/3*2;
										pontszam=0;
									}
									if(jatekvege){szam2=0;}
										
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
		g2.drawImage(hatter,-xk+xhatter, 0, xk, yk*21/19, null);
		
		
		//menü
		
		
		if(oszthato2*2==szam2){
			if(szam2==0){			
			g2.setColor(Color.black);
			g2.fillRect(xk/2-(xk/10), yk/2-(yk/10), xk/5, yk/10);
			g2.fillRect(xk/2-(xk/15), yk/4*3-(yk/15), xk*10/75, yk/15);
			
			if(kjatek){
				g2.drawImage(jatek2,xk/2-(xk/10)+5, yk/2-(yk/10)+5, xk/5-10, yk/10-10, null);
			}else{
				g2.drawImage(jatek1,xk/2-(xk/10)+5, yk/2-(yk/10)+5, xk/5-10, yk/10-10, null);
			}
			
			if(kexit){
				g2.drawImage(kilepes2,xk/2-(xk/15)+5, yk/4*3-(yk/15)+5, xk*10/75-10, yk/15-10, null);
			}else{
			g2.drawImage(kilepes1,xk/2-(xk/15)+5, yk/4*3-(yk/15)+5, xk*10/75-10, yk/15-10, null);
			}
		}
		}
		
		//alap
		if(jatek){
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
		
		}
		
		
		g2.drawImage(kurzor,xa, ya, 30, 45, null);
}
	}
