package com.redhat.training;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;

@Path("/tenther")
public class GreetingResource {

    @GET
    @Path("/{number}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("number") Integer number) {
        return String.valueOf( number * 10 ) + "\n";
    }
}