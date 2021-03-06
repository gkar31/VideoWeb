package org.buddha.dao;

import java.util.ArrayList;
import java.util.List;

import org.buddha.business.Film;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FilmDao extends VideoDbDaoAbstract {

	public FilmDao() {
		super();
		
	}
	
	
	@SuppressWarnings({ "unchecked", "finally" })
	public List<Film> findAll()
	{
		List<Film> result=new ArrayList<Film>();
		Session session=null;
		
		try
		{
			session = getSessionFactory().openSession();
			//Criteria criteria=session.createCriteria(Film.class);
			
			Transaction tx=session.beginTransaction();
			Query qry=session.createQuery("from Film");
		
			result=  qry.list();
			
		tx.commit();
		}catch(Exception e)
		{
			System.err.println(e.getMessage());
		}finally{
			session.flush();
			session.close();
			return result;
		}
		
	}
	
	
	@SuppressWarnings({ "unchecked", "finally" })
	public int save(Film obj)
	{
		int result=0;
		Session session=null;
		
		try
		{
			session = getSessionFactory().openSession();
			//Criteria criteria=session.createCriteria(Film.class);
			
			Transaction tx=session.beginTransaction();
			session.saveOrUpdate(obj);
			
		
			
			
		tx.commit();
		
		}catch(Exception e)
		{
			System.err.println(e.getMessage());
			result=1;
		}finally{
			session.flush();
			session.close();
			return result;
		}
		
	}
	
	
	
	@SuppressWarnings({ "finally" })
	public int update(Film obj)
	{
		int result=0;
		Session session=null;
		
		try
		{
			session = getSessionFactory().openSession();
			//Criteria criteria=session.createCriteria(Film.class);
			
			Transaction tx=session.beginTransaction();
			session.update(obj);
			
		
			
			
		tx.commit();
		
		}catch(Exception e)
		{
			System.err.println(e.getMessage());
			result=1;
		}finally{
			session.flush();
			session.close();
			return result;
		}
		
	}
	@SuppressWarnings({ "finally" })
	public Film get(int id)
	{
		Film result=null;
		Session session=null;
		
		try
		{
			session = getSessionFactory().openSession();
			//Criteria criteria=session.createCriteria(Film.class);
			
			Transaction tx=session.beginTransaction();
			result=(Film) session.get(Film.class, id);
			
		
			
			
		tx.commit();
		
		}catch(Exception e)
		{
			System.err.println(e.getMessage());
			
		}finally{
			session.flush();
			session.close();
			return result;
		}
		
	}
}
