package com.work.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.work.dao.TouristDao;
import com.work.model.Tourist;
import com.work.model.User;

@Service
@Transactional
public class TouristServiceImp implements TouristService {
	@Autowired
	private TouristDao touristDao;

	public void registerTourist(Tourist tourist) {
		System.out.println("------------------------" + tourist.getEmail() + "---------------------------------");
		touristDao.registerTourist(tourist);
	}

	public User validateUsername(String username) {
		// TODO Auto-generated method stub
		return touristDao.validateUsername(username);
	}

	public Tourist validateEmail(String email) {
		// TODO Auto-generated method stub
		return touristDao.validateEmail(email);
	}

}
