package es.iesjandula.unidad1.transparencia17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.iesjandula.unidad1.transparencia12.UnidadUnoException;

/**
 * @author David Martinez
 *
 */
public class Tarea3
{
	/** Attribute logger */
	private static Logger logger = LogManager.getLogger();

	/**
	 * Method main
	 * 
	 * @param args
	 * @throws UnidadUnoException
	 */
	public static void main(String[] args) throws UnidadUnoException
	{
		/*
		 * Crea un programa que cuente las palabras que hay en un archivo de texto
		 */
		BufferedReader bReader = null;
		try
		{
			bReader = new BufferedReader(new FileReader("datos.txt"));
			String finalCad = "";
			String cadena = bReader.readLine();

			while (cadena != null)
			{
				finalCad += cadena;
				cadena = bReader.readLine();
			}

			/*EJEMPLO DE STRING TOKENIZER*/
			
			int counter1 = 0;
			StringTokenizer st1 = new StringTokenizer(finalCad," ");
			
			while(st1.hasMoreTokens()) 
			{
				String cad = st1.nextToken().toLowerCase();
				if (cad.contains("h") && !cad.endsWith("h") && !cad.startsWith("h") && !cad.contains("ch"))
				{
					counter1++;
				}
			}
			System.out.println("Existen " + counter1 + " Haches intercaladas");
			
			/*EJEMPLO DE STRING TOKENIZER*/
			
			/*EJEMPLO DE String.split*/
			String[] arrayCadenas = finalCad.split(" ");
			int counter2 = 0;

			for (String cad : arrayCadenas)
			{
				cad = cad.toLowerCase();
				if (!cad.isEmpty() && cad.contains("h") && !cad.endsWith("h") && !cad.startsWith("h") && !cad.contains("ch"))
				{
					counter2++;
				}
			}
			System.out.println("Existen " + counter2 + " Haches intercaladas");
			/*EJEMPLO DE String.split*/
			
			
		} 
		catch (FileNotFoundException exep)
		{
			String error = "Error Archivo no encontrado";
			logger.error(error, exep);
			throw new UnidadUnoException(error, exep);
		} 
		catch (IOException exep)
		{
			String error = "Error Entrada salida";
			logger.error(error, exep);
			throw new UnidadUnoException(error, exep);
		} 
		finally
		{
			if (bReader != null)
			{
				try
				{
					bReader.close();
				} 
				catch (IOException exep)
				{
					String error = "Error Entrada salida";
					logger.error(error, exep);
					throw new UnidadUnoException(error, exep);
				}
			}
		}
	}
}
