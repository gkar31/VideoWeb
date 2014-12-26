package org.buddha.actions;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import or.buddha.dao.FilmDao;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.buddha.business.Film;
import org.buddha.formbeans.MovieForm;
import org.json.JSONArray;
import org.json.JSONObject;


public class AddMovieAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		JSONArray jarray=new JSONArray();
		JSONObject json=new JSONObject();
		System.out.println("------------------------");
		System.out.println("----- AddMoviesAction -----");
		System.out.println("------------------------");

		
		
		FilmDao dao=new FilmDao();
		MovieForm frm=(MovieForm) form;
		
		
		System.err.println("Film à sauvegarder :\n"+frm);
		Film fobj=new Film();
		
		fobj.setTitle(frm.getTitle());
		fobj.setActors(frm.getActors());
		fobj.setCategories(frm.getCategories());
		fobj.setDuration(frm.getDuration());
		fobj.setIs3D(frm.getIs3D());
		fobj.setPictureUrl(frm.getPictureUrl());
		fobj.setProductor(frm.getProductor());
		fobj.setSummary(frm.getSummary());
		
		
		int result=dao.save(fobj);
		
		JSONObject jf=new JSONObject();
		
		if (result==0)
		{
			
			jf.put("result", result);
			jf.put("message", "Film enregistre en Base.");
		}else
		{
			jf.put("result",result);
			jf.put("message", "Erreur lors de l'enregistrement du film.");
		}
		
		
		
		
			
		
		
		
		 
		 
		 //return mapping.findForward("success");
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(jf);
        out.flush();
        
        return null;
	}
}
