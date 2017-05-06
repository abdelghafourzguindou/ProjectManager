package com.zGuindou.ProjetManager.service;

import java.util.List;

import com.zGuindou.ProjetManager.DAO.entity.Project;

public interface ProjectService {
	
	public void add(Project project);
	public Project edite(Project project);
	public void delete(Long id);
	public List<Project> findAll();
	public Project findById(Long id);
	
}
