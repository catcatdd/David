package com.d.mapper;

import com.d.entity.JF;

public interface jfMapper {

	public JF queryJFByName(String name);
	public void addJF(JF jf);
}
