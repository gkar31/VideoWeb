package org.buddha.actions;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.buddha.business.Film;
import org.buddha.dao.FilmDao;
import org.json.JSONArray;
import org.json.JSONObject;


public class MoviesAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		JSONArray jarray=new JSONArray();
		JSONObject json=new JSONObject();
		System.out.println("------------------------");
		System.out.println("----- MoviesAction -----");
		System.out.println("------------------------");

		
		
		FilmDao dao=new FilmDao();
		List<Film> films=dao.findAll();
		
		System.err.println("Films :"+films.toString());
		
		Iterator<Film> it=films.iterator();
		JSONObject jfilms=new JSONObject();
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
		 
		 
		 //return mapping.findForward("success");
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(jarray);
        out.flush();
        
        return null;
	}
}
