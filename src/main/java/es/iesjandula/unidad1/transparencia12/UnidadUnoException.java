package es.iesjandula.unidad1.transparencia12;

/**
 * @author David Martinez
 *
 */
public class UnidadUnoException extends Exception
{
	/**
	 * Constructor for create new UnidadUnoException
	 * @param error
	 * @param exep
	 */
	public UnidadUnoException(String error,Exception exep) 
	{
		super(error,exep);
	}
}
