package es.iesjandula.unidad1.transparencia24;

/**
 * @author David Martinez
 *
 */
public class Configuration
{
	/** Attribute source*/
	private String source;

	/** Attribute destine*/
	private String destination;

	/**
	 * Constructor for create new Configuration
	 * @param source
	 * @param destine
	 */
	public Configuration(String source, String destine)
	{
		this.source = source;
		this.destination = destine;
	}
	public Configuration()
	{

	}
	/**
	 * Getter for source
	 * @return the source
	 */
	public String getSource()
	{
		return this.source;
	}
	/**
	 * Setter for source
	 * @param source the source to set
	 */
	public void setSource(String source)
	{
		this.source = source;
	}
	/**
	 * Getter for destine
	 * @return the destine
	 */
	public String getDestination()
	{
		return this.destination;
	}
	/**
	 * Setter for destine
	 * @param destine the destine to set
	 */
	public void setDestination(String destine)
	{
		this.destination = destine;
	}

}
