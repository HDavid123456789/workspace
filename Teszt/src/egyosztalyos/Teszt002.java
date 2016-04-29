package egyosztalyos;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class Teszt002 extends Dialog implements ComponentListener {
  Label l;
  public Alert (Frame f, String s) {
    super(f, true);
    l = new Label(s);
    this.add("Center", l);
    this.addComponentListener(this);
    this.setSize(300,100);
    this.setLocation(100, 100);
  }  
  public void componentResized(ComponentEvent ce){}
  public void componentShown(ComponentEvent ce){}
  public void componentHidden(ComponentEvent ce){}
  public void componentMoved(ComponentEvent ce){
    Point p = this.getLocation();
    l.setText("Pozicio - x = " + p.x + " y = " + p.y);    
  }
}

public class CompListEx extends Frame {

  CompListEx(String s) {
    super(s);
  }
  
  public static void main(String args[]) {
    CompListEx ae = new CompListEx("Szülõablak");
    ae.setSize(300,300);
    ae.setLocation(0,0);
    ae.show();
    Alert a = new 
      Alert(ae, "Pozició - x = 50  y = 50");
    a.setLocation(50,50);
    a.show();
  }
}