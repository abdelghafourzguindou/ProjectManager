package com.zGuindou.ProjetManager.service;

import java.util.List;

import com.zGuindou.ProjetManager.DAO.ProjectDAO;
import com.zGuindou.ProjetManager.DAO.ProjectDAOImp;
import com.zGuindou.ProjetManager.DAO.entity.Project;

public class ProjectServiceImpl implements ProjectService {
	
	ProjectDAO dao = new ProjectDAOImp();

	@Override
	public void add(Project project) {
		// TODO Auto-generated method stub
		dao.add(project);
	}

	@Override
	public Project edite(Project project) {
		// TODO Auto-generated method stub
		return dao.edite(project);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Project findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

}
