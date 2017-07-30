package com.work.service;

import com.work.model.BookTour;

public interface BookTourService {
	void getBookTour (BookTour bookTour);
	void removeBookTour(int bookTourId);
	void removeAllBookTours(int bookingId);
	 
}
