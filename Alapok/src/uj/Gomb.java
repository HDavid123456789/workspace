package uj;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextField;

	public class Gomb extends JFrame{
		int gomb;
		public static void main(String arg[]) {
			new Gomb();
		}
		public Gomb() {
			
			setSize(300, 200);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setUndecorated(false);
			setResizable(true);
			setVisible(true);
			
	addKeyListener(new KeyListener() {
		public void keyTyped(KeyEvent e) {
		}
		public void keyReleased(KeyEvent e) {
		}
		public void keyPressed(KeyEvent e) {
			gomb=e.getKeyChar();
			System.out.println(gomb);
		}
	});
	
	addMouseListener (new MouseListener(){
		public void mouseExited(MouseEvent e) {
	 
		}
		public void mouseEntered(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent e) {
		}
		public void mousePressed(MouseEvent e) {
			System.out.println(""+e.getButton());
		}
		public void mouseClicked(MouseEvent e) {
		}
		});
	
}
	}
