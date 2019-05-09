package com.chasegarsee.zoo.repository;

import com.chasegarsee.zoo.model.Animal;
import com.chasegarsee.zoo.view.CountZoosWithAnimal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
    public Animal findAnimalByAnimaltype(String type);

    @Query(value = "SELECT z.animalid, animaltype, count(zooid) as countzoos FROM zooanimals z INNER JOIN animal a ON z.animalid = a.animalid GROUP BY z.animalid, animaltype", nativeQuery = true)
    ArrayList<CountZoosWithAnimal> getCountZoosWithAnimal();

}
