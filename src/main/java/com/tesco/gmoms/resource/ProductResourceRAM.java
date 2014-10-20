/**
 * 
 */
package com.tesco.gmoms.resource;

import java.util.Vector;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.tesco.gmoms.common.Util;

/**
 * @author asudar
 * 
 */
@Path("/productRAM")
public class ProductResourceRAM {

	private static long holdTime = 1;
	private static long mbSize = 1;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getProductRAM() {
		
		try {
			Vector<byte[]> v = Util.consumeMemory(mbSize);
			System.out.println("Allocated Vector with size = " + v.size());
			Thread.sleep(holdTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ProductResourceRAM.holdTime++;
		ProductResourceRAM.mbSize++;
		
		return Response.status(200).entity("Allocated memory = " + mbSize + " for " + holdTime + "Mse.")
				.type(MediaType.TEXT_PLAIN).build();
	}

}
