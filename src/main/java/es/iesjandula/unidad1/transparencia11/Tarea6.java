package es.iesjandula.unidad1.transparencia11;

import java.io.File;

/**
 * @author David Martinez
 *
 */
public class Tarea6
{
	/**
	 * Method listadoRecursivo
	 * @param entrada
	 */
	public static void listadoRecursivo(File entrada)
	{
		//FILE NAME FILTER
		if (entrada.isFile() && new FileNameFilter().accept(entrada, ".doc"))
		{
			System.out.println(entrada.getAbsolutePath());
		} 
		else if (entrada.isDirectory())
		{

			if (entrada.listFiles() != null && entrada.listFiles().length > 0)
			{
				
				for (File file : entrada.listFiles())
				{
					listadoRecursivo(file);
				}
			} 
		}
	}

	/**
	 * Method listadoRecursivo2
	 * @param entrada
	 */
	public static void listadoRecursivo2(File entrada)
	{
		//FILE FILTER
		if (entrada.isFile() && new FileFilterer().accept(entrada))
		{
			System.out.println(entrada.getAbsolutePath());
		} 
		else if (entrada.isDirectory())
		{

			if (entrada.listFiles() != null && entrada.listFiles().length > 0)
			{
				
				for (File file : entrada.listFiles())
				{
					listadoRecursivo(file);
				}
			} 
		}
	}

	/**
	 * Method main
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		/*
		 * Usa las interfaces FileFilter o FilenameFilter para listar sólo aquellos
		 * ficheros con extensión “.doc”
		 */
		File dir = new File(".");
		
		System.out.println("----FileNameFilter----");
		listadoRecursivo(dir);
		
		System.out.println("----FileFilter----");
		listadoRecursivo2(dir);
	}

}
