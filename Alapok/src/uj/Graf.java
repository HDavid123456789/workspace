package uj;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
public class Graf extends JPanel	{
	//grafika számolás
	
	int kattx; int katty;
	int gomb=0; int gombelenged=0;
	int x; int y;
	int xa=0; int ya=0;
	int xmozgas; int ymozgas;
	int sor=0; int oszlop;
	int szam; int szam2;
	String ertekatiro=""; //(átírom ide az ertek string elemeit)
	
	//tömb helyett jelek (egyszerûbb megadni a kezdési értéket, ha különleges formájú az alap)
	String ertek = ""
+ "***************"
+ "00000000000000*"
+ "*************0*"
+ "*0000000000000*"
+ "***************"; 
	
	//jel értelemzõ
	String jelek="0*";

	public Graf() {
		
		
		
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
								
								if(gomb==27){
									// program bezárása
									System.exit(0);
								}
								
								
								// értékek átírása ha kattintunk
								
								if(katty<y/4& katty>0){
									ertekatiro=ertek;
									ertek=""; //érték átírása másik stringbe és az ertek string nullázása
									
									szam=(katty/(y/20))*15+(kattx/(x/15)+1); //a kattintás elemét számolja meg hányadik
									
									for(int i=0; i<75; i=i+1){
										if(szam==i+1){
											if(ertekatiro.charAt(i)==jelek.charAt(0)){//ha a szöveg x-edik eleme = a jel 0. (1.) elemével
												ertek=ertek+jelek.charAt(1); //a szöveg egyenlõ az eddigi szöveg + a 0. jellel
											}else{
												ertek=ertek+jelek.charAt(0); //a szöveg egyenlõ az eddigi szöveg + a 1. jellel
											}
										}else{
											ertek=ertek+ertekatiro.charAt(i); //a szöveg egyenlõ az eddigi szöveg + a másolt szöveg (ugyan az csak másik string) szövegével 
									}
									}
									kattx=0;
									katty=0;
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
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.white);
		g2.fillRect(0, 0, x, y); // fehér alapháttér 
		
		
		for(int i=0; i<75; i=i+1){
			if(ertek.charAt(i)==jelek.charAt(1)){// x-edik elem kirajzolása
				g2.setColor(Color.black); //keret
				g2.fillRect(sor*x/15, oszlop*y/20, x/15, y/20);
				g2.setColor(Color.gray); //belsõ rész
				g2.fillRect(sor*x/15+x/200, oszlop*y/20+x/200, x/15-x/100, y/20-x/100);
			}
			sor=sor+1; // a sorban a következõ elem
			if(sor==15){ //ha a sor betelt
				oszlop=oszlop+1; // új sor kezése
				sor=0; //a sor újra elõrõl indul
			}
		}
		sor=0; //nullázás
		oszlop=0;
		
		g2.setColor(Color.black);
		g2.setFont(new Font("Arial", 1, y/50));  //g2.setFont(new Font("betûtípus", vastagság (1 aleggvastagabb, méret));  
		g2.drawString("Kattintásra  el lehet tüntetni és vissza lehet rakni a téglalapokat (a vonalig) ", x/100, y/2);
		g2.drawString("az esc-vel lehet kilépni", x/100, y/2+y/50*2);
		
		g2.fillRect(0, y/4, x, y/200); //elválasztó vonal
		g2.fillOval(xmozgas, ymozgas, 20, 20); //kurzor
}
	}
