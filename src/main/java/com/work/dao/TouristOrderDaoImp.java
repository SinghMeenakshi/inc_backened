package com.work.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.work.model.BookTour;
import com.work.model.Booking;
import com.work.model.Tourist;
import com.work.model.TouristOrder;

@Repository
public class TouristOrderDaoImp implements TouristOrderDao
{
		@Autowired
		private SessionFactory sessionFactory;
		@Autowired
		private BookTourDao bookTourDao;
		public TouristOrder createOrder(Booking booking) {
			Session session=sessionFactory.getCurrentSession();
			List<BookTour> bookTours=booking.getBookTours();
			double grandTotal=0;
			for(BookTour bookTour:bookTours){
				grandTotal=bookTour.getTotalPrice()+grandTotal;
			}
			booking.setGrandTotal(grandTotal);
			Tourist tourist=booking.getTourist();
			TouristOrder touristOrder=new TouristOrder();
			touristOrder.setBookingDate(new Date());
			touristOrder.setBooking(booking);
			session.save(touristOrder);
			return touristOrder;
		}
		
		
}
