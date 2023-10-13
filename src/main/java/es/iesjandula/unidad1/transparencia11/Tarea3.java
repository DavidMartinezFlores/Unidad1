package es.iesjandula.unidad1.transparencia11;

import java.io.File;

/**
 * @author David Martinez
 *
 */
public class Tarea3
{
	/**
	 * Method listadoRecursivo
	 * @param entrada
	 * @param iterator
	 */
	public static void listadoRecursivo(File entrada, int iterator)
	{
		/*
		 * Hacer un programa que liste el contenido del directorio actual y de los 
		 * directorios que cuelgan de él, mostrando nombre y tipo de cada fichero o directorio
		 */
		if (iterator <= 2)
		{
			if (!entrada.exists())
			{
				System.out.println(entrada.getName() + " No encontrado");
			} 
			else if (entrada.isFile())
			{
				System.out.println(entrada.getAbsolutePath());
			} 
			else if (entrada.isDirectory())
			{
				System.out.println("Directorio: "+entrada.getAbsolutePath());
				
				if (entrada.listFiles() != null && entrada.listFiles().length > 0)
				{
					iterator++;
					for (File file : entrada.listFiles())
					{
						listadoRecursivo(file,iterator);
					}
				} 
				else
				{
					System.out.println("Archivo: "+entrada.getAbsolutePath()+" Carpeta vacia");
				}
			}
		}
	}

	/**
	 * Method main
	 * @param args
	 */
	public static void main(String[] args)
	{
		File entrada = new File("C:" + File.separator + "Users");
		listadoRecursivo(entrada,0);
	}

}
