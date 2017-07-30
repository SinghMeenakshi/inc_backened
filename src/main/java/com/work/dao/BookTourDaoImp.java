package com.work.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.work.model.BookTour;
import com.work.model.Booking;

@Repository
public class BookTourDaoImp implements BookTourDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void getBookTour(BookTour bookTour) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(bookTour);
		
	}

	public void removeBookTour(int bookTourId) {
		Session session=sessionFactory.getCurrentSession();
		BookTour bookTour=(BookTour)session.get(BookTour.class, bookTourId);
		session.delete(bookTour);
	}

	public void removeAllBookTours(int bookingId) {
		Session session=sessionFactory.getCurrentSession();
		Booking booking=(Booking) session.get(Booking.class, bookingId);
		List<BookTour> bookTours=booking.getBookTours();
		for(BookTour bookTour:bookTours)
		{
			session.delete(bookTour);
		}
		
	}

	
}
