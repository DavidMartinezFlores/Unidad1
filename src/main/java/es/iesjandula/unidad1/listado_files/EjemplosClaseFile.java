package es.iesjandula.unidad1.listado_files;

import java.io.File;

public class EjemplosClaseFile
{
	public static void listadoRecursivo(File entrada) 
	{
		if(!entrada.exists()) 
		{
			System.out.println(entrada.getName()+" No encontrado");
		}
		else if(entrada.isFile()) 
		{
			System.out.println(entrada.getAbsolutePath());
		}
		else if(entrada.isDirectory()) 
		{
			File[] files = entrada.listFiles();
			
			
			if(files!=null && files.length>0) 
			{
				for(File file : files) 
				{
					listadoRecursivo(file);
				}
			}else {
				
				System.out.println(entrada.getAbsolutePath()+" Carpeta vacia");
			}
		}
	}
	
	public static void main(String[] args)
	{
		File entrada = new File("C:"+File.separator+"Users"+File.separator+"2DAM");
		
		listadoRecursivo(entrada);
	}

}
