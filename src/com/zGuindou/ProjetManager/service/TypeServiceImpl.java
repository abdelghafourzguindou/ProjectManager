package com.zGuindou.ProjetManager.service;

import java.util.List;

import com.zGuindou.ProjetManager.DAO.TypeDAO;
import com.zGuindou.ProjetManager.DAO.TypeDAOImp;
import com.zGuindou.ProjetManager.DAO.entity.Type;

public class TypeServiceImpl implements TypeService {
	
	TypeDAO dao = new TypeDAOImp();
	
	@Override
	public void add(Type type) {
		// TODO Auto-generated method stub
		dao.add(type);
	}

	@Override
	public Type edite(Type type) {
		// TODO Auto-generated method stub
		return dao.edite(type);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public List<Type> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Type findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

}
