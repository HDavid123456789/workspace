package kep;
import java.awt.*;
import java.awt.Graphics;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Kep extends JFrame{
	private JLabel lbl;
	private ImageIcon image;
	
	public Kep(){
		image = new ImageIcon (getClass().getResource("hero003.png"));
		lbl = new JLabel (image);
		add(lbl);
	}
	public static void main (String[]arg){
		Kep a = new Kep();
		a.setTitle("kép");
		a.setVisible(true);
		a.pack();
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}