package com.zGuindou.ProjetManager.DAO;

import java.util.List;

import org.hibernate.Session;

import com.zGuindou.ProjetManager.DAO.entity.Type;
import com.zGuindou.ProjetManager.DAO.entity.Type;
import com.zGuindou.ProjetManager.utils.HibernateUtil;

public class TypeDAOImp implements TypeDAO {

	Session session = (Session) HibernateUtil.openSession();

	@Override
	public void add(Type Type) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.save(Type);
		session.getTransaction().commit();
	}

	@Override
	public Type edite(Type Type) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		Type p = (Type) session.merge(Type);
		session.getTransaction().commit();
		return p;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		Type p = findById(id);
		session.delete(p);
		session.getTransaction().commit();
	}

	@Override
	public List<Type> findAll() {
		// TODO Auto-generated method stub
		return session.createQuery("select o from Type o").list();
	}
	
	@Override
	public Type findById(Long id) {
		return (Type)session.get(Type.class, id);
	}

}
