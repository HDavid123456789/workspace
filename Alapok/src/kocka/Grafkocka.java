package kocka;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
public class Grafkocka extends JPanel	{	
	
	//grafika számolás
	int egerx=0;
	int egery=0;
	int egerf=0;
	int gombelenged=0;
	int gomb=0;
	int katt=0;
	int ism=0;
	int dobas=0;
	int kocka[]=new int[6];
	int kockakor[]=new int[6];
	Random r=new Random();
	



	public Grafkocka() {
		
		
		
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
								
								if(egerx>40 & egerx<135 & egery>40 & egery<135){
									egerf=1;
									katt=1;
									dobas=(int)(r.nextFloat()*6+1);
									kocka[dobas-1]=kocka[dobas-1]+1;
								}
								if(gomb==32){
									katt=1;
									dobas=(int)(r.nextFloat()*6+1);
									kocka[dobas-1]=kocka[dobas-1]+1;
									gombelenged=1;
								}
								
								if(egerf==1){
									egerf=0;
									egerx=0;
									egery=0;
								}
								
								if(gombelenged>0){
									gomb=0;
								}
								if(katt==1){
									ism=ism+1;
								if(ism==250){
									ism=0;
									katt=0;
								}
								}
								for(int i=0; i<6; i=i+1){
									if(kocka[i]>5){
										kocka[i]=1;
										kockakor[i]=kockakor[i]+1;
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
	
	
	
		
		//színek
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.white);
		g2.fillRect(0, 0, 508, 286);
		for(int i=0; i<6; i=i+1){
			g2.setColor(Color.red);
			g2.setFont(new Font("Arial", 1, 25));
		g2.drawString(""+(i+1), i*50+200, 175);
		if(kockakor[i]>0){
		g2.setFont(new Font("Arial", 1, 15));
		g2.drawString("*"+(kockakor[i]), i*50+220, 160);
		}
		for(int a=0; a<5; a=a+1){
		g2.setColor(Color.black);
		g2.fillRect(i*50+198, 136-(a*30), 15, 15);
		if(kocka[i]==a+1){
			g2.setColor(Color.red);
		}else{
		g2.setColor(Color.white);
		}
		g2.fillRect(i*50+200, 136-(a*30)+2, 11, 11);
		
		
		g2.setFont(new Font("Arial", 1, 15));
		g2.setColor(Color.red);
		g2.drawString(""+(a+1), 175, 150-(a*30));
		
		}
		}
		if(katt==1){
			g2.setColor(Color.red);
		}else{
			g2.setColor(Color.black);
		}
		g2.fillRect(50, 50, 75, 75);
		
		
		
		g2.setColor(Color.black);
		g2.setFont(new Font("Arial", 1, 15));
		g2.drawString("*új dobáshoz a fekete mezõre kell kattintani vagy space-t kell nyomni", 3, 225);
		g2.setColor(Color.white);
		g2.setFont(new Font("Arial", 1, 50));
		g2.drawString(""+dobas,75, 100);
}
	}
