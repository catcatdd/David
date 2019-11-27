package com.d.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.d.entity.Person;
import com.d.service.IService;


//@SessionAttributes(types=Student.class)

@Controller

@RequestMapping("controller")
public class personController {
//����Service
	@Autowired
//	@Qualifier("service") 
//	  private Service studentService;
//	@Autowired
	@Resource(name="service")
	private IService service;
	 
	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}

	@RequestMapping(value="queryPersonByName",produces = "text/plain;charset=UTF-8")
	public String queryPersonByName(@RequestParam("name")String name,Map<String,Object> map)  {
		Person person = service.queryPersonByName(name);
		System.out.println(person.getName());
		map.put("person",person);
		System.out.println("Controller");
		return "demo";
		
	}
	
}
