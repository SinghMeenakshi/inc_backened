package com.work.dao;

import com.work.model.Booking;
import com.work.model.TouristOrder;

public interface TouristOrderDao 
{
		TouristOrder createOrder(Booking booking);
}
