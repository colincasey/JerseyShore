package cfc.jerseyshore.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {
    @GET
    public Response sayHello() {
        String output = "hello";
        return Response.ok().entity(output).build();
    }
}
