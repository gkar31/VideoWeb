package org.buddha.rest;


import java.util.Iterator;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.buddha.business.Film;
import org.buddha.dao.FilmDao;
import org.json.JSONArray;
import org.json.JSONObject;

// Plain old Java Object it does not extend as class or implements 
// an interface

// The class registers its methods for the HTTP GET request using the @GET annotation. 
// Using the @Produces annotation, it defines that it can deliver several MIME types,
// text, XML and HTML. 

// The browser requests per default the HTML MIME type.

//Sets the path to base URL + /hello
@Path("/movie")
public class Movies {
	
	

	  // This method is called if TEXT_PLAIN is request
	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String sayPlainTextHello() {
		  FilmDao dao=new FilmDao();
			List<Film> films=dao.findAll();
			
			System.err.println("Films :"+films.toString());
			
			Iterator<Film> it=films.iterator();
			JSONObject jfilms=new JSONObject();
			JSONArray jarray=new JSONArray();
			while (it.hasNext())
			{
				Film f=it.next();
				//System.err.println("Film :"+f);
				JSONObject jf=new JSONObject(f);
				jfilms.accumulate("films", jf);
				jarray.put(jf);
				
			}
			
			System.err.println("Nb Films en base :"+films.size());
			System.err.println("JSON Films :"+jfilms.toString());
			System.err.println("JSON ARRAY Films :"+jarray.toString());
			 
		  
	    return jarray.toString();
	  }

	  // This method is called if XML is request
	  @GET
	  @Produces(MediaType.TEXT_XML)
	  public String sayXMLHello() {
	    //return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
		  return sayPlainTextHello();
	  }

	  // This method is called if HTML is request
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public String sayHtmlHello() {
	    //return "<html> " + "<title>" + "Hello Jersey" + "</title>"
	    //    + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
		  
		  return sayPlainTextHello();
	  }

	
}
