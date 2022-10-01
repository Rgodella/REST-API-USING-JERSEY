package com.Rgodella.RESTAPI;

import java.awt.PageAttributes.MediaType;
import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.*;

@Path("aliens1")
public class alienResources {
	
	alienRepo repo=new alienRepo();
	@GET
	//@Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
	public List<Aliens> getAlien() {
		return repo.ali();
	}
	
	//ANOTHER METHOD TO ADD THE DATA 
	@POST
	@Path("alien")
	//@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<Aliens> addAlien(Aliens a) {
		repo.addAli(a);
		return repo.ali();
	}
	
	@GET
	@Path("get/{id}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
	public Aliens getAliens(@javax.ws.rs.PathParam("id") int id) {
		return repo.getAli(id);
	}
}
