package com.work.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.work.model.Category;
import com.work.model.Pack;

@Repository
@Transactional
public class PackDaoImp implements PackDao {

	@Autowired

	private SessionFactory sessionFactory;

	public void savePack(Pack pack) {

		System.out.println("PackDaoImp object is created");

		Session session = sessionFactory.getCurrentSession();
		session.save(pack);

	}

	public List<Pack> getAllPacks() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("From Pack");
		List<Pack> packs = query.list();
		return packs;
	}

	public Pack getPackById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Pack pack=(Pack)session.get(Pack.class, id);
		return pack;
	}

	public void deletePack(Pack pack) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(pack);
		
		
	}

	public void editPack(Pack pack) {
		Session session = sessionFactory.getCurrentSession();
		session.update(pack);
		
	}

	public List<Category> getAllCategories() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Category");
		List<Category> categories=query.list();
		return categories;
	}

	public List<Pack> getPackByCategory(int cid) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Pack where cid=?");
		query.setInteger(0, cid);
		List<Pack> packs=query.list();
		return packs;
	}

}
