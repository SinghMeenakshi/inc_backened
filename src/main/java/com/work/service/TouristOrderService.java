package com.work.service;

import com.work.model.Booking;
import com.work.model.TouristOrder;

public interface TouristOrderService {

	TouristOrder createOrder(Booking booking);
}
