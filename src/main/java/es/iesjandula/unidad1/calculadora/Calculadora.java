package es.iesjandula.unidad1.calculadora;

/**
 * @author David Martinez
 *
 */
public class Calculadora implements ICalculadora
{

	/**
	 * Method suma
	 * @param a
	 * @param b
	 * @return
	 */
	@Override
	public int suma(int a, int b)
	{
		return a+b;
	}

	/**
	 * Method resta
	 * @param a
	 * @param b
	 * @return
	 */
	@Override
	public int resta(int a, int b)
	{
		return a-b;
	}

}
