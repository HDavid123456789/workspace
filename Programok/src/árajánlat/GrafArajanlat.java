package árajánlat;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class GrafArajanlat extends JPanel	{
	private static final long serialVersionUID = 1L;
	
	Image fejlec;
	Image eger;
	Image exit;Image exit2;
	Image plusz;Image plusz2;
	Image pcim; Image pcim2;
	//grafika számolás
	int egerx=0; int egery=0; int egergomb;
	int katt=0;
	int gomb=-1; int gomb2=0;
	int x; int y;
	int xa=0; int ya=0;
	int gorgo=0; int gszam=0;
	int szam=0;
	int alc[]=new int[250];
	int sor[]=new int[250];
	int sorm[]=new int[250];
	int ssz2[]=new int[250];
	String cim="";
	String hely="";
	String ssz[]=new String[250];
	String szoveg="";
	String szoveg2="";
	boolean anyagkatt;
	boolean c[]=new boolean[2];	
	boolean h[]=new boolean[2];
	boolean alkalom=true;
	boolean alkalom2=true;
	boolean alcim;
	boolean elso=true;
	public GrafArajanlat() {
		ImageIcon kep1 = new ImageIcon (getClass().getResource("fejléc.png")); fejlec=kep1.getImage();
		ImageIcon kep2 = new ImageIcon (getClass().getResource("eger.png")); eger=kep2.getImage();
		ImageIcon kep3 = new ImageIcon (getClass().getResource("exit.png")); exit=kep3.getImage();
		ImageIcon kep4 = new ImageIcon (getClass().getResource("exit2.png")); exit2=kep4.getImage();		
		ImageIcon kep5 = new ImageIcon (getClass().getResource("plusz.png")); plusz=kep5.getImage();
		ImageIcon kep6 = new ImageIcon (getClass().getResource("plusz2.png")); plusz2=kep6.getImage();
		ImageIcon kep7 = new ImageIcon (getClass().getResource("pluszcim.png")); pcim=kep7.getImage();
		ImageIcon kep8 = new ImageIcon (getClass().getResource("pluszcim2.png")); pcim2=kep8.getImage();
		
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
								
								if(y-y/15<szam*(y/15+y/20)){
								if(gorgo==-1){gorgo=0;gszam=gszam+1;}
								if(gorgo==1){gorgo=0;gszam=gszam-1;}
								}								
								if(egerx>x-x/50 & egery<x/50){
								System.exit(0);
								}
								katt();
								betu();
								kiiras();
							}
							repaint(); 
							try {
								Thread.sleep(10); 
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
					
private void kiiras() {
	if(c[1]){if(alkalom){cim=szoveg;}else{szoveg=cim;}}
	if(h[1]){if(alkalom2){hely=szoveg;}else{szoveg=hely;}}
						
					}

private void betu() {
	if(gomb2==97){szoveg=szoveg+"a";}
	if(gomb2==98){szoveg=szoveg+"b";}
	if(gomb2==99){szoveg=szoveg+"c";}
	if(gomb2==100){szoveg=szoveg+"d";}
	if(gomb2==101){szoveg=szoveg+"e";}
	if(gomb2==102){szoveg=szoveg+"f";}
	if(gomb2==103){szoveg=szoveg+"g";}
	if(gomb2==104){szoveg=szoveg+"h";}
	if(gomb2==105){szoveg=szoveg+"i";}
	if(gomb2==106){szoveg=szoveg+"j";}
	if(gomb2==107){szoveg=szoveg+"k";}
	if(gomb2==108){szoveg=szoveg+"l";}
	if(gomb2==109){szoveg=szoveg+"m";}
	if(gomb2==110){szoveg=szoveg+"n";}
	if(gomb2==111){szoveg=szoveg+"o";}
	if(gomb2==112){szoveg=szoveg+"p";}
	if(gomb2==113){szoveg=szoveg+"q";}
	if(gomb2==114){szoveg=szoveg+"r";}
	if(gomb2==115){szoveg=szoveg+"s";}
	if(gomb2==116){szoveg=szoveg+"t";}
	if(gomb2==117){szoveg=szoveg+"u";}
	if(gomb2==118){szoveg=szoveg+"v";}
	if(gomb2==119){szoveg=szoveg+"w";}
	if(gomb2==120){szoveg=szoveg+"x";}
	if(gomb2==121){szoveg=szoveg+"y";}
	if(gomb2==122){szoveg=szoveg+"z";}
	
	if(gomb2==233){szoveg=szoveg+"é";}
	if(gomb2==225){szoveg=szoveg+"á";}
	if(gomb2==369){szoveg=szoveg+"û";}
	if(gomb2==237){szoveg=szoveg+"í";}
	if(gomb2==250){szoveg=szoveg+"ú";}
	if(gomb2==337){szoveg=szoveg+"õ";}
	if(gomb2==243){szoveg=szoveg+"ó";}
	if(gomb2==252){szoveg=szoveg+"ü";}
	if(gomb2==246){szoveg=szoveg+"ö";}
	///////////////////////////////////
	
	if(gomb2==65){szoveg=szoveg+"A";}
	if(gomb2==66){szoveg=szoveg+"B";}
	if(gomb2==67){szoveg=szoveg+"C";}
	if(gomb2==68){szoveg=szoveg+"D";}
	if(gomb2==69){szoveg=szoveg+"E";}
	if(gomb2==70){szoveg=szoveg+"F";}
	if(gomb2==71){szoveg=szoveg+"G";}
	if(gomb2==72){szoveg=szoveg+"H";}
	if(gomb2==73){szoveg=szoveg+"I";}
	if(gomb2==74){szoveg=szoveg+"J";}
	if(gomb2==75){szoveg=szoveg+"K";}
	if(gomb2==76){szoveg=szoveg+"L";}
	if(gomb2==77){szoveg=szoveg+"M";}
	if(gomb2==78){szoveg=szoveg+"N";}
	if(gomb2==79){szoveg=szoveg+"O";}
	if(gomb2==80){szoveg=szoveg+"P";}
	if(gomb2==81){szoveg=szoveg+"Q";}
	if(gomb2==82){szoveg=szoveg+"R";}
	if(gomb2==83){szoveg=szoveg+"S";}
	if(gomb2==84){szoveg=szoveg+"T";}
	if(gomb2==85){szoveg=szoveg+"U";}
	if(gomb2==86){szoveg=szoveg+"V";}
	if(gomb2==87){szoveg=szoveg+"W";}
	if(gomb2==88){szoveg=szoveg+"X";}
	if(gomb2==89){szoveg=szoveg+"Y";}
	if(gomb2==90){szoveg=szoveg+"Z";}
	
	if(gomb2==201){szoveg=szoveg+"É";}
	if(gomb2==193){szoveg=szoveg+"Á";}
	if(gomb2==368){szoveg=szoveg+"Û";}
	if(gomb2==205){szoveg=szoveg+"Í";}
	if(gomb2==218){szoveg=szoveg+"Ú";}
	if(gomb2==336){szoveg=szoveg+"Õ";}
	if(gomb2==211){szoveg=szoveg+"Ó";}
	if(gomb2==220){szoveg=szoveg+"Ü";}
	if(gomb2==214){szoveg=szoveg+"Ö";}
	/////////////////////////////////////////
	
	
	if(gomb2==48){szoveg=szoveg+"0";}
	if(gomb2==49){szoveg=szoveg+"1";}
	if(gomb2==50){szoveg=szoveg+"2";}
	if(gomb2==51){szoveg=szoveg+"3";}
	if(gomb2==52){szoveg=szoveg+"4";}
	if(gomb2==53){szoveg=szoveg+"5";}
	if(gomb2==54){szoveg=szoveg+"6";}
	if(gomb2==55){szoveg=szoveg+"7";}
	if(gomb2==56){szoveg=szoveg+"8";}
	if(gomb2==57){szoveg=szoveg+"9";}
	
	if(gomb2==46){szoveg=szoveg+".";}
	if(gomb2==58){szoveg=szoveg+":";}
	if(gomb2==44){szoveg=szoveg+",";}
	if(gomb2==63){szoveg=szoveg+"?";}
	if(gomb2==33){szoveg=szoveg+"!";}
	if(gomb2==63){szoveg=szoveg+"?";}
	if(gomb2==40){szoveg=szoveg+"(";}
	if(gomb2==41){szoveg=szoveg+")";}
	if(gomb2==45){szoveg=szoveg+"-";}
	if(gomb2==43){szoveg=szoveg+"+";}
	if(gomb2==42){szoveg=szoveg+"*";}
	if(gomb2==47){szoveg=szoveg+"/";}
	if(gomb2==95){szoveg=szoveg+"_";}
	if(gomb2==32){szoveg=szoveg+" ";}
	if(gomb2==61){szoveg=szoveg+"=";}
	if(gomb2==37){szoveg=szoveg+"%";}
	if(gomb2==39){szoveg=szoveg+"~";}
	if(gomb2==59){szoveg=szoveg+";";}
	
	
	if(gomb2==8){
		szoveg2=szoveg;
		szoveg="";
		for(int i=0;i<szoveg2.length()-1; i=i+1){
			szoveg=szoveg+szoveg2.charAt(i); 
		}
		}
	gomb2=0;
						
					}

private void katt() {
	if(xa>0 & xa<x/2 & ya>0 & ya<y/20){c[0]=true;}else{c[0]=false; }
	if(egerx>0 & egerx<x/2 & egery>0 & egery<y/20 & egergomb==1){c[1]=true;c[0]=false;alkalom=true;szoveg=cim;}else{c[1]=false;alkalom=false;}
	
	if(xa>0 & xa<x/5*2 & ya>20 & ya<y/10){h[0]=true;}else{h[0]=false;}
	if(egerx>0 & egerx<x/5*2 & egery>y/20 & egery<y/10 & egergomb==1 ){h[1]=true;h[0]=false; alkalom2=true;szoveg=hely;}else{h[1]=false;alkalom2=false;}
	
	if(xa>x/5*3 & xa<x/5*3+x/30 & ya>y/50 & ya<y/50+x/30){anyagkatt=true;}else{anyagkatt=false;}
	if(xa>x/5*3+x/20 & xa<x/5*3+x/30+x/20 & ya>y/50 & ya<y/50+x/30){alcim=true;}else{alcim=false;}
	
	if(egerx>x/5*3 & egerx<x/5*3+x/30 & egery>y/50 & egery<y/50+x/30){szam=szam+1;egerx=0;egery=0; if(szam>1){sor[szam-1]=sor[szam-2]+sorm[szam-2]+(y/10-y/15);sorm[szam-1]=y/20;}else{sorm[szam-1]=y/20;sor[szam-1]=y/10;}}
	if(egerx>x/5*3+x/20 & egerx<x/5*3+x/30+x/20 & egery>y/50 & egery<y/50+x/30){szam=szam+1;egerx=0;egery=0; alc[szam-1]=1;if(szam>1){sor[szam-1]=sor[szam-2]+sorm[szam-2]+(y/10-y/15);sorm[szam-1]=y/15;}else{sorm[szam-1]=y/15;sor[szam-1]=y/10;}}
	
	for(int i=0; i<szam; i=i+1){
		if(egerx>0 & egerx<x/20 & egery>sor[i] & egery<sorm[i]){
			ssz2[i]=1;			
		}
		if(xa>0 & xa<x/20 & ya-y/10>sor[i+1]+y/60 & ya-y/10<sorm[i+1]+y/60){
			ssz2[i]=2;
		}
		System.out.println(ya+" "+sor[i]+" "+sorm[i]+" "+(ya/sor[i]-y/30));
	}
}
				}).start();
	}



	public void paintComponent(Graphics g) {
	     //ALAP/////////////////////////////////////////////   
		Graphics2D g2 = (Graphics2D) g;
		Color alap=new Color(255, 255, 255);
		g2.setColor(alap);
		g2.fillRect(0, 0, x, y);
		
		
		//anyag///////////////////////////////////////////////////////////
		
		for(int i=0; i<szam; i=i+1){
			if(alc[i]==1){}else{
			g2.setColor(Color.black);
			g2.fillRect(0, y/10+sor[i]+gszam*-20, x, sorm[i]);
			Color sorszin=new Color(240, 240, 240);
			g2.setColor(sorszin);
			g2.fillRect(x/500, y/10+sor[i]+x/500+gszam*-20, x-x/250, sorm[i]-x/250);
		}
		}
		
		//sorok//////////////////////////////////////////////////////////////
		
		g2.setColor(Color.black);
		g2.fillRect(0, y/15*14, x, y/15);
		
		g2.setColor(Color.black);
		g2.fillRect(0, y/10, x, y/15);
		g2.setColor(Color.white);
		g2.fillRect(x/300, y/10+x/300, x-x/150, y/15-x/150);
		
		g2.setColor(Color.black);
		g2.fillRect(x/20, y/10, x/500, y/15*13-y/30);
		g2.fillRect(x/20*9, y/10, x/500,  y/15*13-y/30);
		g2.fillRect(x/20*11, y/10, x/500,  y/15*13-y/30);
		g2.fillRect(x/20*12, y/10, x/500,  y/15*13-y/30);
		g2.fillRect(x/20*14, y/10, x/500,  y/15*13-y/30);
		g2.fillRect(x/20*16, y/10, x/500,  y/15*13-y/30);
		g2.fillRect(x/20*18, y/10, x/500,  y/15*13-y/30);
		
		
		for(int i=0; i<szam; i=i+1){
			if(alc[i]==1){
				g2.setColor(Color.black);
				g2.fillRect(0, y/15+sor[i]+x/500+gszam*-20+((y/10-y/y/15)/2), x, sorm[i]-x/250);
				g2.setColor(Color.LIGHT_GRAY);
				g2.fillRect(0+x/250, y/15+sor[i]+gszam*-20+x/250+((y/10-y/y/15)/2), x-x/125, sorm[i]-x/250-x/125);
			}
		}
		
		//sorok//////////////////////////////////////////////////////////////
		
				g2.setColor(Color.black);
				g2.fillRect(0, y/15*14, x, y/15);
				
				g2.setColor(Color.black);
				g2.fillRect(0, y/10, x, y/15);
				g2.setColor(Color.white);
				g2.fillRect(x/300, y/10+x/300, x-x/150, y/15-x/150);
				
				g2.setColor(Color.black);
				g2.setFont(new Font("Arial", 1, y/55));
				g2.drawString("S.sz", x/100, y/10+y/25);
				g2.drawString("Megnevezés", x/100+x/20*4, y/10+y/25);
				g2.drawString("mennyiség", x/100+x/20*9, y/10+y/25);
				g2.drawString("m.e", x/100+x/20*11, y/10+y/25);
				g2.drawString("anyag", x/50+x/20*12, y/10+y/25-y/60);
				g2.drawString("egységár", x/80+x/20*12, y/10+y/25+y/25-y/30);
				g2.drawString("díj", x/50+x/20*14+y/50, y/10+y/25-y/60);
				g2.drawString("egységár", x/80+x/20*14, y/10+y/25+y/25-y/30);
				g2.setFont(new Font("Arial", 1, y/60));
				g2.drawString("anyag összesen", x/200+x/20*16, y/10+y/25);
				g2.drawString("díj összesen ", x/100+x/20*18, y/10+y/25);
				
		
		g2.setColor(Color.white);
		g2.fillRect(x/300, y/15*14+x/300, x-x/150, y/15-x/150);
		g2.setColor(Color.black);
		g2.fillRect(0, y/30*29, x, x/300);
		
		g2.setFont(new Font("Arial", 1, y/50));
		g2.drawString("MINDÖSSZESEN nettó anyag és díj   ", x/50, y/50*48);
		g2.drawString("MINDÖSSZESEN nettó anyag + díj", x/50, y/100*99);
		
		
		// FEJLÉC////////////////////////////////////////////////
		g2.drawImage(fejlec,0, 0, x, y/10,null);
				if(c[0]){g2.setColor(Color.red);}else{g2.setColor(Color.black);}
				g2.fillRect(0, 0, x/2, y/20);
				if(c[1]){g2.setColor(Color.red);}else{g2.setColor(Color.LIGHT_GRAY);}
				g2.fillRect(x/300, x/300, x/2-x/150, y/20-x/150);
				
				if(h[0]){g2.setColor(Color.red);}else{g2.setColor(Color.black);}
				g2.fillRect(0, y/20, x/5*2, y/20);
				if(h[1]){g2.setColor(Color.red);}else{g2.setColor(Color.LIGHT_GRAY);}
				g2.fillRect(x/300, x/300+y/20, x/5*2-x/150, y/20-x/150);
				
				g2.setColor(Color.black);
				g2.setFont(new Font("Arial", 1, y/50));
				g2.drawString(cim, x/100,y/15/2);
				g2.drawString(hely, x/100,y/15+y/75);
	       
				if(anyagkatt){
					g2.drawImage(plusz2, x/5*3, y/50, x/30, x/30,null);
					}else{
					g2.drawImage(plusz, x/5*3, y/50, x/30, x/30,null);
					}
					
					if(alcim){
						g2.drawImage(pcim2, x/5*3+x/20, y/50, x/30, x/30,null);
						}else{
						g2.drawImage(pcim, x/5*3+x/20, y/50, x/30, x/30,null);
						}
					
					if(xa>x-x/50 & ya<x/50){
						g2.drawImage(exit2, x-x/50, 0, x/50,x/50,null);
					}else{
						g2.drawImage(exit, x-x/50, 0, x/50,x/50,null);
					}
					
					for(int i=0; i<szam; i=i+1){
						if(ssz2[i]==2){
							g2.setColor(Color.red);
							g2.fillRect(x/20, sor[i]+y/60+gszam*-20, x/250, sorm[i]);
						}
					}
	        
	      //egér        
			g2.drawImage(eger,xa,ya,x/120,x/60,null);
}
	}
