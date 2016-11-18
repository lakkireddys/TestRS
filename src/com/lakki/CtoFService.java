package com.lakki;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/ctofservice")
public class CtoFService {
	
	@GET
	@Produces("application/xml")
	public String convertCtoF(){
		
		Double fheat;
		Double celsius =36.8;
		fheat = ((celsius*9)/5)+32;
		String result = "@Produce (\"application/xml\") Output: \n\nC to F Converter Output: \n\n"+ fheat;
		return "<ctofservice>"+"<celsius>"+celsius+"</celsius>"+"<ctofoutput>"+result+"</ctofoutput>"+"</ctofservice>";
		
	}

}
