package jatek002;

import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Random;
import java.util.Vector;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Grafika extends JPanel	{
	
	
	
	//grafika számolás
	float m = 0f;
	int m2=0;
	int szorzo=1;
	int pont=0;
	int pont2=0;
	int gyorsasag=8;
	int oszthato=0;
	int szam=0;
	int oszthato2=0;
	int szam2=0;
	int billentyu=0;	
	int y = 0;
	int x=701;
	int x2=-100;
	int y2=0;
	int y3=0;
	int ykocka=0;
	int kocka=0;
	int xkocka=200;
	int pontszam=0;
	int lgpont=0;
	boolean random = true;
	boolean jatek = false;
	boolean jatekvege = false;
	
	Random r = new Random();
	
	public Grafika() {
		
		
		
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
										
							
								
								//kokca
								if(billentyu==32){
									billentyu=-2;
									kocka=100;
								}
								
								if(kocka>0){
									kocka=kocka-2;
									ykocka=ykocka-2;
								}else{
									ykocka=ykocka+2;
									
									//helyzet (kocka)
								}
								
								if(ykocka>656){
									ykocka=ykocka-2;
								}
								
								if(ykocka<0){
									ykocka=ykocka+2;
								}
								
								
								
								
								//szünet
								if(billentyu==17){
									billentyu=-2;
									szam=szam+1;
									oszthato=szam/2;
								}
									if(oszthato*2==szam){
									
									
			// oszlopok
										if(jatek==true){	
							    m=100*(m+0.0101f);
							   	m2=(int)m;
							   	m=m2/100f;
								x=x-1;
								x2=x2-1;
								if(x2==125){
									if(szam2==0){	
									}else{
										pontszam=pontszam+szorzo;
										pont=pont+pontszam;
									}
									x=700;
								}
								if(x==125){
									if(szam2==0){
									}else{
										pontszam=pontszam+szorzo;
										pont=pont+pontszam;	
									}
									x2=700;
								}
								if(x==700){
									Random r = new Random();
									y = (int)(r.nextFloat()*375+50);
								}
								if(x2==700){
									y2 = (int)(r.nextFloat()*375+50);
								}
								
								
								if(pontszam>lgpont){
									lgpont=pontszam;
								}
								
								
								//kocka - akadály
								
								if(ykocka<500-y & xkocka+22>x){
									if(xkocka<x+72){
									jatekvege=true;
									}
								}
								

								if(ykocka<500-y2 & xkocka+22>x2){
									if(xkocka<x2+72){
									jatekvege=true;
									}
								}
								
								
								
								
								
								if(ykocka>655-y & xkocka+22>x){
									if(xkocka<x+72){
									jatekvege=true;
									}
								}
								
								if(ykocka>655-y2 & xkocka+22>x2){
									if(xkocka<x2+72){
									jatekvege=true;
									}
								}
								
								
								
								
								if(pontszam/szorzo<3){
									gyorsasag=8;
								}
								
								if(pontszam/szorzo==3){
									gyorsasag=7;
								}
								
								if(pontszam/szorzo==5){
									gyorsasag=6;
								}
								
								if(pontszam/szorzo==10){
									gyorsasag=5 ;
								}
								
								if(pontszam/szorzo==15){
									gyorsasag=4;
								}
								
								if(pontszam/szorzo==25){
									gyorsasag=3;
								}
								
								if(pontszam/szorzo==50){
									gyorsasag=2;
								}
								
								
										}
							}else{
							ykocka=ykocka-2;
									}
			//pontok
												
							}
							repaint(); 
							try {
								Thread.sleep(gyorsasag); 
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				}).start();
	}
	
	
	

	//kijelzés
	
		
		//színek
	
	Color fold =new Color(184, 131, 11);
	Color feher =new Color(255, 255, 255);
	Color piros =new Color(255, 0, 0);
	Color zold =new Color(0, 200, 50);
	Color hatter =new Color(0, 255, 255);
	Color  fu=new Color(0, 255, 0);	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		
		
	
		if(jatekvege){
			jatek=false;
			pont2=pont+pont2;
			pont=0;
			billentyu=10;
			szam2=-1;
			try {
			    Thread.sleep(150); 
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}
		
		//háttér
		
		g2.setColor(hatter);
		g2.fillRect(0, 0, 700, 800);
		g2.setColor(fold);
		g2.fillRect(0, 700, 700, 100);
		g2.setColor(fu);
		g2.fillRect(0, 675, 700, 25);
		
		
		//fejlesztés
		
		if(billentyu==88){
			if(pont2>szorzo*szorzo*50){
				billentyu=-1;
				pont2=pont2-(szorzo*szorzo*50);
				szorzo=szorzo+1;
		}
			}
		
		
			
			//újra
			
		if(billentyu==10){
			jatekvege=false;
			jatek=true;
			y = 0;
			x=701;
			x2=-100;
			y2=0;
			y3=0;
			billentyu=-1;
			szam2=szam2+1;
			oszthato2=szam2/2;
		}
		
		
		
		
		//játék
		
		if(jatek==true){
		
		g2.setColor(zold);
		g2.fillRect(x, 675-y, 70, y);
		g2.fillRect(x2, 675-y2, 70, y2);
		
		g2.fillRect(x-5, 675-y, 80, 25);
		g2.fillRect(x2-5, 675-y2, 80, 25);
		
		
		g2.fillRect(x, 0, 70, 475-y);
		g2.fillRect(x2, 0, 70, 475-y2);
		
		g2.fillRect(x-5, 475-y, 80, 25);
		g2.fillRect(x2-5, 475-y2, 80, 25);
		
		g2.setColor(feher);
		g2.setFont(new Font("Arial", 1, 50));
		g2.drawString(m+" m", 300, 50);
		g2.setFont(new Font("Arial", 1, 20));
		g2.drawString("rekord:"+lgpont, 575, 20);
		
		g2.setColor(Color.yellow);
		g2.drawString(pont+" $", 600, 40);
		g2.setColor(feher);
		g2.setFont(new Font("Arial", 1, 30));
		g2.drawString(szorzo+"X", 20, 36);
		
		g2.setFont(new Font("Arial", 1, 20));
		g2.drawString("m:"+m, 550, 750);
		}
		if(szam2==0){
		}else{
			g2.setColor(piros);
			g2.fillRect(xkocka, ykocka, 20, 20);
			}
		
		if(oszthato2*2==szam2){
			if(szam2==0){
			g2.setColor(feher);
			g2.setFont(new Font("Arial", 1, 20));
			g2.drawString("Rekord:"+lgpont, 540, 720);
			
			g2.setFont(new Font("Arial", 1, 40));
			g2.setColor(Color.yellow);
			g2.drawString(pont2+" $", 30, 750);
			
			
			g2.setColor(feher);
			g2.setFont(new Font("Arial", 1, 50));
			g2.drawString("enter a kezdéshez!", 100, 150);
			g2.setFont(new Font("Arial", 3, 15));
			g2.drawString("információk:", 200, 590);
			g2.drawString("• minél több pont van annál gyorsabb a játék", 200, 610);
			g2.drawString("( egészen 100 pontig idõközönként gyorsul)", 200, 630);
			g2.drawString("• ugrani a SPACE-gpmbbal lehet, ", 200, 650);
			g2.drawString("• a játék szüneteléséhez a CTRL-t kell nyomni", 200, 670);
			
			
			
			g2.setFont(new Font("Arial", 3, 20));
			g2.drawString("fejlesztések:", 10, 300);
			g2.drawString("szorzó "+ (szorzo+1) +"X-re (X)", 180, 300);
			
			if(szorzo*szorzo*50>pont2){
				g2.setColor(piros);
			g2.drawString("ár: "+szorzo*szorzo*50+" $", 180, 330);
			}else{
				g2.setColor(zold);
				g2.drawString("ár: "+szorzo*szorzo*50+" $", 180, 330);
			}
		}else{
			g2.setColor(piros);
			g2.fillRect(xkocka, ykocka, 20, 20);
			}
			
			
			
			
		}
		if(billentyu==10){
			pontszam=0;
			m=0;
			}
		
}
	}
