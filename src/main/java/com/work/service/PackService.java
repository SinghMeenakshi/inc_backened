package com.work.service;

import java.util.List;

import com.work.model.Pack;

public interface PackService

{

	void savePack(Pack pack);
	List<Pack>getAllPacks();
}
