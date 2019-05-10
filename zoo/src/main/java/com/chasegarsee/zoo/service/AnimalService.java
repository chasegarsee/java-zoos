package com.chasegarsee.zoo.service;

import com.chasegarsee.zoo.model.Animal;
import com.chasegarsee.zoo.view.CountZoosWithAnimal;

import java.util.ArrayList;

public interface AnimalService
{

    public ArrayList<Animal> findAll();

    public Animal findAnimalByName(String name);

    public ArrayList<CountZoosWithAnimal> getCountZoosWithAnimal();

}
