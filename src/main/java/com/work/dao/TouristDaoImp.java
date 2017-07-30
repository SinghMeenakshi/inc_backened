package com.work.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.work.model.Authorities;
import com.work.model.Booking;
import com.work.model.Tourist;
import com.work.model.User;

@Repository
public class TouristDaoImp implements TouristDao
{
	@Autowired
	private SessionFactory sessionFactory;
	public void registerTourist(Tourist tourist)
	{
		User user=tourist.getUser();
/*		System.out.println(user);*/
		user.setEnabled(true);
		String username=user.getUsername();
		
		Authorities authorities=new Authorities();
		authorities.setRole("Role_USER");
		authorities.setUsername(username);
		
		Session session=sessionFactory.getCurrentSession();
		session.save(authorities);
		
		Booking booking=new Booking();
		booking.setTourist(tourist);
		tourist.setBooking(booking);
		session.save(tourist);
	}
	public User validateUsername(String username) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from User where username=?");
		query.setString(0, username);
		User user=(User)query.uniqueResult();
		return user;
	}
	public Tourist validateEmail(String email) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Tourist where email=?");
		query.setString(0, email);
		Tourist tourist=(Tourist)query.uniqueResult();
		return tourist;
	}
	public Tourist getTouristByUsername(String username) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Tourist where user.username=?");
		query.setString(0, username);
		Tourist tourist=(Tourist)query.uniqueResult();
		return tourist ;
	}
}
