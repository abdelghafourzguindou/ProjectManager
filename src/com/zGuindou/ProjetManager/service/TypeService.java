package com.zGuindou.ProjetManager.service;

import java.util.List;

import com.zGuindou.ProjetManager.DAO.entity.Type;

public interface TypeService {
	
	public void add(Type type);
	public Type edite(Type type);
	public void delete(Long id);
	public List<Type> findAll();
	public Type findById(Long id);
	
}
