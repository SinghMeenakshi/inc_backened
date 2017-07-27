package com.work.service;

import java.util.List;

import com.work.model.Category;
import com.work.model.Pack;

public interface PackService

{

	void savePack(Pack pack);
	public List<Pack>getAllPacks();
	public Pack getPackById(int id);
	void deletePack(int id);
	void updatePack(Pack pack);
	List<Category> getAllCategories();
	List<Pack> getPackByCategory(int cid);
	
}
