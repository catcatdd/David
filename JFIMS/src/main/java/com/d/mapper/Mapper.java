package com.d.mapper;

import com.d.entity.Person;

public interface Mapper {

	
	public Person queryPersonByName(String name);
	public void addPerson(Person person);
	public Person updatePerson(Person person);
	public void deletePersonByName(String name);//
	
	
}
