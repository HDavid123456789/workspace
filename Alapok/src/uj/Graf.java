package uj;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
public class Graf extends JPanel	{
	//grafika sz�mol�s
	
	int kattx; int katty;
	int gomb=0; int gombelenged=0;
	int x; int y;
	int xa=0; int ya=0;
	int xmozgas; int ymozgas;
	int sor=0; int oszlop;
	int szam; int szam2;
	String ertekatiro=""; //(�t�rom ide az ertek string elemeit)
	
	//t�mb helyett jelek (egyszer�bb megadni a kezd�si �rt�ket, ha k�l�nleges form�j� az alap)
	String ertek = ""
+ "***************"
+ "00000000000000*"
+ "*************0*"
+ "*0000000000000*"
+ "***************"; 
	
	//jel �rtelemz�
	String jelek="0*";

	public Graf() {
		
		
		
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
								
								if(gomb==27){
									// program bez�r�sa
									System.exit(0);
								}
								
								
								// �rt�kek �t�r�sa ha kattintunk
								
								if(katty<y/4& katty>0){
									ertekatiro=ertek;
									ertek=""; //�rt�k �t�r�sa m�sik stringbe �s az ertek string null�z�sa
									
									szam=(katty/(y/20))*15+(kattx/(x/15)+1); //a kattint�s elem�t sz�molja meg h�nyadik
									
									for(int i=0; i<75; i=i+1){
										if(szam==i+1){
											if(ertekatiro.charAt(i)==jelek.charAt(0)){//ha a sz�veg x-edik eleme = a jel 0. (1.) elem�vel
												ertek=ertek+jelek.charAt(1); //a sz�veg egyenl� az eddigi sz�veg + a 0. jellel
											}else{
												ertek=ertek+jelek.charAt(0); //a sz�veg egyenl� az eddigi sz�veg + a 1. jellel
											}
										}else{
											ertek=ertek+ertekatiro.charAt(i); //a sz�veg egyenl� az eddigi sz�veg + a m�solt sz�veg (ugyan az csak m�sik string) sz�veg�vel 
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
		g2.fillRect(0, 0, x, y); // feh�r alaph�tt�r 
		
		
		for(int i=0; i<75; i=i+1){
			if(ertek.charAt(i)==jelek.charAt(1)){// x-edik elem kirajzol�sa
				g2.setColor(Color.black); //keret
				g2.fillRect(sor*x/15, oszlop*y/20, x/15, y/20);
				g2.setColor(Color.gray); //bels� r�sz
				g2.fillRect(sor*x/15+x/200, oszlop*y/20+x/200, x/15-x/100, y/20-x/100);
			}
			sor=sor+1; // a sorban a k�vetkez� elem
			if(sor==15){ //ha a sor betelt
				oszlop=oszlop+1; // �j sor kez�se
				sor=0; //a sor �jra el�r�l indul
			}
		}
		sor=0; //null�z�s
		oszlop=0;
		
		g2.setColor(Color.black);
		g2.setFont(new Font("Arial", 1, y/50));  //g2.setFont(new Font("bet�t�pus", vastags�g (1 aleggvastagabb, m�ret));  
		g2.drawString("Kattint�sra  el lehet t�ntetni �s vissza lehet rakni a t�glalapokat (a vonalig) ", x/100, y/2);
		g2.drawString("az esc-vel lehet kil�pni", x/100, y/2+y/50*2);
		
		g2.fillRect(0, y/4, x, y/200); //elv�laszt� vonal
		g2.fillOval(xmozgas, ymozgas, 20, 20); //kurzor
}
	}
