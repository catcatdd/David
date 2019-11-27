package com.d.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.d.entity.JF;
import com.d.mapper.jfMapper;
import com.d.service.IJFService;




@Service("jfservice")
public class JFServiceImpl implements IJFService {

	@Autowired
	private jfMapper mapper;
	
	public jfMapper getMapper() {
		return mapper;
	}

	public void setMapper(jfMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public JF queryJFByName(String name) {
		System.out.println("Service");
		return mapper.queryJFByName(name);
	}
	
	@Override
	public void addJF(JF jf) {
		mapper.addJF(jf);
	}

}