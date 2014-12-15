package com.tesco.gmoms.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tesco.gmoms.pojo.Product;


@Path("/product/{productId}")
public class ProductService {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
    public Product getProduct( @PathParam("productId") final String productId ) {
		
		return ProductService.getDummyProduct();
	}
	
	
	public static Product getDummyProduct() {

		int randomNum = 1 + (int) (Math.random() * 1000);

		Product p = new Product();

		p.setpDesc("DESC" + randomNum);
		p.setpName("NAME" + randomNum);
		p.setProductId(randomNum);
		p.setpSkuId("SKUID" + randomNum);

		return p;
	}
}
