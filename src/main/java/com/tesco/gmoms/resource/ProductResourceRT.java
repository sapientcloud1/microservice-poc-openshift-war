package com.tesco.gmoms.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author asudar
 * 
 */
@Path("/productRT")
public class ProductResourceRT {

	private static long holdTime = 1;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getProductRT() {

		try {
			Thread.sleep(holdTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ProductResourceRT.holdTime++;
		
		return Response.status(200).entity("Request Used " + holdTime + "Mse.")
				.type(MediaType.TEXT_PLAIN).build();
	}

}