package com.work.dao;

import java.util.List;

import com.work.model.Pack;

public interface PackDao 

{
	void savePack(Pack pack);
	List<Pack>getAllPacks();
}
