package com.zGuindou.ProjetManager.DAO;

import com.zGuindou.ProjetManager.DAO.entity.Project;
import java.util.List;

public interface ProjectDAO {
	
	public Project add(Project project);
	public Project edite(Project project);
	public void delete(Long id);
	public List<Project> findAll();
	public Project findById(Long id);
	
}
