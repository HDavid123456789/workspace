package idopixel;

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
	
	int X=0;
	int Y=0;
	int ism=0;
	int ido=0;
	int R[]=new int[200000]; int G[]=new int[200000]; int B[]=new int[200000];
	Random r=new Random();
	public Graf() {
		
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
								
								ido=ido+1;
								if(ido==1000){
									ido=0;
								for(int i=0; i<200000; i=i+1){
									R[i]=(int)(r.nextFloat()*256);
									G[i]=(int)(r.nextFloat()*256);
									B[i]=(int)(r.nextFloat()*256);
									}
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
		
		ism=0;
		for(int X=0; X<500; X=X+1){
			for(int Y=0; Y<400; Y=Y+1){
				ism=ism+1;
		Color szin=new Color(R[ism-1], G[ism-1], B[ism-1]);
		g2.setColor(szin);
		g2.fillRect(X, Y, 1, 1);
		}
		}
		
}
	}
