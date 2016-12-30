package com.cbil.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/restDemo")
public class RestDemo {
	//private String output;
	@GET
	@Path("/getMsg/{name}-{lastName}")
	public Response getMsg(@PathParam("name") String name, @PathParam("lastName") String lastName){
		
		return Response.status(200).entity("WelCome to CBIL: "+ name +" "+ lastName).build();
		
	}

}
