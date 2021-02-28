package com.lightfury.firstone;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface BeerRepository extends CrudRepository<Beer, Long> {

}
