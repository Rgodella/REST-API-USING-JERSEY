package com.Rgodella.RESTAPI;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("studs")
public class studentResources {
	
	stuRepo rep=new stuRepo();
	
	//METHOD TO GET ALL THE DATA ENTRY 
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<students> study() {
		return rep.print();
	}
//	
	//METHOD TO GET A PARTICUILAR COLUMN ENTRY
//	@GET
//	@Produces(MediaType.APPLICATION_XML)
//	public students getRepo() {
//		return rep.getOne(5);
//	}
//	
	
	//METHOD TO INSERT INTO THE TABLE
//	@Path("stu")
//	@PUT
//	@Produces(MediaType.APPLICATION_XML)
//	@Consumes(MediaType.APPLICATION_XML)
//	public void getRepo(students s) {
//		rep.update(s);
//		System.out.println("Successfully updated");
//	}
	
	//METHOD TO INSERT INTO THE TABLE
		@Path("stu")
		@DELETE
		@Produces(MediaType.APPLICATION_XML)
		@Consumes(MediaType.APPLICATION_XML)
		public void deleteRepo(students s) {
			rep.delete(s);
			System.out.println("Successfully updated");
		}
}
