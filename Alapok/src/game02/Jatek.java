package game02;
import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class Jatek extends JPanel	{
	//
	 Image hatter; 
	 Image fal;
	 Image kurzor; 
	 Image kurzor2; 
	 Image kilepes1;
	 Image kilepes2;
	 Image jatek1; 
	 Image jatek2;
	 Image stone;
	 //
	 
	int x=0; int y=0;
	int gomb=0;
	int egerx=0; int egery=0;
	int xa; int ya;
	int gorgo;
	int hm=0; int hm2;
	int ism=0;
	//
	boolean jatek = false;
	boolean kjatek =false;
	boolean kexit=false;
	boolean menu=true;
	boolean mutato=false;
	
	public Jatek() {
		
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
		ImageIcon h = new ImageIcon (getClass().getResource("stone.png"));
		stone=h.getImage();
		ImageIcon j = new ImageIcon (getClass().getResource("fal.png"));
		fal=j.getImage();
		
			
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
				                
								if(gomb==27){
									System.exit(0);
								}
								if(menu){
								menu();
								}
								if(jatek){
									jatek();
								}
										
							}
							repaint(); 
							try {
								Thread.sleep(17); 
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}

private void jatek() {
	
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
							jatek=true; 
							mutato=false;
						}
						
						//
						hm2=hm2+1;
						if(hm2/10*10==hm2){
							hm=hm-1;
						if(hm<-x){
							hm=0;
						}
						}
					}

				
		}).start();
	}
	

	
	

	//kijelzés
		//színek
	
		public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		
		
		
		
		
		//MENÜ/////////////////////////////////////////////////////////
		
		
		if(menu){
			g2.drawImage(hatter,hm, 0, x, y, null);
			g2.drawImage(hatter,hm+x, 0, x, y, null);
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
		//JÁTÉK////////////////////////////////////////////////
		if(jatek){
			g2.drawImage(stone, 0, 0,x, y,null);
			g2.rotate(Math.toRadians(0), 0,y);
		}

		
		
		
		//EGÉR////////////////////////////////////////////////////////////////
		
		if(mutato){
			g2.drawImage(kurzor2,xa, ya, 30, 45, null);	
		}else{
		g2.drawImage(kurzor,xa, ya, 30, 45, null);
		} 
		
		
		
}
	}
