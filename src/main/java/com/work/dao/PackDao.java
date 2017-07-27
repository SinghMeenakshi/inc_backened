package com.work.dao;

import java.util.List;

import com.work.model.Category;
import com.work.model.Pack;

public interface PackDao 

{
	void savePack(Pack pack);
	public List<Pack>getAllPacks();
	public Pack getPackById(int id);
	void deletePack(Pack pack);
	void editPack(Pack pack);
	List<Category> getAllCategories();
	List <Pack> getPackByCategory(int cid);
	
}
