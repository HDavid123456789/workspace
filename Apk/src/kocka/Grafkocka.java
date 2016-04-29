package kocka;

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
import java.awt.Window;
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
public class Grafkocka extends JPanel	{
	
	//grafika számolás
	int egerx=0;
	int egery=0;
	int egerf=0;
	int katt=0;
	int ism=0;
	int dobas=0;
	int kocka[]=new int[6];
	float szazalek[]=new float[6];
	int osszdobas=0;
	int gomb=0;
	int gombelenged=0;
	int oszlop[]=new int[6];
	int mozgas=0;
	int px[]=new int[14];
	int ossz=0;
	Random r=new Random();
	



	public Grafkocka() {
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
								
								//kocka pöttyök
								
								for(int i=0; i<14; i=i+2){
									px[i]=0;
									px[i+1]=0;
								}
								if(dobas==1){
									px[0]=30;
									px[1]=30;
								}
								if(dobas==2){
									px[2]=45;
									px[3]=10;
									
									px[4]=15;
									px[5]=50;
								}
								if(dobas==3){
									px[0]=30;
									px[1]=30;
									
									px[2]=45;
									px[3]=10;
									
									px[4]=15;
									px[5]=50;
								}
								if(dobas==4){
									px[2]=45;
									px[3]=10;
									
									px[4]=15;
									px[5]=50;
									
									px[6]=45;
									px[7]=50;
									
									px[8]=15;
									px[9]=10;
									
								}
								if(dobas==5){
									px[0]=30;
									px[1]=30;
									
									px[2]=45;
									px[3]=10;
									
									px[4]=15;
									px[5]=50;
									
									px[6]=45;
									px[7]=50;
									
									px[8]=15;
									px[9]=10;
								}
								if(dobas==6){
									px[2]=45;
									px[3]=10;
									
									px[4]=15;
									px[5]=50;
									
									px[6]=45;
									px[7]=50;
									
									px[8]=15;
									px[9]=10;
									
									px[10]=15;
									px[11]=30;
									
									px[12]=45;
									px[13]=30;
								}
								
								//eger & gomb figyelõ
								
								if(egerx>15 & egerx<110 & egery>160 & egery<245){
									osszdobas=osszdobas+1;
									egerf=1;
									katt=1;
									dobas=(int)(r.nextFloat()*6+1);
									kocka[dobas-1]=kocka[dobas-1]+1;
								}
								
								
								
								if(gomb==32){
									osszdobas=osszdobas+1;
									gombelenged=1;
									katt=1;
									dobas=(int)(r.nextFloat()*6+1);
									kocka[dobas-1]=kocka[dobas-1]+1;
								}
								
								//egér & gomb visszaállító
								
								if(egerf==1){
									egerf=0;
									egerx=0;
									egery=0;
								}
								if(gombelenged==1){
									gomb=0;
								}
								
								//kattintás 
								
								if(katt==1){
									ism=ism+1;
								if(ism==250){
									ism=0;
									katt=0;
								}
								}
								
								//grafikon oszlop + szazalek 
								
								if(mozgas==mozgas/2*2){
									mozgas=0;
								for(int i=0; i<6; i=i+1){
									szazalek[i]=kocka[i]*1000f/osszdobas;
									szazalek[i]=(int)szazalek[i]*10;
									szazalek[i]=szazalek[i]/100f;
									if(oszlop[i]==(int)szazalek[i]*350/100){
										
									}else{
										if(oszlop[i]>(int)szazalek[i]*350/100){
											oszlop[i]=oszlop[i]-1;
										}else{
											oszlop[i]=oszlop[i]+1;
										}
									}
								}
								}
								mozgas=mozgas+1;
												
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
		
		//háttér
		
		Color hatter =new Color(255, 200, 155);
		g2.setColor(hatter);
		g2.fillRect(0, 0, 750, 500);
		
		
		//katt / színváltás
		
		if(katt==1){
			g2.setColor(Color.red);
		}else{
			g2.setColor(Color.black);
		}
		g2.fillRect(25, 175, 75, 75);
		
		//dobott szám kiírás
		
		g2.setColor(Color.black);
		g2.fillRect(25, 260, 75, 75);
		g2.setColor(Color.white);
		g2.fillRect(27, 262, 71, 71);
		
		g2.setColor(Color.red);
		g2.setFont(new Font("Arial", 1, 25));
		g2.drawString(""+osszdobas,50, 308);
		
		
		//info
		
		g2.setColor(Color.black);
		g2.setFont(new Font("Arial", 1, 12));
		g2.drawString("* katt a fekete mezõre",5, 380);
		g2.drawString("* vagy space",5, 395);
		
		//dobókocka pöttyök
		
		for(int i=0; i<14; i=i+2){
			if(px[i]>0){
			g2.setColor(Color.white);
			g2.fillOval(px[i]+25, px[i+1]+175, 15, 15);
			}
		}
		
		//diagramm alap
		
		g2.setColor(Color.black);
		g2.fillRect(150, 0, 540, 400);
		g2.fillRect(150, 50, 540, 2);
		g2.setColor(Color.white);
		g2.fillRect(152, 2, 536, 396);
		g2.setColor(Color.black);
		g2.fillRect(150, 50, 540, 2);
		
		Color fejlec =new Color(255, 180, 180);
		g2.setColor(fejlec);
		g2.fillRect(152, 2, 536, 48);
		
		//ozlopok
		
		for(int i=0; i<6; i=i+1){
			g2.setColor(Color.black);
			g2.fillRect(i*90+177, 405, 25, 25);
			
			g2.setColor(Color.white);
			g2.fillRect(i*90+179, 407, 21, 21);
			
			g2.setColor(Color.red);
			g2.setFont(new Font("Arial", 1, 20));
			g2.drawString(""+(i+1),i*90+185, 425);
			g2.setColor(Color.black);
			g2.setFont(new Font("Arial", 1, 15));
			g2.drawString(szazalek[i]+"%",i*90+175, 400-oszlop[i]-10);
			g2.drawString(kocka[i]+"db",i*90+175, 25);
			for(int a=0; a<25; a=a+1){
			Color piros =new Color(a*6+105, 0, 0);
			g2.setColor(piros);
			g2.drawLine(i*90+168+a, 400-oszlop[i], i*90+168+a, 400);	
			}
			for(int a=0; a<25; a=a+1){
				Color piros =new Color((25-a)*6+105, 0, 0);
				g2.setColor(piros);
				g2.drawLine(i*90+168+a+25, 400-oszlop[i], i*90+168+a+25, 400);	
				}
		}
}
	}
