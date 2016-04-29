package gunbattle;

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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class GrafGunBattle extends JPanel	{
	
	//kép
	
	 Image fold;
	 Image hatter;
	 Image var;
	 Image var2;
	 Image tabla;
	 Image zombi1m1;
	 Image zombi1m2;
	 Image nyiljobb;
	 Image nyilbal;
	 Image zombitamad;
	 Image jatekmenu;
	 Image penz;
	 Image sarkany1;
	 Image sarkany2;
	 Image sarkanytamadas;
	 Image sikonnem;
	 Image sikonlehet;

	 //változók, (igaz/hamis értékek)
	
	int gomb=0;
	int egerf=0;
	int xeger=0;
	int yeger=0;
	int xhatter=0;
	int gombelenged=0;
	int xvar=0;
	int zombi[]=new int [100];
	int zombialak[]=new int [100];
	int ido=0;
	int idozombi=1;
	int idooszto=3000;
	int ellenfel=20;
	int egerido=0;
	int egerido2=0;
	int xzombi=1200;
	int zalaki[]=new int [100];
	int hpvarjatekos=2500;
	int zombiutes=20;
	int hptelj=hpvarjatekos;
	int hp=0;
	int $=1000;
	int $ido=0;
	int harcos[]=new int [100];
	int hpvarpc=2500;
	int hppc=0;
	int hpteljpc=hpvarpc;
	int ealaki[]=new int[100];
	int sarkanyutes=75;
	int sarkanyalak[]=new int[100];
	int xharcos=1200;
	int db=0;
	int alap=0;
	int zalap=0;
	int varakozas=0;
	int sarkanyar=1000;
	int csapat=20;
	int zombihp=175;
	int sarkanyhp=750;
	int csata[]=new int[100];
	int csata2[]=new int[100];
	int speed=80;
	int hpzombi[]=new int[100];
	int hpsarkany[]=new int [100];
	int hpz[]=new int[100];
	int hps[]=new int[100];
	int gyorsasag=1;
	int eredmeny=0;
	int mozgas;
	int x=0;
	int y=0;
	
	public GrafGunBattle() {
		
		for(int i=0; i<100; i=i+1){
			zombi[i]=-100000;
			harcos[i]=-100000;
			hpsarkany[i]=sarkanyhp;
			hpzombi[i]=zombihp;
			csata[i]=0;
			csata2[i]=0;
		}
		zombi[0]=zalap+11000;
		
		// kép
				
		ImageIcon c = new ImageIcon (getClass().getResource("grassbg1.gif"));
		hatter=c.getImage();
		
		ImageIcon d = new ImageIcon (getClass().getResource("vár.png"));
		var=d.getImage();
		
		ImageIcon e = new ImageIcon (getClass().getResource("vár2.png"));
		var2=e.getImage();
		
		ImageIcon f = new ImageIcon (getClass().getResource("tábla.png"));
		tabla=f.getImage();
		
		ImageIcon g = new ImageIcon (getClass().getResource("zombialap1.png"));
		zombi1m1=g.getImage();
		
		ImageIcon h = new ImageIcon (getClass().getResource("zombialap2.png"));
		zombi1m2=h.getImage();
		
		ImageIcon i = new ImageIcon (getClass().getResource("föld.png"));
		fold=i.getImage();
		
		ImageIcon a = new ImageIcon (getClass().getResource("nyíljobb.png"));
		nyiljobb=a.getImage();
		
		ImageIcon b = new ImageIcon (getClass().getResource("nyílbal.png"));
		nyilbal=b.getImage();
		
		ImageIcon j = new ImageIcon (getClass().getResource("zombitámad.png"));
		zombitamad=j.getImage();
		
		ImageIcon k = new ImageIcon (getClass().getResource("jatekmenü.png"));
		jatekmenu=k.getImage();
		
		ImageIcon l = new ImageIcon (getClass().getResource("pénz.png"));
		penz=l.getImage();
		
		ImageIcon m = new ImageIcon (getClass().getResource("sárkány1.png"));
		sarkany1=m.getImage();
		
		ImageIcon n = new ImageIcon (getClass().getResource("sárkány2.png"));
		sarkany2=n.getImage();
		
		ImageIcon o = new ImageIcon (getClass().getResource("sárkánytámadás.png"));
		sarkanytamadas=o.getImage();
		
		ImageIcon p = new ImageIcon (getClass().getResource("snemlehet.png"));
		sikonnem=p.getImage();
		
		ImageIcon q = new ImageIcon (getClass().getResource("slehet.png"));
		sikonlehet=q.getImage();
		
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
								
								//SZÁMOLÁS
								if(eredmeny==0){
								
								for(int i=0; i<idozombi; i=i+1){
									for(int a=0; a<db; a=a+1){
									if(zombi[i]-harcos[a]<750){	
										csata[i]=1;
										csata2[a]=1;
									}
									}
								}
								
								
								
								ido=ido+3;
								if(ido>idooszto){
									idozombi=idozombi+1;
									ido=0;
									
									
									if(idozombi>ellenfel){
										idozombi=idozombi-1;
									}
								}
								for(int i=0; i<idozombi; i=i+1){
									if(zombi[i]==-100000){
										zombi[i]=alap+11000;
									}else{
								zombialak[i]=zombialak[i]+1;
								if(zombialak[i]>zalaki[i]){
									zombialak[i]=0;
								}
								if(csata[i]==1){
									for(int a=0; a<db; a=a+1){
										if(csata2[a]==1){
											if(sarkanyalak[a]==speed/2){
												if(i==0){
													hpzombi[i]=hpzombi[i]-sarkanyutes;
												}
											}
											
											if(csata[i]==1){
												if(a==0){
													if(zombialak[i]/2==200){
													hpsarkany[a]=hpsarkany[a]-zombiutes;
													}
												}
											}
										}
									}
								}else{
									zombi[i]=zombi[i]-1;
									}
									}
								}
								
								
								
								
								for(int a=0; a<db; a=a+1){
									if(harcos[a]==-100000){
										harcos[a]=alap;
									}else{
									sarkanyalak[a]=sarkanyalak[a]+1;
									if(sarkanyalak[a]>ealaki[a]){
										sarkanyalak[a]=0;
									}
									if(csata2[a]==0){
										harcos[a]=harcos[a]+1;
									}
									}
									}
								
								
								
								
								
																
								if(gomb==39 &xhatter<1975){
									zalap=zalap-4;
									alap=alap-4;
									xhatter=xhatter+1;
									for(int i=0; i<idozombi; i=i+1){
									zombi[i]=zombi[i]-4;
									}
									xvar=xvar-1;
									xzombi=xzombi-4;
									xharcos=xharcos-4;
									
									for(int a=0; a<db; a=a+1){
										harcos[a]=harcos[a]-4;
										}
									
									}
					
								
								
								
								if(gomb==37 & xhatter>10){
									zalap=zalap+4;
									alap=alap+4;
									xhatter=xhatter-1;
									for(int a=0; a<idozombi; a=a+1){
									zombi[a]=zombi[a]+4;
									}
									xvar=xvar+1;
									xzombi=xzombi+4;
									xharcos=xharcos+4;
									for(int i=0; i<db; i=i+1){
										harcos[i]=harcos[i]+4;
										}
									
								}
								
								
								if(xeger>2 & xeger<50 & yeger>225 & yeger<300 &xhatter>10){
									zalap=zalap+4;
									alap=alap+4;
									xhatter=xhatter-1;
									for(int i=0; i<idozombi; i=i+1){
									zombi[i]=zombi[i]+4;
									}
									for(int i=0; i<db; i=i+1){
										harcos[i]=harcos[i]+4;
										}
									xvar=xvar+1;
									xzombi=xzombi+4;
									xharcos=xharcos+4;
								}
								
							
								
								
								if(xeger>920 & xeger<1000 & yeger>225 & yeger<300& xhatter<1975){
									zalap=zalap-4;
									alap=alap-4;
									xhatter=xhatter+1;
									for(int i=0; i<idozombi; i=i+1){
									zombi[i]=zombi[i]-4;
									}
									for(int i=0; i<db; i=i+1){
										harcos[i]=harcos[i]-4;
										}
									xvar=xvar-1;
									xzombi=xzombi-4;
									xharcos=xharcos-4;
								}
								
								
								if(xeger>150 & xeger<250 & yeger>10 & yeger<150& $+1>sarkanyar & db<csapat){
									varakozas=1;
									$=$-sarkanyar;
									db=db+1;
									egerf=1;
									harcos[db-1]=alap;
								}

								
								
								
								if(gombelenged>0){
									gomb=0;
									gombelenged=0;
								}
								
								if(egerf>0){
									xeger=0;
									yeger=0;
									egerf=0;
								}
								for(int i=0; i<idozombi; i=i+1){
									if(zombi[i]<xzombi){
										zombi[i]=xzombi;
									}
								}
									for(int a=0; a<db; a=a+1){
										if(harcos[a]<xharcos){
											harcos[a]=xharcos;
										}
								}
								hp=hpvarjatekos*1000/hptelj*294/1000;
								if(hp<0){
									hp=0;
									eredmeny=2;
								}
								
								hppc=hpvarpc*1000/hpteljpc*294/1000;
								if(hppc<0){
									hppc=0;
									eredmeny=1;
								}
								for(int i=0; i<idozombi; i=i+1){
								hpz[i]=hpzombi[i]*100/zombihp;
								if(hpz[i]<0){
									hpz[i]=0;
								}
								}
								
								for(int i=0; i<db; i=i+1){
									hps[i]=hpsarkany[i]*1000/sarkanyhp/10;
									if(hps[i]<0){
										hps[i]=0;
									}
									}
								
								
									if(hpzombi[0]*100/zombihp<0){
										for(int a=1; a<idozombi; a=a+1){
											hpzombi[a-1]=hpzombi[a];
											hpz[a-1]=hpz[a];
											zombi[a-1]=zombi[a];
											zalaki[a-1]=zalaki[a];
											csata[a-1]=csata[a];
											zombialak[a-1]=zombialak[a];
											csata[a]=0;									
										}
										if(idozombi>0){
										idozombi=idozombi-1;
										$=$+125;
										}
										for(int i=0; i<db; i=i+1){
											csata2[i]=0;
										}
									}
									
									
									
									
									
									if(hpsarkany[0]*100/sarkanyhp<0){
										for(int a=1; a<db; a=a+1){
											hpsarkany[a-1]=hpsarkany[a];
											hps[a-1]=hps[a];
											harcos[a-1]=harcos[a];
											ealaki[a-1]=ealaki[a];
											csata2[a-1]=csata2[a];
											sarkanyalak[a-1]=sarkanyalak[a];
											
											
											
										}
										if(db>0){
										db=db-1;
										for(int i=0; i<idozombi; i=i+1){
											csata[i]=0;
										}
										}
									}
								
								
									
									
								$ido=$ido+1;
								if($ido>500){
									$ido=0;
									$=$+100;
								}
								
								for(int i=0; i<db; i=i+1){
									if(harcos[i]>xharcos+8500){
										harcos[i]=harcos[i]-1;
									}
								}
								if(varakozas>0){
									varakozas=varakozas+1;
									if(varakozas>100){
										varakozas=0;
									}
								}
								if(idozombi<1){
									idozombi=0;
								}
								
								if(xeger>835 & yeger>111 & yeger<136){
									egerf=1;
									gyorsasag=gyorsasag+1;
									if(gyorsasag==4){
										gyorsasag=1;
									}
								}
								}
							}	
							repaint(); 
							try {
								Thread.sleep(4-gyorsasag); 
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							}
						
						
						}
				}).start();
		}
	
	
	
//grafika



	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		if(eredmeny==0){
		
		for(int i=-1; i<3; i=i+1){
		g2.drawImage(hatter, -1*xhatter+i*1000, 0, 1000, 600,  null);
		}
		
		
		for(int i=-1; i<200; i=i+1){
		g2.drawImage(fold, -1*(xhatter+(i*50))+2900, 550, 50, 50, null);
		}
		g2.drawImage(var, xvar-20, 150, 400, 400,  null);
		g2.drawImage(var2, xvar+2600, 150, 400, 400,  null);
		g2.drawImage(tabla, xvar+1500, 350, 200, 200, null);
		
		
		for(int i=0; i<idozombi; i=i+1){
			g2.setColor(Color.black);
			g2.fillRect(zombi[i]/4-3+15, 400, 106, 25);
			g2.setColor(Color.red);
			g2.fillRect(zombi[i]/4+15, 403, 100, 20);
			g2.setColor(Color.green);
			g2.fillRect(zombi[i]/4+15, 403, hpz[i], 20);
			
		if(zombialak[i]<zalaki[i]/2){
			g2.drawImage(zombi1m1, zombi[i]/4, 400, 150, 150, null);
		}else{
			if(csata[i]==1){
				zalaki[i]=400;
				g2.drawImage(zombitamad, zombi[i]/4, 400, 150, 150,  null);
			}else{
			if(zombi[i]>xzombi){
				zalaki[i]=80;
			g2.drawImage(zombi1m2, zombi[i]/4, 400, 150, 150,  null);
		}else{
			if(zombialak[i]==zalaki[i]){
				hpvarjatekos=hpvarjatekos-zombiutes;
			}
			zalaki[i]=400;
			g2.drawImage(zombitamad, zombi[i]/4, 400, 150, 150,  null);
		}
		}
		}		
		}
		
		
		
		
		for(int i=0; i<db; i=i+1){
			g2.setColor(Color.black);
			g2.fillRect(harcos[i]/4-3+45, 360, 106, 25);
			g2.setColor(Color.red);
			g2.fillRect(harcos[i]/4+45, 363, 100, 20);
			g2.setColor(Color.yellow);
			g2.fillRect(harcos[i]/4+45, 363, hps[i], 20);
			if(sarkanyalak[i]<ealaki[i]/2){
				g2.drawImage(sarkany1, harcos[i]/4, 350, 200, 200, null);
			}else{
				if(csata2[i]==1){
					ealaki[i]=speed*6;
					g2.drawImage(sarkanytamadas, harcos[i]/4, 350, 200, 200,  null);
				}else{
				if(harcos[i]<xharcos+8500){
					ealaki[i]=speed;
				g2.drawImage(sarkany2, harcos[i]/4, 350, 200, 200,  null);
			}else{
				if(sarkanyalak[i]==ealaki[i]){
					hpvarpc=hpvarpc-sarkanyutes;
				}
				ealaki[i]=speed*6;
				g2.drawImage(sarkanytamadas, harcos[i]/4, 350, 200, 200,  null);
			}
			}
			}
			}
		
		
		g2.drawImage(nyilbal, 2, 214, 50, 50,  null);
		g2.drawImage(nyiljobb, 940, 214, 50, 50,  null);
		
		
		
		g2.setColor(Color.black);
		g2.fillRect(10, 560, 300, 30);
		g2.setColor(Color.white);
		g2.fillRect(13, 563, 294, 24);
		g2.setColor(Color.red);
		g2.fillRect(13, 563, hp, 24);
		
		g2.setColor(Color.black);
		g2.fillRect(680, 560, 300, 30);
		g2.setColor(Color.white);
		g2.fillRect(683, 563, 294, 24);
		g2.setColor(Color.red);
		g2.fillRect(683, 563, hppc, 24);
		
		g2.setColor(Color.black);
		g2.setFont(new Font("Arial", 1, 20));
		g2.drawString(hptelj+" / "+hpvarpc, 790, 582);
		g2.drawString(hptelj+" / "+hpvarjatekos, 100, 582);
		
		
		g2.drawImage(jatekmenu, 0, 0, 994, 120,  null);
		g2.setColor(Color.white);
		g2.fillRect(833, 73, 154, 29);
		g2.setColor(Color.black);
		g2.fillRect(835, 5, 150, 50);
		
		g2.fillRect(835, 75, 150, 25);
		g2.setColor(Color.white);
		g2.setFont(new Font("Arial", 1, 15));
		g2.drawString("Sebesség:  "+gyorsasag+" / 3 ", 850, 92);
		g2.setFont(new Font("Arial", 1, 30));
		g2.drawString(""+$, 850, 40);
		g2.drawImage(penz, 940, 15, 35, 35,  null);
		
		
		g2.setColor(Color.white);
		g2.setFont(new Font("Arial", 1, 30));
		g2.drawString(ellenfel+" / "+idozombi, 875, 150);
		g2.drawString(csapat+" / "+db, 50, 150);
		
		if($<sarkanyar){
		g2.drawImage(sikonnem, 150, 10, 100, 100,  null);
		}else{
		g2.drawImage(sikonlehet, 150, 10, 100, 100,  null);
		}
		if(varakozas>0){
			g2.drawImage(sikonnem, 150, 10, 100, 100,  null);
			}
		}else{
		g2.setColor(Color.black);
		g2.fillRect(0, 0, 1000, 600);
		
		if(eredmeny==2){
			g2.setColor(Color.red);
			g2.setFont(new Font("Arial", 1, 50));
			g2.drawString("VESZTETTÉL", 350, 300);
		}else{
			g2.setColor(Color.green);
			g2.setFont(new Font("Arial", 1, 50));
			g2.drawString("GYÕZTÉL", 350, 300);	
		}
		}
		if(gomb==32){
		System.exit(0);
		}
		mozgas=mozgas+1;
		if(mozgas==360){
			
		}
}
	}
