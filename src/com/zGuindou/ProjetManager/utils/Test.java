package com.zGuindou.ProjetManager.utils;

import org.hibernate.Session;

public class Test {
	
	static Session session = (Session) HibernateUtil.openSession();
	
	public static void main(String[] args) {
		session.createQuery("select o from Project o").list();
	}
	
}
