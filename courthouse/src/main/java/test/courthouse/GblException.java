/**
 * 
 */
package test.courthouse;

import org.mule.api.MuleEvent;
import org.mule.extension.validation.api.ExceptionFactory;
import org.mule.extension.validation.api.ValidationResult;

/**
 * @author kraol
 *
 */
public class GblException implements ExceptionFactory {

	/**
	 * 
	 */
	public GblException() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.mule.extension.validation.api.ExceptionFactory#createException(org.mule.extension.validation.api.ValidationResult, java.lang.Class, org.mule.api.MuleEvent)
	 */
	@Override
	public <T extends Exception> T createException(ValidationResult result, Class<T> exceptionClass, MuleEvent event) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.mule.extension.validation.api.ExceptionFactory#createException(org.mule.extension.validation.api.ValidationResult, java.lang.String, org.mule.api.MuleEvent)
	 */
	@Override
	public Exception createException(ValidationResult result, String exceptionClassName, MuleEvent event) {
		// TODO Auto-generated method stub
		return null;
	}

}
