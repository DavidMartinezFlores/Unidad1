package es.iesjandula.unidad1;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Tarea2
{

	public static void main(String[] args)
	{
		try
		{
			Calendar calendar = Calendar.getInstance();
			
			File fileOne = new File("C:"+File.separator+"Users"+File.separator+"2DAM"+File.separator+"miFichero.txt");
			File fileTwo = new File("C:"+File.separator+"Users"+File.separator+"2DAM"+File.separator+"test");
			fileTwo.mkdir();
			
			System.out.println(fileOne.canRead());
			System.out.println(fileOne.canWrite());
			System.out.println(fileOne.isFile());
			System.out.println(fileOne.isDirectory());
			System.out.println(fileOne.isAbsolute());
			System.out.println(fileOne.exists());
			
			System.out.println(fileOne.lastModified());
			System.out.println(fileOne.length());
			
			System.out.println(fileOne.getName());
			System.out.println(fileOne.getParent());
			System.out.println(fileOne.getAbsolutePath());
			System.out.println(fileOne.getPath());
			System.out.println(fileOne.renameTo(fileOne));
			
			calendar.setTimeInMillis(fileOne.lastModified());
			System.out.println(calendar.getTime());
			
			calendar.setTimeInMillis(fileTwo.lastModified());
			System.out.println(calendar.getTime());
			
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
