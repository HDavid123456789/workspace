package jatek003;
import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class GrafMenu extends JPanel	{
	public static void main(String arg[]) {
		new GrafMenu();
	}
	Image hatter;
	Image kurzor;
	Image kilepes1;
	Image kilepes2;
	Image jatek1;
	Image jatek2;
	//változók
	int xk=0;
	int yk=0;
	int gomb=0;
	int egerx=0; int egery=0;
	int xa; int ya;
	int x=0;;
	int y[]=new int[300];
	int xi=0;
	int yi=0;
	boolean kjatek =false;
	boolean kexit=false;
	boolean a=false;
	
	public GrafMenu() {
		if(egerx>xk/2-(xk/15)& egerx<xk/2-(xk/15)+xk*10/75& egery>yk/4*3-(yk/15)& egery<yk/4*3-(yk/15)+yk/15)
		{System.exit(0);}
		if(xa>xk/2-(xk/15)& xa<xk/2-(xk/15)+xk*10/75& ya>yk/4*3-(yk/15)& ya<yk/4*3-(yk/15)+yk/15){
			kexit=true;
			}else{
				kexit=false;
				}
		
		if(xa>xk/2-(xk/10)+5& xa<xk/2-(xk/10)+xk/5& ya>yk/2-(yk/10)& ya<yk/2-(yk/10)+yk/10){
			kjatek=true;
			}else{
				kjatek=false;
				}
		if(egerx>xk/2-(xk/10)+5& egerx<xk/2-(xk/10)+xk/5& egery>yk/2-(yk/10)& egery<yk/2-(yk/10)+yk/10)
		{a=true;}
		
		
		}
	}