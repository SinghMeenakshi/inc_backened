package com.work.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.work.model.Pack;

@Repository
@Transactional
public class PackDaoImp implements PackDao {

	

	@Autowired

	private SessionFactory sessionFactory;
	
	

	public void savePack(Pack pack) {

		System.out.println("PackDaoImp object is created");
	
		Session session = sessionFactory.openSession();
		session.save(pack);
		session.flush();
		session.close();
		
	}

	public List<Pack> getAllPacks() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("From Pack");
		List<Pack> packs=query.list();
		return packs;
	}
}
