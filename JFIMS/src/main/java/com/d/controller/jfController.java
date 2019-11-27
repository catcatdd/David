package com.d.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.d.entity.JF;
import com.d.service.IJFService;


//@SessionAttributes(types=Student.class)

@Controller

@RequestMapping("jfcontroller")
public class jfController {
//����Service
	@Autowired
//	@Qualifier("service") 
//	  private Service studentService;
//	@Autowired
	@Resource(name="jfservice")
	private IJFService jfservice;
	 
	public IJFService getService() {
		return jfservice;
	}

	public void setService(IJFService service) {
		this.jfservice = service;
	}

	@RequestMapping(value="queryJFByName",produces = "text/plain;charset=UTF-8")
	public String queryJFByName(@RequestParam("name")String name,Map<String,Object> map)  {
		JF jf = jfservice.queryJFByName(name);
		System.out.println(jf.getName());
		map.put("jf",jf);
		System.out.println("Controller");
		return "jfdemo";
		
	}
	
}