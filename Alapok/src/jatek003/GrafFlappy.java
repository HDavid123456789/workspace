package jatek003;
import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class GrafFlappy extends JPanel	{
	//
	 Image hatter; 
	 Image hatter2;
	 Image kurzor; 
	 Image kurzor2; 
	 Image kilepes1;
	 Image kilepes2;
	 Image jatek1; 
	 Image jatek2; 
	 Image fu; 
	 Image fold;
	 Image sor;
	 Image karakteralap;
	 //
	 
	int x=0; int y=0;
	int gomb=0;
	int egerx=0; int egery=0;
	int xa; int ya;
	int xhatter=0;
	int xi=0; int yi=0;
	int szam=0;
	int ism=0;
	int xm[]=new int[20];
	int ym[]=new int[20];
	int xh[]=new int[20];
	int yh[]=new int[20];
	//
	boolean jatek = false;
	boolean jatekvege = false;
	boolean kjatek =false;
	boolean kexit=false;
	boolean menu=true;
	boolean bonusz=false;
	boolean valasztas=false;
	boolean mutato=false;
	boolean harc=false;
	boolean elso=true;
	boolean katt2=false;
	boolean eger[]=new boolean[20];
	//
	Random r = new Random();
	//
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
	
	public GrafFlappy() {
		
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
		ImageIcon j = new ImageIcon (getClass().getResource("sor.png"));
		sor=j.getImage();
		ImageIcon k = new ImageIcon (getClass().getResource("háttér2.png"));
		hatter2=k.getImage();
		ImageIcon l = new ImageIcon (getClass().getResource("kurzor2.png"));
		kurzor2=l.getImage();
		ImageIcon m = new ImageIcon (getClass().getResource("alap.png"));
		karakteralap=m.getImage();
			ImageIcon n = new ImageIcon (getClass().getResource("föld.png"));
		fold=n.getImage();
		
		
			
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
								
								if(menu){
								menu();
								}
								if(valasztas){
									valasztas();
									}
								
								if(harc){
									harc();
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

					
					
private void harc() {						
					}


private void valasztas() {
	for(int i=0; i<20; i=i+1){
		mutato=false;
		if (eger[i]){
			i=20;
			mutato=true;
		}
	}
	
	if(szam>19){szam=0;}
	if(szam<0){szam=19;} 

	for(int i=0; i<20; i=i+1){
		if(xa>xh[i] & xa<xh[i]+xm[i] & ya>yh[i] & ya<ym[i]+yh[i]){
			eger[i]=true;
		}else{
			eger[i]=false;
		}
		if(egerx>xh[i] & egerx<xh[i]+xm[i] & egery>yh[i] & egery<ym[i]+yh[i]){
			egerx=0;
			egery=0;
			katt2=true;
		}
	if(katt2){
			if(ism==xh[1]){
				ism=0;
				katt2=false;
			}else{
				xh[i]=xh[i]-1;
				
			}
		}else{
			ism=xh[0]-xm[0]*2;
		}
		if(elso){
		if(i>0){
		xh[i]=xh[i-1]+x/3+x/5;
		}else{
			xh[i]=x/3;
		}
		xm[i]=x/5;
		ym[i]=y/3;
		yh[i]=y/3;
		}
	}
	if(katt2){
		ism=ism+1;
	}
	elso=false;
			//g2.fillRect(x/3, y/10, x/3, y/5*4);
	//g2.fillRect(x/10*7, y/3, x/5, y/3);
	//g2.fillRect(x/10, y/3, x/5, y/3);
	
					}



private void menu() {
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
							menu=false;
							valasztas=true;
							mutato=false;
						}
						
						//
					}

				
		}).start();
	}
	

	
	

	//kijelzés
		//színek
	
		public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		
		
		
		
		
		//MENÜ/////////////////////////////////////////////////////////
		
		
		if(menu){
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
		}
		
		
		
		
		
		
		
		
		//BÓNUSZ/////////////////////////////////////////////////
		
		if(bonusz){
			g2.drawImage(hatter,0, 0, x, y*21/19, null);
			xi=0; yi=-1;
		for(int i=0; i<alap.length(); i=i+1){
			xi=xi+1;
			if(alap.charAt(i)==jelek.charAt(1)){
			g2.drawImage(fu, xi*x/15, yi*y/9, x/15, y/9,null);
			}
			if(alap.charAt(i)==jelek.charAt(2)){
				g2.drawImage(fold, xi*x/15, yi*y/9, x/15, y/9,null);
			}
			if(alap.charAt(i)==jelek.charAt(3)){
				xi=-1;
				yi=yi+1;
			}
		}
		}
		
		
		
		
		//VÁLASZTÁS/////////////////////////////////////////////////
		
		if(valasztas){
			g2.drawImage(hatter2,0, 0, x/2, y/2, null);
			g2.drawImage(hatter2,x/2, y/2, x/2, y/2, null);
			g2.drawImage(hatter2,x/2, 0, x/2, y/2, null);
			g2.drawImage(hatter2,0, y/2, x/2, y/2, null);
			
			
			for(int i=0; i<20; i=i+1){
			if(eger[i]){
			g2.setColor(Color.lightGray);
			}else{
				g2.setColor(Color.black);
			}
			g2.fillRect(xh[i], yh[i], xm[i], ym[i]);
			g2.drawImage(karakteralap,xh[i]+x/200, yh[i]+x/200, xm[i]-x/100, ym[i]-x/100,null);
		}
		}
		
		
		
		
		////////////////////////////////////////////////////
		
		
		
		if(mutato){
			g2.drawImage(kurzor2,xa, ya, 30, 45, null);	
		}else{
		g2.drawImage(kurzor,xa, ya, 30, 45, null);
		}
}
	}
