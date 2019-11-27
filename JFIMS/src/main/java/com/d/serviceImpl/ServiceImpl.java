package com.d.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.d.entity.Person;
import com.d.mapper.Mapper;
import com.d.service.IService;



@Service("service")
public class ServiceImpl implements IService {

	@Autowired
	private Mapper mapper;
	
	public Mapper getMapper() {
		return mapper;
	}

	public void setMapper(Mapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public Person queryPersonByName(String name) {
		System.out.println("Service");
		return mapper.queryPersonByName(name);
	}

	@Override
	public void addPerson(Person person) {
		mapper.addPerson(person);
		
	}

	@Override
	public Person updatePerson(Person person) {
		return mapper.updatePerson(person);
	}

	@Override
	public void deletePersonByName(String name) {
		mapper.deletePersonByName(name);
		
	}
}
