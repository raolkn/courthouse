/**
 * 
 */
package test.courthouse;

import org.mule.api.MuleEvent;
import org.mule.extension.validation.api.ValidationResult;
import org.mule.extension.validation.api.Validator;

/**
 * @author kraol
 *
 */
public class CustException implements Validator {

	/**
	 * 
	 */
	public CustException() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.mule.extension.validation.api.Validator#validate(org.mule.api.MuleEvent)
	 */
	@Override
	public ValidationResult validate(MuleEvent event) {
		// TODO Auto-generated method stub
		return null;
	}

}
