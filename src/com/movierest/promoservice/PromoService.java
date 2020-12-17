package com.movierest.promoservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.movieapp.PromoManager;

@Path("/PromoService") 

public class PromoService {

	@POST
    @Path("/allpromotions")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
       
     public PromoManager getAllPromo(String allmovies) {
         PromoManager promoManager = new PromoManager();
         promoManager.getAllPromo();
		 
         return promoManager;
    }

}
