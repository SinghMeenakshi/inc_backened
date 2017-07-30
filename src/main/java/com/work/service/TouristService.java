package com.work.service;

import com.work.model.Tourist;
import com.work.model.User;

public interface TouristService 
{
void registerTourist(Tourist tourist);
User validateUsername (String username);
Tourist validateEmail(String email);
Tourist getTouristByUsername(String username);
}
