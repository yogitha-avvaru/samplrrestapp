package com.lightfury.firstone.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lightfury.firstone.Beer;
import com.lightfury.firstone.DrinkRepository;


@RestController
public class DrinkController {
	@Autowired
	private DrinkRepository drinkRepository;
	
     @RequestMapping("/drinks")
     public List<Beer> getAllBeers() {
    	 return (List<Beer>) drinkRepository.findAll(); 
		//return getAllBeers();
	}

     @PostMapping("/drinks")
     Beer newBeer(@RequestBody Beer newBeer) {
       return drinkRepository.save(newBeer);
     } 





}

