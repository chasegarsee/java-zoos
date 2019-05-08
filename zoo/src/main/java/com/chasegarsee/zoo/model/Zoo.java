package com.chasegarsee.zoo.model;


import javax.persistence.*;

@Entity
@Table(name = "zoo")
public class Zoo
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    private String zooname;

    public Zoo()
    {
    }

    public Zoo(String zooname)
    {
        this.zooname = zooname;
    }

    public long getZooid()
    {
        return zooid;
    }

    public void setZooid(long zooid)
    {
        this.zooid = zooid;
    }

    public String getZooname()
    {
        return zooname;
    }

    public void setZooname(String zooname)
    {
        this.zooname = zooname;
    }
}