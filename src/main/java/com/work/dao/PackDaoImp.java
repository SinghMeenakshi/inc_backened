package com.work.dao;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.work.model.Pack;

@Repository

public class PackDaoImp implements PackDao
{
		
	public PackDaoImp()
	{
		System.out.println("PackDaoImp object is created");
	}

@Autowired
	
	private SessionFactory sessionFactory;
	
	public void savePack(Pack pack)
	{
		Session session= sessionFactory.getCurrentSession();
		session.save(pack);
	}
}

