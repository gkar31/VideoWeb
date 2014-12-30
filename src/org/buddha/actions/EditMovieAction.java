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
import org.buddha.formbeans.MovieForm;
import org.json.JSONArray;
import org.json.JSONObject;


public class EditMovieAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		JSONArray jarray=new JSONArray();
		JSONObject json=new JSONObject();
		System.out.println("------------------------");
		System.out.println("----- EditMoviesAction -----");
		System.out.println("------------------------");

		
		
		FilmDao dao=new FilmDao();
		MovieForm frm=(MovieForm) form;
		
		
		System.err.println("Film à mettre a jour 1 :\n"+frm);
		Film fobj=new Film();
		
		fobj.setFilmId(frm.getFilmId());
		fobj.setTitle(new String(frm.getTitle().getBytes(),"UTF-8"));
		fobj.setActors(frm.getActors());
		fobj.setCategories(frm.getCategories());
		fobj.setDuration(frm.getDuration());
		fobj.setIs3D(frm.getIs3D());
		fobj.setPictureUrl(frm.getPictureUrl());
		fobj.setDirector(frm.getProductor());
		fobj.setSummary(new String(frm.getSummary().getBytes(),"UTF-8"));
		fobj.setIs3D("true".equalsIgnoreCase(frm.getIs3D())?"O":"N");
		
		System.err.println("Film à mettre a jour 2 :\n"+fobj);
		
		
		//int result=0;
		int result=dao.update(fobj);
		
		JSONObject jf=new JSONObject();
		
		if (result==0)
		{
			
			jf.put("result", result);
			jf.put("message", "Film mis à jour avec success.");
		}else
		{
			jf.put("result",result);
			jf.put("message", "Erreur lors de la mise à jour du film.");
		}
		
		
		
		
			
		
		
		
		 
		 
		 //return mapping.findForward("success");
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(jf);
        out.flush();
        
        return null;
	}
}
