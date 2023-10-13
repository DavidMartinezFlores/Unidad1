package es.iesjandula.unidad1.transparencia11;

import java.io.File;

/**
 * @author David Martinez
 *
 */
public class Tarea1
{
	/**
	 * Method main
	 * @param args
	 */
	public static void main(String[] args)
	{
		/*
		 * Programa que muestre todas las entradas del directorio "c:\\windows" o
		 * “/home/”
		 */
		File entrada = new File("C:" + File.separator + "Windows");

		if (entrada.exists())
		{
			if (entrada.isDirectory())
			{
				File[] list = entrada.listFiles();
				for (File file : list)
				{
					System.out.println(file.getAbsolutePath());
				}
			} else
			{
				System.out.println(entrada.getAbsolutePath());
			}
		}else 
		{
			System.out.println("No existe "+entrada.getAbsolutePath());
		}
	}

}
