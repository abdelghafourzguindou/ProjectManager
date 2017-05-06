package com.zGuindou.ProjetManager.DAO;

import java.util.List;

import com.zGuindou.ProjetManager.DAO.entity.Type;

public interface TypeDAO {
	
	public void add(Type type);
	public Type edite(Type type);
	public void delete(Long id);
	public List<Type> findAll();
	public Type findById(Long id);
	
}
