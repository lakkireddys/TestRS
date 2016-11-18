package com.lakki;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("ftocservice")
public class FtoCService {
	
	@GET
	@Produces("application/json")
	public Response convertFtoC(){
		JSONObject jObj= new JSONObject();
		
		Double fheat= 98.24;
		Double celsius ;
		celsius=(fheat-32)*5/9;
		jObj.put("F value", fheat);
		jObj.put("C Value", celsius);
		
		String result = "@Produces(\"application/json\") Output: \n\nF to C converter Output: \n\n"+jObj;
		return Response.status(200).entity(result).build();
		
	}
	
	@Path("{f}")
	@GET
	@Produces("application/json")
	public Response convertFtoCFromInput(@PathParam("f") float f){
		JSONObject jObj= new JSONObject();
		
		
		float celsius ;
		celsius=(f-32)*5/9;
		jObj.put("F value", f);
		jObj.put("C Value", celsius);
		
		String result = "@Produces(\"application/json\") Output: \n\nF to C converter Output: \n\n"+jObj;
		return Response.status(200).entity(result).build();
		
	}

}
