package es.iesjandula.unidad1.transparencia17;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * @author David Martinez
 *
 */
public class Tarea1
{
	/** Attribute logger*/
	private static Logger logger = LogManager.getLogger();
	
	/**
	 * Method main
	 * @param args
	 * @throws UnidadUnoException 
	 */
	public static void main(String[] args) throws UnidadUnoException
	{
	/*
	 * Escribe un programa que lea un fichero de 
	 * texto con varias líneas y cuente cuántas vocales hay de cada tipo (a,e,i,o,u)	
	 */
		Map<Character,Integer> mapaVocales = new HashMap<Character,Integer>();
		mapaVocales.put('a', 0);
		mapaVocales.put('e', 0);
		mapaVocales.put('i', 0);
		mapaVocales.put('o', 0);
		mapaVocales.put('u', 0);
		
		String uri  = "datos.txt";
		FileReader reader=null;
		try
		{
			reader = new FileReader(uri);
			char caracter = (char)reader.read();
			
			while(caracter!=(char)-1) 
			{
				if(mapaVocales.containsKey(Character.toLowerCase(caracter))) 
				{
					mapaVocales.put(Character.toLowerCase(caracter), mapaVocales.get(Character.toLowerCase(caracter))+1);
				}
				caracter = (char)reader.read();
			}
			
			System.out.println(mapaVocales.toString());
			
		} 
		catch (FileNotFoundException exception)
		{
			String error="archivo no encontrado ";
			logger.error(error,uri,exception);
			throw new UnidadUnoException(error,exception);
			
		}
		catch(IOException exception) 
		{
			String error="Error entrada salida ";
			logger.error(error,exception);
			throw new UnidadUnoException(error,exception);
		}
		finally 
		{
			try
			{
				if(reader!=null)
				{
					reader.close();
				}
			} 
			catch (IOException exception)
			{
				String error="Error entrada salida ";
				logger.error(error,exception);
				throw new UnidadUnoException(error,exception);
			}
		}
		
	}
}
