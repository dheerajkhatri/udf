package Resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by dheeraj.khatri on 15/06/17.
 */
@Path("/health")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HealthResource {

    @GET
    @Path("/ping")
    public String sayHello() {
        System.out.println("request accepted");
        return "pong";
    }
}
