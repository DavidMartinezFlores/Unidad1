package es.iesjandula.unidad1.transparencia24;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author David Martinez
 *
 */
public class CopyFiles
{
	/** Attribute configuration */
	private Configuration configuration;

	/** Attribute logger */
	private static final Logger logger = LogManager.getLogger();

	/**
	 * Constructor for create new CopyFiles
	 * 
	 * @param configuration
	 */
	public CopyFiles(Configuration configuration)
	{
		this.configuration = configuration;
	}

	/**
	 * Method reconfigureFiLes
	 * 
	 * @throws UnidadUnoException
	 */
	public void reconfigureFiles() throws UnidadUnoException
	{
		FileReader fileReader = null;
		FileWriter writeFile = null;
		try
		{
			fileReader = new FileReader(this.configuration.getSource());
			writeFile = new FileWriter(this.configuration.getDestination());

			char caracter = (char) fileReader.read();

			while (caracter != (char) -1)
			{
				writeFile.write(caracter);
				caracter = (char) fileReader.read();
			}

		} 
		catch (FileNotFoundException exception)
		{
			String str = "Fichero no encontrado";
			logger.error(str, exception);
			throw new UnidadUnoException(str, exception);

		} 
		catch (IOException exception)
		{
			String str = "Error entrada salida";
			logger.error(str, exception);
			throw new UnidadUnoException(str, exception);

		} 
		finally
		{
			if (writeFile != null)
			{
				try
				{
					writeFile.flush();
					writeFile.close();
				} catch (IOException exception)
				{
					String str = "Error entrada salida";
					logger.error(str, exception);
					throw new UnidadUnoException(str, exception);
				}
			}
			if (fileReader != null)
			{
				try
				{
					fileReader.close();
				} catch (IOException exception)
				{
					String str = "Error Entrada Salida";
					logger.error(str, exception);
					throw new UnidadUnoException(str, exception);
				}
			}
		}
	}
}
