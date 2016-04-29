package game01;

import javax.swing.JPanel;
public class Elvalaszto extends JPanel	{
	private static final long serialVersionUID = 1L;
	int x; int y;
	int xa; int ya;
	int egerx; int egery;
	int gorgo;
	int gomb;
	boolean menu=true;
	boolean jatek=false;
	public Elvalaszto() {
		new Thread(new Runnable() { 
					public void run() {
						while (true) {
							if (getWidth() != 0){
								
								
								if(menu){
									Menu t=new Menu();
									add(t);
									t.x=x; t.y=y;
									t.x=xa; t.ya=ya;
									t.egerx=egerx; t.egery=egery;
									t.gorgo=gorgo;
									t.gomb=gomb;
								}
								
								
							}
							repaint(); 
							try {
								Thread.sleep(1); 
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				
		}).start();
	}
}
