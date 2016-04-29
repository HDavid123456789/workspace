package szimulacio;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
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

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Graf extends JPanel	{
	Image labda;
	int egerf;
	int x; int y;
	int gomb=0;
	int egerx=0; int egery=0;
	int xa; int ya;
	int xv; int yv;
	int gorgo;
	int xl; int yl;
	int ism; int ido;
	int maxy;
	int ism2;
	int tempo;
	int egergomb;
	int elenged=0;
	Random r=new Random();
	boolean katt=true;	
	boolean bal;
	boolean le=true;
	public Graf() {
		ImageIcon a = new ImageIcon (getClass().getResource("labda.png"));
		labda=a.getImage();
		
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
								if(egergomb==1){
									xl=xv;
									yl=yv;
									ido=0;
									elenged=elenged+1;
								}
								if(elenged==200){
									egergomb=0;
									katt=true;
									elenged=0;
								}
								if(katt){
								bal=r.nextBoolean();
								katt=false;
								}
								ism2=ism2+1;
								if(ism2==8){
									ism2=0;
									if(bal){
										xl=xl+1;
									}else{
										xl=xl-1;
									}
								}
								if(gomb==27){
									System.exit(0);
								}
								ido=ido+1;
								if(ido==10){
								ism=ism+1;
								ido=0;
								}
								if(egerx>0){
									katt=true;
									xl=egerx; yl=egery;
									maxy=egery;
									egerx=0; egery=0;
								}
								
								
								if(le){
								if(yl>y/10*9-95){
									yl=yl-1;
									maxy=y-((y-maxy)/3*2);	
									le=false;
								}else{
									yl=yl+1;
								}
								}else{
									if(yl<maxy){
										yl=yl+1;
										le=true;
									}else{
										yl=yl-1;
									}
								}
								
								
								if(maxy>y/10*9){
									maxy=y/10*9;
								}
								
								if(xl>x-100){
									xl=xl-1;
									ido=0;
								}
								if(xl<0){
									xl=xl+1;
									ido=0;
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
		g2.fillRect(0, 0, x, y);
		g2.setColor(Color.red);
		g2.fillOval(xa,ya,10,10);
		if(bal){
		g2.rotate(Math.toRadians(ism), xl+50,yl+50);
		g2.drawImage(labda, xl, yl, 100, 100, null);
		g2.rotate(Math.toRadians(-ism), xl+50,yl+50);
		}else{
			g2.rotate(Math.toRadians(-ism), xl+50,yl+50);
			g2.drawImage(labda, xl, yl, 100, 100, null);
			g2.rotate(Math.toRadians(ism), xl+50,yl+50);
		}
		
		g2.setColor(Color.gray);
		g2.fillRect(0, y/10*9, x, y/10);
		g2.setColor(Color.black);
		g2.fillRect(0, y/10*9, x, y/50);
}
	}
