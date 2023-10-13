package es.iesjandula.unidad1.transparencia19;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author David Martinez
 *
 */
public class Trasparencia19
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
		String[] nombres ={"ana", "rosa", "jorge", "manuel"};

		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		try
		{
			fileWriter = new FileWriter("datos2.txt");

			printWriter = new PrintWriter(fileWriter);

			for (int i = 0; i < nombres.length; i++)
			{
				printWriter.println(nombres[i]);
			}
			printWriter.flush();
		} 
		catch (IOException exception)
		{
			String error = "Error de entrada salida";
			logger.error(error, exception);
			throw new UnidadUnoException(error, exception);
		} 
		finally
		{
			if (printWriter != null)
			{
				printWriter.close();
			}

			if (fileWriter != null)
			{
				try
				{
					fileWriter.close();
				} 
				catch (IOException exception)
				{
					String error = "Error de entrada salida";
					logger.error(error, exception);
					throw new UnidadUnoException(error, exception);
				}
			}
		}
	}
}
