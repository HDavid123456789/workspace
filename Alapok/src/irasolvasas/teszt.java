package irasolvasas;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
class teszt
{
    static ArrayList<String> lista = new ArrayList<String>();
    private static void masodik()
    {		
	System.out.println("M�sodik feladat");
	File f = new File("lista.txt");
	Scanner fs = null;
	try{
		fs = new Scanner(f);
		while(fs.hasNext())
			lista.add(fs.nextLine());
		fs.close();
	}catch(FileNotFoundException e){
		System.err.println("Hiba a f�jl megnyit�sa sor�n");
	}
    }
 
    public static void main(String[] args)
    {
	masodik();			
    }
}