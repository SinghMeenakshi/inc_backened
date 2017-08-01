package com.work.dao;

import com.work.model.BookTour;
import com.work.model.Booking;

public interface BookTourDao {

	void getBookTour (BookTour bookTour);
	void removeBookTour(int bookTourId);
	public void removeAllBookTours(int bookingId);
	public Booking getBookingOrder(int bookingId);
}
