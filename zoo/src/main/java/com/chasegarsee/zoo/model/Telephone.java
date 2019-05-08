package com.chasegarsee.zoo.model;

import javax.persistence.*;

@Entity
@Table(name = "telephone")
public class Telephone
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long telephoneid;

    private String phonetype;
    private String phonenumber;


    public Telephone()
    {
    }

    public Telephone(String phonetype, String phonenumber)
    {
        this.phonetype = phonetype;
        this.phonenumber = phonenumber;
    }

    public long getTelephoneid()
    {
        return telephoneid;
    }

    public void setTelephoneid(long telephoneid)
    {
        this.telephoneid = telephoneid;
    }

    public String getPhonetype()
    {
        return phonetype;
    }

    public void setPhonetype(String phonetype)
    {
        this.phonetype = phonetype;
    }

    public String getPhonenumber()
    {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber)
    {
        this.phonenumber = phonenumber;
    }
}
