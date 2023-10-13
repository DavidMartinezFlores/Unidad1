package es.iesjandula.unidad1.transparencia11;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author David Martinez
 *
 */
public class FileNameFilter implements FilenameFilter
{

	/**
	 * Method accept
	 * @param file
	 * @param name
	 * @return
	 */
	@Override
	public boolean accept(File file, String name)
	{	
		return file.getName().endsWith(name);
	}

}
