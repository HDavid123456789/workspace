package szamolas;

import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Random;
import java.util.Vector;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class TortGrafika extends JPanel	{
	
	//változók
	int gomb=0;
	int egerx=0;
	int egery=0;
	int xk=8;
	int yk=30;
	boolean katt=false;
	
	boolean egesz1=false;
	boolean egesz2=false;
	boolean egesz3=false;
	
	boolean nevezo1=false;
	boolean nevezo2=false;
	boolean nevezo3=false;
	
	boolean szamlalo1=false;
	boolean szamlalo2=false;
	boolean szamlalo3=false;
	
	
	public TortGrafika() {
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
								
								//számolások
								
								//katt tájolás
								if(katt){
								egerx=egerx-xk;
								egery=egery-yk;
								katt=false;
								}
								
						
						//MEZÕK -törtek - számolás
								
								//egész
								
								if(egerx>50 & egerx<90 & egery>50& egery<80){
									egesz1=true;
								}else{
									egesz1=false;
								}
								
								//számláló
								
								if(egerx>100 & egerx<140 & egery>30& egery<60){
									szamlalo1=true;
								}else{
									szamlalo1=false;
								}
								
								//nevezõ
								
								if(egerx>100 & egerx<140 & egery>75& egery<105){
									nevezo1=true;
								}else{
									nevezo1=false;
								}
								
								
								
								
								
								
								//egész
								if(egerx>200 & egerx<240 & egery>50& egery<80){
									egesz2=true;
								}else{
									egesz2=false;
								}
								
								
								
								
								if(egerx>200 & egerx<240 & egery>50& egery<80){
									egesz2=true;
								}else{
									egesz2=false;
								}
								
								//számláló
								
								if(egerx>250 & egerx<290 & egery>30& egery<60){
									szamlalo2=true;
								}else{
									szamlalo2=false;
								}
								
								//nevezõ
								
								if(egerx>250 & egerx<290 & egery>75& egery<105){
									nevezo2=true;
								}else{
									nevezo2=false;
								}
								
								
								
								
								
								
								//egész
								
								if(egerx>350 & egerx<390 & egery>50& egery<80){
									egesz3=true;
								}else{
									egesz3=false;
								}
								
								//számláló
								
								if(egerx>400 & egerx<440 & egery>30& egery<60){
									szamlalo3=true;
								}else{
									szamlalo3=false;
								}
								
								//nevezõ
								
								if(egerx>400 & egerx<440 & egery>75& egery<105){
									nevezo3=true;
								}else{
									nevezo3=false;
								}
								
								
								
								
								
								
					}
					repaint(); 
					try {
						Thread.sleep(2); 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
}

	
	
	
	

	//GRAFIKA
	
		
		//elõkészített színek
	Color hatter =new Color(235, 235, 235);
	
	
	
	public void paintComponent(Graphics g) {
		
		//egér katt
		
		
		Graphics2D g2 = (Graphics2D) g;
		
		
		//háttér
		g2.setColor(hatter);
		g2.fillRect(0, 0, 500, 500);
		
		
		
		
		
	//MEZÕK - törtek - kiírás
		
		//1
		
		if(egesz1){
			g2.setColor(Color.red);
			g2.fillRect(50, 50, 40, 30);
			
			g2.setColor(hatter);
			g2.fillRect(52, 52, 36, 26);
		}else{
		g2.setColor(Color.black);
		g2.fillRect(50, 50, 40, 30);
		
		g2.setColor(hatter);
		g2.fillRect(52, 52, 36, 26);
		}
		
		
		//törtvonal
		
		g2.setColor(Color.black);
		g2.fillRect(100, 65, 40, 5);
		
		
		//szamláló
		
		if(szamlalo1){
			g2.setColor(Color.red);
			g2.fillRect(100, 30, 40, 30);
			
			g2.setColor(hatter);
			g2.fillRect(102, 32, 36, 26);
		}else{
		g2.setColor(Color.black);
		g2.fillRect(100, 30, 40, 30);
		
		g2.setColor(hatter);
		g2.fillRect(102, 32, 36, 26);
		}
		
		//nevezõ
		
		if(nevezo1){
			g2.setColor(Color.red);
			g2.fillRect(100, 75, 40, 30);
			
			g2.setColor(hatter);
			g2.fillRect(102, 77, 36, 26);
		}else{
		g2.setColor(Color.black);
		g2.fillRect(100, 75, 40, 30);
		
		g2.setColor(hatter);
		g2.fillRect(102, 77, 36, 26);
		}
		
		
		
		
		
		
		
		
		//2
		
		if(egesz2){
			g2.setColor(Color.red);
			g2.fillRect(200, 50, 40, 30);
			
			g2.setColor(hatter);
			g2.fillRect(202, 52, 36, 26);
		}else{
		g2.setColor(Color.black);
		g2.fillRect(200, 50, 40, 30);
		
		g2.setColor(hatter);
		g2.fillRect(202, 52, 36, 26);
		}
		
		
		//törtvonal
		
		g2.setColor(Color.black);
		g2.fillRect(250, 65, 40, 5);
		
		
		//szamláló
		
		if(szamlalo2){
			g2.setColor(Color.red);
			g2.fillRect(250, 30, 40, 30);
			
			g2.setColor(hatter);
			g2.fillRect(252, 32, 36, 26);
		}else{
		g2.setColor(Color.black);
		g2.fillRect(250, 30, 40, 30);
		
		g2.setColor(hatter);
		g2.fillRect(252, 32, 36, 26);
		}
		
		//nevezõ
		
		if(nevezo2){
			g2.setColor(Color.red);
			g2.fillRect(250, 75, 40, 30);
			
			g2.setColor(hatter);
			g2.fillRect(252, 77, 36, 26);
		}else{
		g2.setColor(Color.black);
		g2.fillRect(250, 75, 40, 30);
		
		g2.setColor(hatter);
		g2.fillRect(252, 77, 36, 26);
		}
		
		
		
		
		
		//3
		
				if(egesz3){
					g2.setColor(Color.red);
					g2.fillRect(350, 50, 40, 30);
					
					g2.setColor(hatter);
					g2.fillRect(352, 52, 36, 26);
				}else{
				g2.setColor(Color.black);
				g2.fillRect(350, 50, 40, 30);
				
				g2.setColor(hatter);
				g2.fillRect(352, 52, 36, 26);
				}
				
				
				//törtvonal
				
				g2.setColor(Color.black);
				g2.fillRect(400, 65, 40, 5);
				
				
				//szamláló
				
				if(szamlalo3){
					g2.setColor(Color.red);
					g2.fillRect(400, 30, 40, 30);
					
					g2.setColor(hatter);
					g2.fillRect(402, 32, 36, 26);
				}else{
				g2.setColor(Color.black);
				g2.fillRect(400, 30, 40, 30);
				
				g2.setColor(hatter);
				g2.fillRect(402, 32, 36, 26);
				}
				
				//nevezõ
				
				if(nevezo3){
					g2.setColor(Color.red);
					g2.fillRect(400, 75, 40, 30);
					
					g2.setColor(hatter);
					g2.fillRect(402, 77, 36, 26);
				}else{
				g2.setColor(Color.black);
				g2.fillRect(400, 75, 40, 30);
				
				g2.setColor(hatter);
				g2.fillRect(402, 77, 36, 26);
				}
		
		
				
				
				
				//mûveleti jelek
				
				//
				
				g2.setColor(Color.black);
				g2.fillRect(155, 52, 30, 30);
				
				g2.fillRect(305, 52, 30, 30);
				g2.setFont(new Font("Arial", 5, 30));
				g2.setColor(Color.white);
				g2.drawString("=", 312, 77);
		
		
		
		//koordináta + gomb
		
		g2.setColor(Color.black);
		g2.fillArc(egerx, egery, 5, 5, 0, 360);
		g2.setFont(new Font("Arial", 5, 15));
		g2.drawString("x="+egerx+"  y="+egery+"   gomb: "+gomb, 325, 150);
	}
	}
