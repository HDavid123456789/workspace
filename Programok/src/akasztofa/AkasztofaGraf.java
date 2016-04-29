package akasztofa;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class AkasztofaGraf extends JPanel	{
	Image hatter;
	Image ck; Image ck2;
	Image jatek; Image jatek2;
	Image exit; Image exit2;
	Image alap;
	Image betû; Image betû2;
	Image youtube; Image kaja; Image allatvilag; Image marka;
	Image ak01; Image ak02; Image ak03; Image ak04; Image ak05;
	Image ak06; Image ak07; Image ak08; Image ak09; Image ak10;
	Image exit3; Image exit4;
	Image vissza; Image vissza2; Image következõ; Image következõ2;
	Image gyalap; Image m; Image m2;
	
	
	int szam=0;
	
	int egerf;
	int gomb=0; int gomb2;
	int egerx=0; int egery=0;
	int xa; int ya;
	int gorgo;
	int egergomb;
	int x; int y;
	int csere; int cs;
	int sz=0; int s=0; int min=1; 
	int kör=0;
	int xb=0; int yb=0;
	int hiba=0; int gszam=0; int gszam2; int gszam3=0;
	int ido=0; int ido2;
	int ism=0; int ism2; int ism3;
	int hossz;
	
	String cím[]=new String[15];
	int sorrend[] = new int[cím.length];
	int gombkatt[]=new int [35];
	int szavak=sorrend.length;
	
	String szó[]=new String [60];
	String gombok[]=new String[35];
	String szoveg;
	String sz2=""; String s2=""; String min2=""; 
	
	boolean katt=false;
	boolean start=false;
	boolean kattjatek=false;
	boolean kattexit=false;
	boolean vege=false;
	boolean menü=false;
	boolean kezdes=true;
	boolean valasztas[]=new boolean[4];
	boolean valasztaskatt[]=new boolean[4];
	boolean vesztett=false;
	boolean kilépés;
	boolean back;
	boolean köv;
	boolean gyõzelem=false;
	boolean bmenü; boolean bköv; boolean bvissza;
	boolean elsõ=true;
	Random r=new Random();
	
	public AkasztofaGraf() {
		ImageIcon a1 = new ImageIcon (getClass().getResource("háttér.jpg")); hatter=a1.getImage();
		ImageIcon a2 = new ImageIcon (getClass().getResource("célkereszt.png")); ck=a2.getImage();
		ImageIcon a3 = new ImageIcon (getClass().getResource("célkereszt2.png")); ck2=a3.getImage();
		ImageIcon a4 = new ImageIcon (getClass().getResource("játék.png")); jatek=a4.getImage();
		ImageIcon a5 = new ImageIcon (getClass().getResource("játék2.png")); jatek2=a5.getImage();
		ImageIcon a6 = new ImageIcon (getClass().getResource("játék3.png")); exit=a6.getImage();
		ImageIcon a7 = new ImageIcon (getClass().getResource("játék4.png")); exit2=a7.getImage();
		ImageIcon a8 = new ImageIcon (getClass().getResource("betû.png")); alap=a8.getImage();
		ImageIcon a9 = new ImageIcon (getClass().getResource("betûalap.png")); betû=a9.getImage();
		ImageIcon a10 = new ImageIcon (getClass().getResource("betûalap2.png")); betû2=a10.getImage();
		ImageIcon a11 = new ImageIcon (getClass().getResource("youtbe.jpg")); youtube=a11.getImage();
		ImageIcon a12 = new ImageIcon (getClass().getResource("márkák.jpg")); marka=a12.getImage();
		ImageIcon a13 = new ImageIcon (getClass().getResource("állatvilág.jpg")); allatvilag=a13.getImage();
		ImageIcon a14 = new ImageIcon (getClass().getResource("ételital.jpg")); kaja=a14.getImage();
		
		ImageIcon ab1= new ImageIcon (getClass().getResource("01.png")); ak01=ab1.getImage();
		ImageIcon ab2= new ImageIcon (getClass().getResource("02.png")); ak02=ab2.getImage();
		ImageIcon ab3= new ImageIcon (getClass().getResource("03.png"));  ak03=ab3.getImage();
		ImageIcon ab4= new ImageIcon (getClass().getResource("04.png"));  ak04=ab4.getImage();
		ImageIcon ab5= new ImageIcon (getClass().getResource("05.png"));  ak05=ab5.getImage();
		ImageIcon ab6= new ImageIcon (getClass().getResource("06.png"));  ak06=ab6.getImage();
		ImageIcon ab7= new ImageIcon (getClass().getResource("07.png"));  ak07=ab7.getImage();
		ImageIcon ab8= new ImageIcon (getClass().getResource("08.png"));  ak08=ab8.getImage();
		ImageIcon ab9= new ImageIcon (getClass().getResource("09.png"));  ak09=ab9.getImage();
		ImageIcon ab10= new ImageIcon (getClass().getResource("10.png"));  ak10=ab10.getImage();
		
		ImageIcon a15= new ImageIcon (getClass().getResource("exit.png"));  exit3=a15.getImage();
		ImageIcon a16= new ImageIcon (getClass().getResource("exit2.png"));  exit4=a16.getImage();
		ImageIcon a17= new ImageIcon (getClass().getResource("vissza.png"));  vissza=a17.getImage();
		ImageIcon a18= new ImageIcon (getClass().getResource("vissza2.png"));  vissza2=a18.getImage();
		ImageIcon a19= new ImageIcon (getClass().getResource("következõ.png"));  következõ=a19.getImage();
		ImageIcon a20= new ImageIcon (getClass().getResource("következõ2.png"));  következõ2=a20.getImage();
		ImageIcon a21= new ImageIcon (getClass().getResource("nyeresalap.png"));  gyalap=a21.getImage();
		ImageIcon a22= new ImageIcon (getClass().getResource("menü.png"));  m=a22.getImage();
		ImageIcon a23= new ImageIcon (getClass().getResource("menü2.png"));  m2=a23.getImage();
		
		for(int i=0; i<gombok.length; i=i+1){
			gombkatt[i]=0;
		}
		for(int i=0; i<valasztas.length; i=i+1){
			valasztas[i]=false;
			valasztaskatt[i]=false;
		}
		//állatvilág
		szó[0]="macska";szó[1]="kutya";szó[2]="delfin";szó[3]="medve";szó[4]="kecske";
		szó[5]="zsiráf";szó[6]="elefánt";szó[7]="majom";szó[8]="madár";szó[9]="rovar";
		szó[10]="bogár";szó[11]="méh";szó[12]="tücsök";szó[13]="rák";szó[14]="szúnyog";
		
		//márkák, cégek
		szó[15]="opel";szó[16]="ferrari";szó[17]="google";szó[18]="youtube";szó[19]="samsung";
		szó[20]="nokia";szó[21]="lenovo";szó[22]="sony";szó[23]="adidas";szó[24]="nike";
		szó[25]="puma";szó[26]="suzuki";szó[27]="apple";szó[28]="nivea";szó[29]="acer";
		
		//magyar youtbe
		szó[30]="justvidman";szó[31]="videómánia";szó[32]="unfield";szó[33]="cschannel";szó[34]="szalay isti";
		szó[35]="thevr";szó[36]="dancsópéter";szó[37]="pamkutya";szó[38]="csebe";szó[39]="wellhello";
		szó[40]="rakpart";szó[41]="reakcióvideó";szó[42]="herby";szó[43]="kihívás";szó[44]="luckey";
		
		//ételek-italok
		szó[45]="limonádé";szó[46]="citrom";szó[47]="alma";szó[48]="narancs";szó[49]="banán";
		szó[50]="víz";szó[51]="szörp";szó[52]="bagett";szó[53]="kenyér";szó[54]="gomba";
		szó[55]="torta";szó[56]="spagetti";szó[57]="leves";szó[58]="tészta";szó[59]="kalács";
		
		gombok[0]="a";gombok[1]="á";gombok[2]="b";gombok[3]="c";gombok[4]="d";
		gombok[5]="e";gombok[6]="é";gombok[7]="f";gombok[8]="g";gombok[9]="h";
		gombok[10]="i";gombok[11]="í";gombok[12]="j";gombok[13]="k";gombok[14]="l";
		gombok[15]="m";gombok[16]="n";gombok[17]="o";gombok[18]="ó";gombok[19]="ö";
		gombok[20]="õ";gombok[21]="p";gombok[22]="q";gombok[23]="r";gombok[24]="s";
		gombok[25]="t";gombok[26]="u";gombok[27]="ú";gombok[28]="ü";gombok[29]="û";
		gombok[30]="v";gombok[31]="w";gombok[32]="x";gombok[33]="y";gombok[34]="z";
		
		Random r = new Random();
		for (int i = 0; i < sorrend.length; i++) {
			sorrend[i] = i;
		}
		
		csere=0; cs=0;
		for (int i = 0; i < sorrend.length; i++) {
			cs = (int) (r.nextFloat() * szavak);
			csere=sorrend[cs];
			sorrend[cs]=sorrend[szavak-1];
			sorrend[szavak-1]=csere;
			szavak=szavak-1;
		}
		
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
								if (ido2==100){
									hiba=0;
									szavak=sorrend.length;
									csere=0; cs=0;
									for (int i = 0; i < sorrend.length; i++) {
										cs = (int) (r.nextFloat() * szavak);
										csere=sorrend[cs];
										sorrend[cs]=sorrend[szavak-1];
										sorrend[szavak-1]=csere;
										szavak=szavak-1;
									}
									for(int i=0; i<valasztaskatt.length; i=i+1){
										valasztaskatt[i]=false;
										//kezdes=true;
									}
									menü=true;
									start=false;
									egerx=0;egerx=0;
									for(int i=0; i<gombok.length; i=i+1){
										gombkatt[i]=0;
										
									}
									ido2=0;
									vege=false;
									vesztett=false;
									}
								if(hiba>9){
									ido=ido+1;
									if(ido<100){
										ido=0;
										hiba=0;
										vesztett=true;
									}
								}
								if(gomb==32){
									hiba=0;
									sz=0; s=0; min=1; 
									if(kör==sorrend.length-1){
										kör=0;
									}else{
									kör=kör+1;
									}
									gomb=0;
									egerx=0;
									egery=0;
									for(int i=0; i<gombkatt.length; i=i+1){
										gombkatt[i]=0;
										
									}
								}
								
								if(start){
									sz=sz-1;
									if(sz<0){sz=99; s=s-1;}
									if(s<0){s=59;min=min-1;}
									if(min<0){vege=true;min=0; s=0; sz=0;}
									min2=min+"";
									if(s<10){s2="0"+s;}else{s2=s+"";}
									if(sz<10){sz2="0"+sz;}else{sz2=sz+"";}
									
									
								
								
								}
								
								if(gomb==27){
									System.exit(0);
								}
								katt();
								
								
							}
							repaint(); 
							try {
								Thread.sleep(10); 
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}

private void katt() {
	elsõ=true;
	if(gyõzelem){
		if(egerx>x-x/40&egery<x/40){
			System.exit(0);
		}
		if(xa>x-x/30&ya<x/30){
			kilépés=true;
			katt=true;
		}else{
			kilépés=false;
			katt=false;
		}
		if(xa>x/20*3 & xa<x/20*3+x/5&ya>y/10*7&ya<y/10*7+y/10){
			bvissza=true;
			katt=true;
		}else{
			bvissza=false;
		}
		if(xa>x/20*13&xa<x/20*13+x/5&ya>y/10*7&ya<y/10*7+y/10){
			bköv=true;
			katt=true;
		}else{
		bköv=false;
		}
		
		
		
		if(egerx>x/20*3 & egerx<x/20*3+x/5&egery>y/10*7&egery<y/10*7+y/10){
			ido2=100;
			min=1;
			s=0;
			gyõzelem=false;
			elsõ=false;
			hiba=0;
		}
		if(egerx>x/20*13&egerx<x/20*13+x/5&egery>y/10*7&egery<y/10*7+y/10){
			gomb=32;
			gyõzelem=false;
			elsõ=false;
			hiba=0;
		}
		
	}
	
	
	
	if(start & gyõzelem==false){
		if(xa>x-x/6&ya>y-y/12){
			köv=true;
			katt=true;
		}else{
			köv=false;
		}
		if(xa<x/6&ya>y-y/12){
			back=true;
			katt=true;
		}else{
			back=false;
		}
		
		if(egerx>x-x/6&egery>y-y/12){
			gomb=32;
		}
		if(egerx<x/6&egery>y-y/12){
			ido2=100;
			min=1;
			s=0;
		}
		
		
		
		xb=0; yb=0;
		for(int i=0; i<gombok.length; i=i+1){
			xb=xb+1;
			if(i==i/7*7){
				yb=yb+1;
				xb=0;
			}
			if(xa>x/5*3+(xb*x/18)  &  xa<x/5*3+(xb*x/18)+x/20  &  ya> y/2+yb*y/15  &  ya< y/2+yb*y/15+y/20){
				if(gombkatt[i]==0){
				gombkatt[i]=1;
				}
			}else{
				if(gombkatt[i]==1){
				gombkatt[i]=0;
				}
			}
			if(egerx>x/5*3+(xb*x/18)  &  egerx<x/5*3+(xb*x/18)+x/20  &  egery> y/2+yb*y/15  &  egery< y/2+yb*y/15+y/20){
				gombkatt[i]=2;
				gszam=0;
				for(int i2=0; i2<cím[sorrend[kör]].length(); i2++){
					if(gombok[i].charAt(0)==cím[sorrend[kör]].charAt(i2)){
						gszam++;
					}
				}
				if(gszam==0){
					hiba=hiba+1;
				}
				
			}
		}
		
		if(xa>x-x/30&ya<x/30){
			kilépés=true;
			katt=true;
		}else{
			kilépés=false;
			katt=false;
		}
		if(egerx>x-x/40&egery<x/40){
			System.exit(0);
		}	
		
	}
	if(start==false){
		//EGÉR////////////
		if(xa>x/5*2 & xa<x/5*3 & ya>y/5*2-y/20 & ya<y/5*2-y/20+y/10){
			kattjatek=true;
			katt=true;
		}else{
			kattjatek=false;
			katt=false;
		}
		if(xa>x/5*2 & xa<x/5*3 & ya>y/5*3-y/20 & ya<y/5*3-y/20+y/10){
			kattexit=true;
			katt=true;
		}else{
			kattexit=false;
		}
		
		//MENÜEGER////////////////
		if(menü){
		if(xa>x/5-x/250 & xa<x/5-x/250+x/2-x/4+x/125  &  ya>y/5-x/250  &  ya<y/5-x/250+y/2-y/4+x/125){
			valasztas[0]=true;
			katt=true;
		}else{
			valasztas[0]=false;
			katt=false;
		}
		
		if(xa>x/5-x/250+x/2-x/4+x/15 & xa<x/5-x/250+x/2-x/4+x/125+x/2-x/4+x/15  &  ya>y/5-x/250  &  ya<y/5-x/250+y/2-y/4+x/125){
			valasztas[1]=true;
			katt=true;
		}else{
			valasztas[1]=false;
		}
		
		if(xa>x/5-x/250 & xa<x/5-x/250+x/2-x/4+x/125  &  ya>y/5-x/250+x/15+y/2-y/4  &  ya<y/5-x/250+y/2-y/4+x/125+x/15+y/2-y/4){
			valasztas[2]=true;
			katt=true;
		}else{
			valasztas[2]=false;
		}
		

		if(xa>x/5-x/250+x/2-x/4+x/15 & xa<x/5-x/250+x/2-x/4+x/125+x/2-x/4+x/15  &  ya>y/5-x/250+x/15+y/2-y/4  &  ya<y/5-x/250+y/2-y/4+x/125+x/15+y/2-y/4){
			valasztas[3]=true;
			katt=true;
		}else{
			valasztas[3]=false;
		}
		
		////////////////////////////////////
		
		if(egerx>x/5-x/250 & egerx<x/5-x/250+x/2-x/4+x/125  &  egery>y/5-x/250  &  egery<y/5-x/250+y/2-y/4+x/125){
			valasztaskatt[0]=true;
			start=true;
			katt=false;
		}
		
		if(egerx>x/5-x/250+x/2-x/4+x/15 & egerx<x/5-x/250+x/2-x/4+x/125+x/2-x/4+x/15  &  egery>y/5-x/250  &  egery<y/5-x/250+y/2-y/4+x/125){
			valasztaskatt[1]=true;
			start=true;
			katt=false;
		}
		
		if(egerx>x/5-x/250 & egerx<x/5-x/250+x/2-x/4+x/125  &  egery>y/5-x/250+x/15+y/2-y/4  &  egery<y/5-x/250+y/2-y/4+x/125+x/15+y/2-y/4){
			valasztaskatt[2]=true;
			start=true;
			katt=false;
		}
		

		if(egerx>x/5-x/250+x/2-x/4+x/15 & egerx<x/5-x/250+x/2-x/4+x/125+x/2-x/4+x/15  &  egery>y/5-x/250+x/15+y/2-y/4  &  egery<y/5-x/250+y/2-y/4+x/125+x/15+y/2-y/4){
			valasztaskatt[3]=true;
			start=true;
			katt=false;
		}
		
		if(xa>x-x/30&ya<x/30){
			kilépés=true;
			katt=true;
		}else{
			kilépés=false;
			katt=false;
		}
		if(egerx>x-x/40&egery<x/40){
			System.exit(0);
		}
		
		
		}else{
		
		
		//KATT/////////////
		if(egerx>x/5*2 & egerx<x/5*3 & egery>y/5*2-y/20 & egery<y/5*2-y/20+y/10){
			menü=true;
			katt=false;
		}
		
		if(egerx>x/5*2 & egerx<x/5*3 & egery>y/5*3-y/20 & egery<y/5*3-y/20+y/10){
			System.exit(0);
		}
		}
	}
	egerx=0;
	egery=0;
						
					}
				}).start();
	}
	
	
	

	//kijelzés
	
		
		//színek
	
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		//Háttér//////////////////
		g2.drawImage(hatter,0,0,x,y,null);
		
		//IDÕ////////////
		
		if(start){
			if(back){
				g2.drawImage(vissza2, 0,y-y/12, x/6,y/12,null);
			}else{
				g2.drawImage(vissza, 0,y-y/12, x/6,y/12,null);
			}
			if(köv){
				g2.drawImage(következõ2, x-x/6,y-y/12, x/6,y/12,null);
			}else{
				g2.drawImage(következõ, x-x/6,y-y/12, x/6,y/12,null);
			}
			
			if(valasztaskatt[3]){
				g2.drawImage(allatvilag,x/5*4,y/10,x/5-x/100,x/5-x/100,null);
			}
			if(valasztaskatt[1]){
				g2.drawImage(marka,x/5*4,y/10,x/5-x/100,x/5-x/100,null);
			}
			if(valasztaskatt[0]){
				g2.drawImage(youtube,x/5*4,y/10,x/5-x/100,x/5-x/100,null);
			}
			if(valasztaskatt[2]){
				g2.drawImage(kaja,x/5*4,y/10,x/5-x/100,x/5-x/100,null);
			}
			
			g2.setColor(Color.black);
			g2.fillRect(x/100,y/100,x/5*2,y/5*2);
			g2.fillRect(0,y/2,x,y/250);
			if(hiba==0){g2.setColor(Color.white);g2.fillRect(x/100+x/150,y/100+x/150,x/5*2-x/75,y/5*2-x/75);}
			if(hiba==1){g2.drawImage(ak01,x/100+x/150,y/100+x/150,x/5*2-x/75,y/5*2-x/75,null);}
			if(hiba==2){g2.drawImage(ak02,x/100+x/150,y/100+x/150,x/5*2-x/75,y/5*2-x/75,null);}
			if(hiba==3){g2.drawImage(ak03,x/100+x/150,y/100+x/150,x/5*2-x/75,y/5*2-x/75,null);}
			if(hiba==4){g2.drawImage(ak04,x/100+x/150,y/100+x/150,x/5*2-x/75,y/5*2-x/75,null);}
			if(hiba==5){g2.drawImage(ak05,x/100+x/150,y/100+x/150,x/5*2-x/75,y/5*2-x/75,null);}
			if(hiba==6){g2.drawImage(ak06,x/100+x/150,y/100+x/150,x/5*2-x/75,y/5*2-x/75,null);}
			if(hiba==7){g2.drawImage(ak07,x/100+x/150,y/100+x/150,x/5*2-x/75,y/5*2-x/75,null);}
			if(hiba==8){g2.drawImage(ak08,x/100+x/150,y/100+x/150,x/5*2-x/75,y/5*2-x/75,null);}
			if(hiba==9){g2.drawImage(ak09,x/100+x/150,y/100+x/150,x/5*2-x/75,y/5*2-x/75,null);}
			if(hiba==10){g2.drawImage(ak10,x/100+x/150,y/100+x/150,x/5*2-x/75,y/5*2-x/75,null);}
			
			
			if(s<10&min==0){
			g2.setColor(Color.red);
			}else{
			g2.setColor(Color.black);
			}
			g2.drawImage(alap, x/2+x/20-x/10, y/100+y/5, x/7,y/15,null);
			g2.setFont(new Font("Arial", 1, 30));
			g2.drawString(min2+":"+s2+":"+sz2,x/2-x/15+x/20,y/20+y/5);
			g2.drawString(hiba+" / 10",x/6,y/2-y/50);
			
			
		//BETÛHELY///////////////////////////
			for(int i=0; i<cím.length; i++){
				if(valasztaskatt[3]){
					cím[i]=szó[i];
				}
				if(valasztaskatt[1]){
					cím[i]=szó[i+15];
				}
				if(valasztaskatt[0]){
					cím[i]=szó[i+30];
				}
				if(valasztaskatt[2]){
					cím[i]=szó[i+45];
				}
			}	
			hossz=0;
			for(int i=0; i<cím[sorrend[kör]].length(); i++){
			g2.setColor(Color.black);
			g2.setFont(new Font("Arial", 1, y/30));
			g2.drawImage(alap,x/50+i*x/20,y/10*7,x/21,y/21,null);
			
			for(int i2=0; i2<gombok.length; i2=i2+1){
				if(vege|vesztett){
					for(int i3=0; i3<cím[sorrend[kör]].length(); i3=i3+1){
						g2.setColor(Color.red);
					if(gombok[i2].charAt(0)==cím[sorrend[kör]].charAt(i3 )){
						g2.drawString(gombok[i2],x/50+i3*x/20+x/50, y/10*7+y/28);
					}
				}
				}else{
				if(gombkatt[i2]==2){
					for(int i3=0; i3<cím[sorrend[kör]].length(); i3=i3+1){
							g2.setColor(Color.black);
						if(gombok[i2].charAt(0)==cím[sorrend[kör]].charAt(i3)){
							hossz++;
							g2.drawString(gombok[i2],x/50+i3*x/20+x/50, y/10*7+y/28);
						}
					}
					}
			}
			}
			}
		int hossz2=0;
		for(int i=0; i<cím[sorrend[kör]].length(); i++){
			for(int i2=0; i2<gombok.length; i2=i2+1){
		for(int i3=0; i3<cím[sorrend[kör]].length(); i3=i3+1){
		if(gombok[i2].charAt(0)==cím[sorrend[kör]].charAt(i3 )){
			hossz2++;
		}
	}
		}
		}
		if(hossz==hossz2&elsõ){
			gyõzelem=true;
			min=1; s=0; sz=0;
		}
			
		if(gomb==10){
			szam=szam+1;
			gomb=0;
		}
		if(szam+1==(szam+1)/2*2){
		g2.drawString(cím[sorrend[kör]]+" ",0, y/10*9);
		}
		//GOMB///////////////////
		xb=0;int yb=0;
		for(int i1=0; i1<gombok.length; i1=i1+1){
			xb=xb+1;
			if(i1==i1/7*7){
				yb=yb+1;
				xb=0;
			}
				g2.setColor(Color.black);
				g2.setFont(new Font("Arial", 1, y/30));
			if(gombkatt[i1]==0){
				g2.drawImage(betû,  x/5*3+(xb*x/18),  y/2+yb*y/15,  x/20,  y/20,  null);
				g2.drawString(gombok[i1], x/5*3+(xb*x/18)+x/50,  y/2+yb*y/15+y/25);
			}
			if(gombkatt[i1]==1){
				g2.drawImage(betû2,  x/5*3+(xb*x/18),  y/2+yb*y/15,  x/20,  y/20,  null);
				g2.drawString(gombok[i1], x/5*3+(xb*x/18)+x/50,  y/2+yb*y/15+y/25);
			}
			
		}
		if(gyõzelem){
			g2.drawImage(gyalap,x/10,y/10,x/10*8,y/10*8 ,null);
			g2.setColor(Color.green);
			g2.setFont(new Font("Arial", 1, y/8));
			g2.drawString("GYÕZTÉL", x/3, y/5*2);
			if(bköv){
				g2.drawImage(következõ2,x/20*13,y/10*7,x/5,y/10,null);
			}else{
				g2.drawImage(következõ,x/20*13,y/10*7,x/5,y/10,null);
			}
			if(bvissza){
				g2.drawImage(vissza2,x/20*3,y/10*7,x/5,y/10,null);
			}else{
				g2.drawImage(vissza,x/20*3,y/10*7,x/5,y/10,null);
			}
		}
		
		//MENÜ////////////////////
		}else{
			if(menü){
				g2.setFont(new Font("Arial", 1, y/25));
				if(valasztas[0]){
					g2.drawImage(youtube,x/5, y/5,x/2-x/4, y/2-y/4,null);
				}else{
					g2.setColor(Color.black);
					g2.fillRect(x/5-x/250, y/5-x/250, x/2-x/4+x/125, y/2-y/4+x/125);
					Color v = new Color(40,130,60);
					g2.setColor(v);
					g2.fillRect(x/5, y/5,x/2-x/4, y/2-y/4);
					g2.setColor(Color.black);
					g2.drawString("Magyar Youtube",x/6+x/25,y/5+y/8);
				}
				//
				if(valasztas[1]){
					g2.drawImage(marka,x/5+x/2-x/4+x/15, y/5,x/2-x/4, y/2-y/4,null);
				}else{
					g2.setColor(Color.black);
					g2.fillRect(x/5+x/2-x/4+x/15-x/250, y/5-x/250,x/2-x/4+x/125, y/2-y/4+x/125);
					Color v = new Color(40,130,60);
					g2.setColor(v);
					g2.fillRect(x/5+x/2-x/4+x/15, y/5,x/2-x/4, y/2-y/4);
					g2.setColor(Color.black);
					g2.drawString("Márkák-cégek",x/5+x/25+x/2-x/4+x/15,y/5+y/8);
					
				}
				//
				if(valasztas[2]){
					g2.drawImage(kaja,x/5, y/5+x/15+y/2-y/4, x/2-x/4, y/2-y/4,null);
				}else{
					g2.setColor(Color.black);
					g2.fillRect(x/5-x/250, y/5+x/15+y/2-y/4-x/250, x/2-x/4+x/125, y/2-y/4+x/125);
					Color v = new Color(40,130,60);
					g2.setColor(v);
					g2.fillRect(x/5, y/5+x/15+y/2-y/4, x/2-x/4, y/2-y/4);
					g2.setColor(Color.black);
					g2.drawString("Étel-ital",x/5+x/25,y/5+y/8+x/15+y/2-y/4);
				}
				//
				if(valasztas[3]){
					g2.drawImage(allatvilag,x/5+x/2-x/4+x/15, y/5+x/15+y/2-y/4, x/2-x/4, y/2-y/4,null);
				}else{
					g2.setColor(Color.black);
					g2.fillRect(x/5+x/2-x/4+x/15-x/250, y/5+x/15+y/2-y/4-x/250, x/2-x/4+x/125, y/2-y/4+x/125);
					Color v = new Color(40,130,60);
					g2.setColor(v);
					g2.fillRect(x/5+x/2-x/4+x/15, y/5+x/15+y/2-y/4, x/2-x/4, y/2-y/4);
					g2.setColor(Color.black);
					g2.drawString("Állatvilág",x/5+x/25+x/2-x/4+x/15,y/5+y/8+x/15+y/2-y/4);
				}
				
			}else{
			
		//KEZDÉS//////////////
		if(kattjatek){
			g2.drawImage(jatek2, x/2-x/10,y/5*2-y/20,x/5,y/10,null);
		}else{
			g2.drawImage(jatek, x/2-x/10,y/5*2-y/20,x/5,y/10,null);
		}
		if(kattexit){
			g2.drawImage(exit2, x/2-x/10,y/5*3-y/20,x/5,y/10,null);
		}else{
			g2.drawImage(exit, x/2-x/10,y/5*3-y/20,x/5,y/10,null);
		}
		}
		}
		
		if(vesztett|vege){
			ido2=ido2+1;
			min=1; s=0;
			g2.setColor(Color.red);
			g2.setFont(new Font("Arial", 1, y/6));
			g2.drawString("VESZTETTÉL", x/10,y/2);
		}
		
		//kilpés////////
		if(kilépés&menü|start){
			g2.drawImage(exit4,x-x/40,0,x/40,x/40,null);
		}else{
			if(menü|start){
			g2.drawImage(exit3,x-x/40,0,x/40,x/40,null);	
			}
		}
		
		//EGÉR
		if(katt){
		g2.drawImage(ck2,xa,ya,x/50,x/50,null);	
		}else{
		g2.drawImage(ck,xa,ya,x/50,x/50,null);
		}
}
	}
