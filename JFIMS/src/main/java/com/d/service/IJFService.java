package com.d.service;

import com.d.entity.JF;

public interface IJFService {

	public JF queryJFByName(String name);
	public void addJF(JF jf);
}
