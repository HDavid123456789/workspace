package egyosztalyos;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Teszt001 extends Applet implements MouseListener {
	int t=0;

  Vector theDots = new Vector();

  public void init() {
    this.addMouseListener(this);
  }

  public void mouseClicked(MouseEvent e) {
   theDots.addElement(e.getPoint());
   this.repaint();
  }
 
  // Ezeket a metódusokat implementálnia kell, 
  // bár nem kell semmit csinálniuk
  public void mousePressed(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}
  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}

  // a pontok kirajzolása
  public void paint(Graphics g) {
	  Graphics2D g2 = (Graphics2D) g;
	  
    g.setColor(Color.red);
    for(int i=0; i<theDots.size(); i++) {
      Point p =  (Point) theDots.elementAt(i);
      if(p.x>0){
    	 t=1;
    	 p.x=0;
      }
      System.out.print(t);
      t=0;
    }
  }
}