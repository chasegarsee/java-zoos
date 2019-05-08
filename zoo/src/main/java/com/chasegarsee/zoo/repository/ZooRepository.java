package com.chasegarsee.zoo.repository;

import com.chasegarsee.zoo.model.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long>
{
}
