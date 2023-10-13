package es.iesjandula.unidad1.transparencia11;

import java.io.File;
import java.io.IOException;

/**
 * @author David Martinez
 *
 */
public class Tarea4
{
	/**
	 * Method main
	 * @param args
	 */
	public static void main(String[] args)
	{
		/*
		 * Realiza un programa que cree la estructura de directorios y ficheros
		 * siguiente: 
		 * <dir1> contiene solo el fichero f11.doc 
		 * <dir2> contiene solo el fichero f21.txt
		 */
		
		File dir1 = new File("."+File.separator+"dir1");
		File dir2 = new File("."+File.separator+"dir2");
		
		dir1.mkdir();
		dir2.mkdir();
			
		try
		{
			System.out.println(Tarea4.createFile(dir1,"f11.doc"));
			System.out.println(Tarea4.createFile(dir2,"f21.txt"));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Method createFileTwo
	 * @param dir2
	 * @throws IOException
	 */
	public static boolean createFile(File dir,String name) throws IOException
	{
		return new File("."+File.separator+""+dir.getName()+""+File.separator+""+name).createNewFile();
	}

}
