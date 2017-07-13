package com.work.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.work.dao.PackDao;

import com.work.model.Pack;

@Service
@Transactional

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

}
