package com.work.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.work.dao.PackDao;
import com.work.model.Category;
import com.work.model.Pack;

@Service
@Transactional
@Repository
public class PackServiceImp implements PackService {

	@Autowired

	private PackDao packDao;

	public void savePack(Pack pack) {
		System.out.println("PackServiceImp object is created");

		packDao.savePack(pack);

	}

	public List<Pack> getAllPacks() {
		return packDao.getAllPacks();

	}

	public Pack getPackById(int id) {
		return packDao.getPackById(id);
	}

	public void deletePack(int id) {
		Pack pack=getPackById(id);
		packDao.deletePack(pack);
		
	}

	public void updatePack(Pack pack) {
		packDao.editPack(pack);
		
	}

	public List<Category> getAllCategories() {
		
		return packDao.getAllCategories();
	}

	public List<Pack> getPackByCategory(int cid) {
		// TODO Auto-generated method stub
		return packDao.getPackByCategory(cid);
	}

}
