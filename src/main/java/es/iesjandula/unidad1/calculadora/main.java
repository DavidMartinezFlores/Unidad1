package es.iesjandula.unidad1.calculadora;

/**
 * @author David Martinez
 *
 */
public class main
{
	/**
	 * Method main
	 * @param args
	 */
	public static void main(String[] args)
	{
		ICalculadora icalc = new ICalculadora() 
		{
			@Override
			public int suma(int a, int b)
			{
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int resta(int a, int b)
			{
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		ICalculadora calculadora = new Calculadora();
	
		System.out.println(
				calculadora.suma(1, 2)+" "
				+calculadora.resta(10, 5));
	}
}
