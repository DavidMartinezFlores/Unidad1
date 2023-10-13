package es.iesjandula.unidad1.transparencia11;

import java.io.File;
import java.io.FileFilter;

/**
 * @author David Martinez
 *
 */
public class FileFilterer implements FileFilter
{

	/**
	 * Method accept
	 * @param pathname
	 * @return
	 */
	@Override
	public boolean accept(File pathname)
	{
		return pathname.getName().endsWith(".doc");
	}

}
