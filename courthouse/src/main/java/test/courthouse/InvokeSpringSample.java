package test.courthouse;

public class InvokeSpringSample {
	public String methodA()
	{
		System.out.println("Method A - Spring Sample Activated");
		return "Method A";
	}

	public void methodB()
	{
		System.out.println("Method B - Spring Sample Activated");
		
	}

	public String methodC(String inputA, String inputB)
	{
		System.out.println("Method C - Spring Sample Activated");
		return "Method C call with value :" + inputA + " and " + inputB;
	}

}
