package uj;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class H26{
	public static void main(String args[]) {
		JFrame ablak = new JFrame();
		ablak.setSize(360, 120);
		ablak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		ablak.setLayout(flo);
		JButton noveles = new JButton("     n�vel�s    ");
		JButton csokkentes = new JButton(" cs�kkent�s ");
		JButton negyzet = new JButton(" a sz�m n�gyzete ");
		final JTextField szam1 = new JTextField(10);
		final JTextField eredmeny = new JTextField(10);
		ablak.add(csokkentes);
		ablak.add(szam1);
		ablak.add(noveles);
		ablak.add(negyzet);
		ablak.add(eredmeny);
		ablak.setVisible(true);
		
		
		String alap = 10 + "";
		szam1.setText(alap);
		
		noveles.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String elso = szam1.getText();
				int egyik = Integer.parseInt(elso);
				
				int szorz = (egyik+1) * (egyik+1) ;
				String szorz2 = szorz+ "";
				eredmeny.setText(szorz2);
				
				int szamlalo = egyik + 1;
				String szamlalo2 = szamlalo + "";
				szam1.setText(szamlalo2);
				
			}	
		});
		
		
		csokkentes.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String elso = szam1.getText();
				int egyik = Integer.parseInt(elso);
				
				int szorz = (egyik-1) * (egyik-1) ;
				String szorz2 = szorz+ "";
				eredmeny.setText(szorz2);
				
				int szamlalo = egyik - 1;
				String szamlalo2 = szamlalo + "";
				szam1.setText(szamlalo2);
				
			}	
		});
		
		JTextField sz�veg;
		JTextField sz�veg2;
	    JPanel panel;
	    JPanel panel2;
		
	    panel=new JPanel();
	    panel.setBounds(0, 0, x/2, y/20);
	    panel2=new JPanel();
	    panel2.setBounds(0, y/20, x/5*2,y/20);
	    add(panel);
	    add(panel2);
	    
	        sz�veg =new JTextField();
	        sz�veg.setBounds(0, 0, x/2+x/150,y/20);
	        panel.add(sz�veg);
	        sz�veg2 =new JTextField();
	        sz�veg2.setBounds(0, 0, x/5*2+x/150,y/20);
	        panel2.add(sz�veg2);
	        String cim = sz�veg2.getText()+"1";
		
		
	}
}