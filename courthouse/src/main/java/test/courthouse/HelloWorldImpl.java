package test.courthouse;


import javax.jws.WebService;

@WebService(endpointInterface = "test.courthouse.HelloWorld",
            serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}