package controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.json.JSONObject;


@Path("/")
public class GetAccountController {

	@GET
	@Path("/noname")
	@Produces("")
	public String getAccount() {
		
		JSONObject json = new JSONObject();
		return "{\"result\":\" hello\"}";	
		}
	
}
