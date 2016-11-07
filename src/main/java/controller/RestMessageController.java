package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Ali on 7.11.2016.
 */
@Path("/messages")
public class RestMessageController {
    @GET
    @Path("/message")
    public String getMessage() {
        String message = "Welcome to Rest Tutorial";
        return message;
    }
}
