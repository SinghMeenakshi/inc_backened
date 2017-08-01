package com.work.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.work.dao.TouristOrderDao;
import com.work.model.Booking;
import com.work.model.TouristOrder;

@Service
@Transactional
public class TouristOrderServiceImp implements TouristOrderService
{
	@Autowired 
	private TouristOrderDao touristOrderDao;
	public TouristOrder createOrder(Booking booking) {
		return touristOrderDao.createOrder(booking);
	}
 
}
