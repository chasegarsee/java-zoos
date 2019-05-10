package com.chasegarsee.zoo.service;

import com.chasegarsee.zoo.model.Zoo;

import java.util.ArrayList;

public interface ZooService
{

    ArrayList<Zoo> findAll();

    public Zoo findZooByName(String name);

    public void deleteById(long id);

    public Zoo addZoo(Zoo zoo);

    public Zoo updateZoo(Zoo zoo, long zooid);

}
