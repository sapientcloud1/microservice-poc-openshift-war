package com.tesco.gmoms.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author asudar
 * 
 */
@Path("/productRTMS")
public class ProductResourceRTMS {
	
	@GET
	@Path("/{holdTime}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getProductRT(@PathParam("holdTime") long holdTime) {

		try {
			Thread.sleep(holdTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return Response.status(200).entity("Request Used " + holdTime + "Mse.")
				.type(MediaType.TEXT_PLAIN).build();
	}

}