package es.iesjandula.unidad1.transparencia14_15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.iesjandula.unidad1.transparencia12.UnidadUnoException;

/**
 * @author David Martinez
 *
 */
public class BufferedReaderTest
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
		//File myFile = new File("datos.txt");
		BufferedReader myBufferedReader=null;
		FileReader myFileReader =null;

			try
			{
				myFileReader = new FileReader("datos.txt");
				myBufferedReader = new BufferedReader(new FileReader("datos.txt"));
				
				String cad = myBufferedReader.readLine();
				
				while(cad!=null)
				{
					System.out.println(cad);
					cad=myBufferedReader.readLine();
				}
				
			} 
			catch (FileNotFoundException exception)
			{
				String error = "Error archivo no encontrado";
				logger.error(error, exception);
				throw new UnidadUnoException(error, exception);
				
			} 
			catch (IOException exception)
			{
				String error = "Error entrada salida";
				logger.error(error, exception);
				throw new UnidadUnoException(error, exception);
			}
			finally 
			{
				if(myBufferedReader!=null) 
				{
					try
					{
						myBufferedReader.close();
					} catch (IOException exception)
					{
						String error = "Error entrada salida";
						logger.error(error, exception);
						throw new UnidadUnoException(error, exception);
					}
				}
				if(myFileReader!=null)
				{
					try
					{
						myFileReader.close();
					} catch (IOException exception)
					{
						String error = "Error entrada salida";
						logger.error(error, exception);
						throw new UnidadUnoException(error, exception);
					}
				}
			}
			
//		}else
//		{
//			System.out.println("El fichero no existe");
//		}
	}
}
