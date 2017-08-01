package com.work.service;

import com.work.model.BookTour;
import com.work.model.Booking;

public interface BookTourService {
	void getBookTour (BookTour bookTour);
	void removeBookTour(int bookTourId);
	void removeAllBookTours(int bookingId);
	Booking getBookingOrder(int bookingId);
}
