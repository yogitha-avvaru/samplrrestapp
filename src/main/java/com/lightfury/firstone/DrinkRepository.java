package com.lightfury.firstone;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends  CrudRepository<Beer, Long>{

}
