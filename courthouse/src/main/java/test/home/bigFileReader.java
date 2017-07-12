package test.home;

import org.mule.DefaultMuleMessage;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.api.lifecycle.Callable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public  class bigFileReader implements Callable {
	
	
	@SuppressWarnings("deprecation")
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
	
		String FILENAME = "C:\\Mulesoft\\In\\In4\\StrMessage1.csv";
		/*
		MuleMessage msg = eventContext.getMessage();
		Person p = new Person(1,"John Doe");
		msg.setPayload(p);
		return msg;
		*/
		
		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine = null;
			MuleMessage muleMsg;
			br = new BufferedReader(new FileReader(FILENAME));

			 MuleClient muleClient = eventContext.getMuleContext().getClient();
			 
			 
		        String line;
		        while ((sCurrentLine = br.readLine()) != null) {
		        	muleMsg = new DefaultMuleMessage(sCurrentLine,eventContext.getMuleContext());
					    	
		            muleClient.dispatch("vm://BigFileRow", muleMsg);
		            System.out.println("java: " + sCurrentLine);
		        }

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		return "Success";
	}
}
