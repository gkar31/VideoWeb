package org.buddha.formbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.struts.action.ActionForm;

public class MovieForm extends ActionForm implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6428120076616168987L;
	
	private String title="";
	
	
	


	private List<MovieForm> books;





	public List<MovieForm> getBooks() {
		return books;
	}





	public void setBooks(List<MovieForm> books) {
		this.books = books;
	}
	
	
}
