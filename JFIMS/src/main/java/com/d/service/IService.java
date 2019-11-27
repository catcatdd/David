package com.d.service;

import com.d.entity.Person;

public interface IService {

	public Person queryPersonByName(String name);
	public void addPerson(Person person);
	public Person updatePerson(Person person);
	public void deletePersonByName(String name);
}
