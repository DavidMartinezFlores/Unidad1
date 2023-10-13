package es.iesjandula.unidad1.transparencia24;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * @author David Martinez Flores 
 * This class is used for parse arguments and check its
 */
public class ParametersParser
{
	/**
	 * Attribute descriptionParameters with the description parameters argument value
	 */
	private Option source;

	/** Attribute classRoomParameters with the classroom parameters value */
	private Option destination;

	/** Attribute commandLine with all Options for parse */
	private CommandLine commandLine;

	/** Attribute logger*/
	private static final Logger logger = LogManager.getLogger();
	
	/**
	 * Constructor for create new ParametersParser
	 * @param isAdmin
	 * @param professorParameters
	 * @param descriptionParameters
	 * @param classRoomParameters
	 * @param helpParameter
	 * @param commandLine
	 */
	public ParametersParser()
	{
		this.destination= new Option("d", "destination",true, "description");
		this.source = new Option("s", "source",true, "description");
		this.commandLine = null;
	}

	/**
	 * Method parse that method parse all the arguments
	 * 
	 * @param cmdArgs the arguments String array
	 * @throws IllegalArgumentException exepction for error on parsing
	 */
	public Configuration parse(String[] cmdArgs) throws UnidadUnoException
	{
		// Create the all Options
		Options allOptions = new Options();

		// Add to the Options
		allOptions.addOption(this.source);
		allOptions.addOption(this.destination);
		//allOptions.addOption(this.helpParameter);

		// Parse to commandLine
		try
		{
			this.commandLine = new DefaultParser().parse(allOptions, cmdArgs);
		} 
		catch (ParseException parseException)
		{
			// Using StringBuilder for String exception msg
			StringBuilder fullError = new StringBuilder();
			fullError.append("Error parsing command line arguments");
			
			logger.error(fullError,parseException);
			
			// trhowing the exception IllegalArgumentException if exist any error with arguments
			throw new UnidadUnoException(fullError.toString(), parseException);
		}

		// Getting parameter values on Strings values
		String sourceParam = this.getCmdStringOption(this.source);
		String destinationParam = this.getCmdStringOption(this.destination);

		// If the option is not null or is not empty, that have anything
		Configuration configuration = new Configuration();
		
		// Checking classRoomParameters
		this.checkSource(sourceParam,configuration);
		this.checkDestine(destinationParam,configuration);

		return configuration;
	}
	
	/**
	 * 
	 * Method checkingDescription for checking the argument
	 * 
	 * @param descriptionParameters with the String value
	 * @param configuration the configuration for reaktor
	 */
	private void checkDestine(String destineParameter,Configuration configuration)
	{
		if (destineParameter != null && !destineParameter.isEmpty())
		{
			configuration.setDestination(destineParameter);
		}

	}

	/**
	 * 
	 * Method checkingClassRoom for checking the argument
	 * 
	 * @param classRoomParameters with the String value
	 * @param configuration the configuration for reaktor
	 */
	private void checkSource(String sourceParameter,Configuration configuration)
	{
		if (sourceParameter != null && !sourceParameter.isEmpty())
		{
			configuration.setSource(sourceParameter);
		}
	}

	/**
	 * Return the String option value from the command line given the representing
	 * option
	 *
	 * @param option with the representing option of the command line
	 * @return the value of the option, null if unsettled
	 */
	private String getCmdStringOption(final Option option)
	{
		String outcome = null;

		if (this.commandLine.hasOption(option.getOpt()))
		{
			outcome = this.commandLine.getOptionValue(option.getOpt()).trim();
		} 
		else if (this.commandLine.hasOption(option.getLongOpt()))
		{
			outcome = this.commandLine.getOptionValue(option.getLongOpt()).trim();
		}

		return outcome;
	}
}
