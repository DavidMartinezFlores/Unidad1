package es.iesjandula.unidad1.transparencia11;

import java.io.File;

/**
 * @author David Martinez
 *
 */
public class Tarea5
{
	/*
	 * Cambia despues el nombre de f11.doc por f12.doc, mueve el fichero f21.txt al
	 * directorio d1 y eliminando después el directorio d2
	 */
	
	/**
	 * Method main
	 * @param args
	 */
	public static void main(String[] args)
	{
		File dir1 = new File("."+File.separator+"dir1");
		File dir2 = new File("."+File.separator+"dir2");
		
		File fileOne = new File(dir1.getAbsolutePath()+File.separator+"f11.doc");
		File fileTwo = new File(dir2.getAbsolutePath()+File.separator+"f21.txt");
		
		if(fileOne.exists()) 
		{
			fileOne.renameTo(new File(dir1.getAbsolutePath()+File.separator+"f12.doc"));
		}
		
		if(fileTwo.exists()) 
		{
			fileTwo.renameTo(new File(dir1.getAbsolutePath()+File.separator+"f21.txt"));
			dir2.delete();
		}
		
	}
}
