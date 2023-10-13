package es.iesjandula.unidad1.transparencia24;

/**
 * @author David Martinez
 *
 */
public class Launcher
{
	/**
	 * Method main
	 * @param args
	 * @throws UnidadUnoException
	 */
	public static void main(String[] args) throws UnidadUnoException
	{
		ParametersParser parse = new ParametersParser();
		Configuration configuration = parse.parse(args);
		
		CopyFiles copyFiles = new CopyFiles(configuration);
		copyFiles.reconfigureFiles();
	}
}
