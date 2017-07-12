package test.courthouse;

import java.util.Date;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class javaEmployeeTransformer  extends AbstractMessageTransformer{
    @Override
    public Object transformMessage(MuleMessage message, String outputEncoding)
            throws TransformerException {
        // TODO Auto-generated method stub
        try{
            if(message!=null)
            {
                Employee s = (Employee)message.getPayload(); 
        System.out.println(new Date()+s.getName());
            }
            else
                System.out.println("NYLL");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    // modify data
        Employee x = new Employee();
        x.setName("Mr.Nthung");
        x.setID(23);
        x.setActive("Y");
        return x;
        //return null;
    }
}