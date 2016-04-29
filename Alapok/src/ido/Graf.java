package ido;

import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
public class Graf extends JPanel	{
	
	int egerf;
	int gomb=0;
	int egerx=0; int egery=0;
	int xa; int ya;
	int xv; int yv;
	int gorgo;
	int egergomb;
	
	int x[]=new int[100]; int y[]=new int[100];
	int meret[]=new int[100];
	int ism=0;
	int ido=0;
	int R[]=new int[100]; int G[]=new int[100]; int B[]=new int[100];
	Random r=new Random();
	public Graf() {
		
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
								ido=ido+1;
								if(ido==200){
									ido=0;
									meret[ism]=(int)(r.nextFloat()*100+10);
									R[ism]=(int)(r.nextFloat()*256);
									G[ism]=(int)(r.nextFloat()*256);
									B[ism]=(int)(r.nextFloat()*256);
									y[ism]=(int)(r.nextFloat()*400+1);
									x[ism]=(int)(r.nextFloat()*500+1);
									ism=ism+1;
									
									
								}
								if(ism==100){
									ism=0;
									
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
		g2.setColor(Color.white);
		g2.fillRect(0, 0, 500, 400);
		
		for(int i=0; i<100; i=i+1){
		Color szin=new Color(R[i], G[i], B[i]);
		g2.setColor(szin);
		g2.fillOval(x[i], y[i], meret[i], meret[i]);		
		}
		
}
	}
