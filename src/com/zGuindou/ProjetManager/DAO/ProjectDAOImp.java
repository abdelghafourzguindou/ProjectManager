package com.zGuindou.ProjetManager.DAO;

import java.util.List;

import org.hibernate.Session;

import com.zGuindou.ProjetManager.DAO.entity.Project;
import com.zGuindou.ProjetManager.utils.HibernateUtil;

public class ProjectDAOImp implements ProjectDAO {
	
	Session session = HibernateUtil.openSession();

	@Override
	public void add(Project project) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.save(project);
		session.getTransaction().commit();
	}

	@Override
	public Project edite(Project project) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		Project p = (Project) session.merge(project);
		session.getTransaction().commit();
		return p;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		Project p = findById(id);
		session.delete(p);
		session.getTransaction().commit();
	}

	@Override
	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return session.createQuery("select o from Project o").list();
	}
	
	@Override
	public Project findById(Long id) {
		return (Project)session.get(Project.class, id);
	}

}
