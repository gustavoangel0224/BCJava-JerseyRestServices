package com.bcjavajersey1.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/services")//Acceder al servicio
public class Various {

	@GET
	 @Path("/obligame")//Es para acceder al servicio
	public String menjitu() {
		return "Obligame ";
	}
	
	@GET
	@Path("/suma")
	public int numero() {
		return 25;
	}
	
}
