package agykesleltetes;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class AgykesleltetesGraf extends JPanel	{
	int szam=0;
	
	int egerf;
	int gomb=0; int gomb2;
	int egerx=0; int egery=0;
	int xa; int ya;
	int gorgo;
	int egergomb;
	int x; int y;
	
	int ido[]=new int[100];
	int ism=0;
	int ex; int ey;
	int it=100;
	int gism=0;
	
	public AgykesleltetesGraf() {
		
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
								if(gomb==10){
									gism++;
									gomb=0;
								}
								if(gism==gism/2*2){
									it=150;
								}else{
									it=0;
								}
								ido[ism]++;
								if(egerx>0|egery>0){
									ex=egerx; ey=egery;
									egerx=0; egery=0; ism++;
								}
								if(gomb==32){
									ism++;
									gomb=0;
									ex=x/2-x/10; ey=y/2-x/10;
									
								}
								if(gomb==27){System.exit(0);}
								
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
	
	
	

	//kijelz�s
	
		
		//sz�nek
	
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.white);
		g2.fillRect(0, 0, x, y);
		g2.setColor(Color.black);
		g2.fillOval(xa,ya,x/100,x/100);
		
		if(gism==gism/2*2){
			g2.setColor(Color.black);
		}else{
			g2.setColor(Color.blue);
		}
		g2.fillRect(0,0,x/50,x/50);
		
		if(ido[ism]<250+it& ido[ism]>it){
			g2.setColor(Color.red);
			g2.fillOval(ex,ey,x/10,x/10);
		}
	}
	}
