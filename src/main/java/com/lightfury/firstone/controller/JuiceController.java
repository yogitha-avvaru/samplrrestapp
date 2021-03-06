package com.lightfury.firstone.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JuiceController {
	
	@RequestMapping ( produces = { "application/hal+json" }, 
		    method = RequestMethod.GET, value = "/juice")
	
	/*public String addFoo(@RequestParam(name = "id") String fooId, @RequestParam String name) { 
	    return "ID: " + fooId + " Name: " + name;
	} */                   
	public String juice(@RequestParam(name = "id",defaultValue = "val") String name) {
		//return "Orange";
		return name;
	}
	@RequestMapping ( produces = { "application/hal+json" }, 
		    method = RequestMethod.GET, path = "/drink/{name}/{age}")
	
	public String drink(@PathVariable (name = "name") String name,@PathVariable (name = "age") String age ) {
		//return "Orange";
		System.out.println("name is"+name);
		System.out.println("age is"+age);
		return "name is " + name + "age is " + age;
	}
}
