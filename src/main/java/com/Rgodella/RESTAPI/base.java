package com.Rgodella.RESTAPI;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("ninja")
public class base {

	alienRepo re=new alienRepo();
	@GET
	public List<Aliens> getAlien() {
		return re.ali();
	}
}
