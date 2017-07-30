package com.work.dao;

import com.work.model.Tourist;
import com.work.model.User;

public interface TouristDao 
{
	void registerTourist(Tourist tourist);
	User validateUsername (String username);
	Tourist validateEmail(String email);
	Tourist getTouristByUsername(String username);
}
