package com.zGuindou.ProjetManager.utils;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.zGuindou.ProjetManager.DAO.ProjectDAO;
import com.zGuindou.ProjetManager.DAO.ProjectDAOImp;
import com.zGuindou.ProjetManager.DAO.entity.Project;

public class Test {
	
	static Session session = (Session) HibernateUtil.openSession();

	public static Logger log = Logger.getLogger(Test.class);
	
	public static void main(String[] args) {
		//session.createQuery("select o from Project o").list();
		
		ProjectDAO pdao = new ProjectDAOImp();
		Project p = new Project();
		p.setTitle("Projet PO");
		pdao.add(p);
		
		log.info("oooooooooooooo");
	}
	
} 
