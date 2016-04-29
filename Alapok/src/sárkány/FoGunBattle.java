package sárkány;

import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Toolkit;

public class FoGunBattle extends JFrame{
	boolean fullscreen=true;
	boolean valtas=true;
	
	public static void main(String arg[]) {			 
		new FoGunBattle();
	}
	
	
	
	public FoGunBattle (){
		Toolkit tk=Toolkit.getDefaultToolkit();
		int x=(int) tk.getScreenSize().getWidth();
		int y =(int)tk.getScreenSize().getHeight();
		this.setSize(x, y);
		GrafGunBattle t = new GrafGunBattle();
		add(t);
		if(fullscreen){
		setUndecorated(true);
		setResizable(false);
		setVisible(true);
	}else{
		setUndecorated(false);
		setVisible(true);
		setResizable(false);
	}
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//billentyûzet érték beolvasása
		
		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
			}
			public void keyReleased(KeyEvent e) {
				t.gombelenged=e.getKeyCode();
			}
			public void keyPressed(KeyEvent e){
				t.gomb=e.getKeyCode();
				if(e.getKeyCode()==122){
					valtas=false;
					if(fullscreen){
						fullscreen=false;
					}else{
						fullscreen=true;
					}
				}
				if(e.getKeyCode()>122 & e.getKeyCode()<122){
					valtas=true;
				}
			}
		});
		
		
		
		addMouseListener (new MouseListener(){
	public void mouseExited(MouseEvent e) {
 
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
		t.egerf=1;
	}
	public void mousePressed(MouseEvent e) {
		t.xeger=e.getX();
		t.yeger=e.getY();
	}
	public void mouseClicked(MouseEvent e) {
	}
	});
		t.x=x;
		t.y=y;
	}
}