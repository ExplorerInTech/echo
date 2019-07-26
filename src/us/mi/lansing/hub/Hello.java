package us.mi.lansing.hub;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/echo")
public class Hello {
	
	@GET
    public String sayHello() {
        return "Hello";
    }

}