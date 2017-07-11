package com.work.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.work.model.Pack;

@Repository
@Transactional
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

