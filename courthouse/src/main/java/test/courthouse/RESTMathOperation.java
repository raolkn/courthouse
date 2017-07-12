package test.courthouse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jettison.json.JSONObject;;

@Path("")
public class RESTMathOperation {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("Addition")
	public Object addition(JsonNode inputJSON) throws Exception{
		String retVal = "";
		System.out.println("Addition Called.......");
		try
		{
		JSONObject jsonStatus = new JSONObject();
		jsonStatus.put("Result", 
				(Integer.parseInt(inputJSON.get("Num1").getTextValue()) + 
						Integer.parseInt(inputJSON.get("Num2").getTextValue())));
		retVal = jsonStatus.toString();
			System.out.println(retVal);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return retVal; //jsonStatus.toString();
	}


	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("Substraction")
	public Object substraction(JsonNode inputJSON) throws Exception{
		JSONObject jsonStatus = new JSONObject();
		jsonStatus.put("Result", 
				(Integer.parseInt(inputJSON.get("Num1").getTextValue()) - 
						Integer.parseInt(inputJSON.get("Num2").getTextValue())));
		return jsonStatus.toString();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("Multiplication")
	public Object multiplication(JsonNode inputJSON) throws Exception{
		JSONObject jsonStatus = new JSONObject();
		jsonStatus.put("Result", 
				(Integer.parseInt(inputJSON.get("Num1").getTextValue()) * 
						Integer.parseInt(inputJSON.get("Num2").getTextValue())));
		return jsonStatus.toString();
	}
}
