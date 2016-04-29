package konzolos;

import java.util.Random;

public class Szazalekfuggveny {
	public static void main(String[] args){
		
		float atlag=(float)0;
		int szam=1555;
		Random r = new Random();
		int tombszam=0;
		int osszeg=0;
		int ismetles=1000000;
		int szazalek=50;
		
		for(int a=0; a<ismetles; a=a+1){
			tombszam=0;
		for(int i=0; i<szam; i=i+1){
			tombszam = (int)(r.nextFloat()*100+1);
			if(tombszam>szazalek){	
			}else{
				osszeg=osszeg+1;
			}
			if(tombszam>szazalek){
				i=1000;
			}
			
		}
		}
		atlag=(osszeg*10000f)/(ismetles*10000f)*100;
		System.out.print(""+atlag);
		
		
	}
}
