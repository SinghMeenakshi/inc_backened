package com.work.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.work.dao.BookTourDao;
import com.work.model.BookTour;

@Service
@Transactional
public class BookTourServiceImp implements BookTourService{

	@Autowired
	private BookTourDao bookTourDao;
	
	public void getBookTour(BookTour bookTour) {
		bookTourDao.getBookTour(bookTour);
		
	}

	public void removeBookTour(int bookTourId) {
		bookTourDao.removeBookTour(bookTourId);
		
	}

	public void removeAllBookTours(int bookingId) {
		bookTourDao.removeAllBookTours(bookingId);
		
	}

}
