package es.iesjandula.unidad1.transparencia16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.iesjandula.unidad1.transparencia12.UnidadUnoException;

/**
 * @author David Martinez
 *
 */
public class MyScanner
{
	/** Attribute logger */
	private static Logger logger = LogManager.getLogger();
	
	/**
	 * Method main
	 * @param args
	 * @throws UnidadUnoException 
	 */
	public static void main(String[] args) throws UnidadUnoException
	{
		File archivo = new File("datos.txt");
		Scanner scanner = null;
		try
		{
		    scanner = new Scanner(archivo);
			while(scanner.hasNextLine()) 
			{
				System.out.println(scanner.nextLine());
			}
			
		} 
		catch (FileNotFoundException exep)
		{	
			String error = "Error Archivo no encontrado";
			logger.error(error, exep);
			throw new UnidadUnoException(error, exep);
		}
		finally 
		{
			if(scanner!=null) 
			{
				scanner.close();
			}
		}
	}
}
