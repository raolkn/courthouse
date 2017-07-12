package test.courthouse;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

public class JavaDummy implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		MuleMessage msg = eventContext.getMessage();
		Person p = new Person(1,"John Doe");
		msg.setPayload(p);
		return msg;
	}

}
