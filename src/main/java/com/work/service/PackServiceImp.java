package com.work.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.work.dao.PackDao;
import com.work.dao.PackDaoImp;
import com.work.model.Pack;

@Service
@Transactional

public class PackServiceImp 
{
	public PackServiceImp()
	{
		System.out.println("PackServiceImp object is created");
	}
	
	@Autowired
	
	private PackDao packDao;
	
		public void savePack(Pack pack)
		{
			packDao.savePack(pack);
		
		}

}
