package es.iesjandula.unidad1.transparencia11;

import java.io.File;
import java.util.Scanner;

/**
 * @author David Martinez
 *
 */
public class Tarea7
{
	/**
	 * Method deleteFromDirectory
	 * @param scanner
	 * @param dir1
	 */
	public static void deleteFromDirectory(Scanner scanner, File dir)
	{
		if(dir.exists()) 
		{
			System.out.println("---CARPETA-"+dir.getName()+"-ENTONTRADA---");
			for(File file : dir.listFiles()) 
			{
				if(file.isDirectory()) 
				{
					deleteFromDirectory(scanner, file);
				}
				System.out.println("---ENCONTRADO--ARCHIVO---");
				System.out.println("Nombre: "+file.getName());
				System.out.println("Direccion: "+file.getAbsolutePath());
				System.out.println("Carpeta Padre: "+file.getParent());
				System.out.println("Borrar ? Y/N");
				String decission = scanner.next();
				
				if(decission.equals("y") || decission.equals("y")) 
				{
					file.delete();
				}
			}
			System.out.println(dir.getName()+" --- Borrar Carpeta ? Y/N");
			System.out.println("Direccion: "+dir.getAbsolutePath());
			String decission = scanner.next();
			
			if(decission.equals("y") || decission.equals("y")) 
			{
				for(File file : dir.listFiles()) 
				{
					file.delete();
				}
				dir.delete();
			}
		}
		else 
		{
			System.out.println("--CARPETA--"+dir.getName()+" No encontrada");
		}
	}
	/**
	 * Method main
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		File dir1 = new File("."+File.separator+"dir1");
		File dir2 = new File("."+File.separator+"dir2");
		
		deleteFromDirectory(scanner, dir1);
		deleteFromDirectory(scanner, dir2);
		
	}

	
}
