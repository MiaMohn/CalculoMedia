/*
 * @author Maria Gaio a.k.a. Mia Mohn
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables: 
		
		File f=new File("./notasPepe.txt");	//Fichero a leer
		String line = "";
		int space = 0;
		String note = "";
		float floatNote = 0.0f;
		int nLines = 0;
		float media = 0.0f;
		
		System.out.println(f.getName());	//Muestra el nombre del fichero por la consola
		System.out.println("");
		
		try {
			
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			
			while (line != null)
			{
				line = br.readLine();
				
				if (line != null)
				{
					System.out.println(line);	//Muestra el contenido del fichero
					
					space = line.indexOf(" ");
					note = line.substring(space + 1);
					floatNote += Float.parseFloat(note);
					
					nLines ++;	//Contador de lineas
				}
				
			}
			
			media = floatNote/nLines;
			
			System.out.println("");
			System.out.println("La nota media del alumno es: " + Math.round(media));
			
			br.close();
			fr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			System.out.println("No se ha podido leer el fichero");
			
			e.printStackTrace();
		}
		
	}

}
