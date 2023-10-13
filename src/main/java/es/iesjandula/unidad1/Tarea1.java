package es.iesjandula.unidad1;

import java.io.File;
import java.io.IOException;

public class Tarea1
{

	public static void main(String[] args)
	{
		try
		{
			boolean archivo = new File("C:"+File.separator+"Users"+File.separator+"2DAM"+File.separator+"miFichero.txt").createNewFile();
			boolean archivo2 = new File("C:"+File.separator+"Users"+File.separator+"2DAM"+File.separator+"miCarpeta"+File.separator+"miSubCarpeta").mkdir();
			boolean archivo3 = new File("C:"+File.separator+"Users"+File.separator+"2DAM"+File.separator+"miCarpeta"+File.separator+"miSubCarpeta").mkdirs();
			
			System.out.println(archivo);
			System.out.println(archivo2);
			System.out.println(archivo3);
			
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
