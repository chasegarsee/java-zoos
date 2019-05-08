package com.chasegarsee.zoo.repository;

import com.chasegarsee.zoo.model.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
}
