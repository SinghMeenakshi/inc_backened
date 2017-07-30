package com.work.dao;

import com.work.model.BookTour;

public interface BookTourDao {

	void getBookTour (BookTour bookTour);
	void removeBookTour(int bookTourId);
	public void removeAllBookTours(int bookingId);
}
