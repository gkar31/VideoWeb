package or.buddha.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public abstract class VideoDbDaoAbstract {

	private  SessionFactory sessionFactory;
	
	public VideoDbDaoAbstract() {
		Configuration cfg=new Configuration().configure();
		System.err.println("Configuration :"+cfg);
		 sessionFactory = cfg.buildSessionFactory();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	

	
}
