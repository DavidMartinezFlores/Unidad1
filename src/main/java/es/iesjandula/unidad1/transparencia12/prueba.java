package es.iesjandula.unidad1.transparencia12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * @author David Martinez
 *
 */
public class prueba
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
		File myFile = new File("." + File.separator + "datos.txt");
		FileReader myFileReader=null;
		String total = "";
		try
		{
			myFileReader = new FileReader(myFile);
			char caracter = (char) myFileReader.read();

			while (caracter != (char) -1)
			{
				total += caracter;

				caracter = (char) myFileReader.read();
			}
			System.out.println(total);

		}
		catch (FileNotFoundException exception)
		{
			String error = "Error archivo no encontrado";
			logger.error(error, exception);
			throw new UnidadUnoException(error, exception);
		}
		catch (IOException exception)
		{
			String error = "Error de entrada salida";
			logger.error(error, exception);
			throw new UnidadUnoException(error, exception);
		} 
		finally
		{
			try
			{
				if(myFileReader!=null) 
				{
					myFileReader.close();
				}
				
			} catch (IOException exception)
			{
				String error = "Error de entrada salida";
				logger.error(error, exception);
				throw new UnidadUnoException(error, exception);
			}
		}
	}

}
