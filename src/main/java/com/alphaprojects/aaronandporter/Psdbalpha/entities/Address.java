package com.alphaprojects.aaronandporter.Psdbalpha.entities;

/**
 * Created by jeffryporter on 6/5/17.
 */
public class Address
{
    private String locationName;

    private String line1;

    private String line2;

    private String line3;

    private String city;

    private String state;

    private String zip;

    public Address()
    {
    }

    public Address(String locationName, String line1, String line2, String line3, String city, String state, String zip)
    {
        this.locationName = locationName;
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getLocationName()
    {
        return locationName;
    }

    public void setLocationName(String locationName)
    {
        this.locationName = locationName;
    }

    public String getLine1()
    {
        return line1;
    }

    public void setLine1(String line1)
    {
        this.line1 = line1;
    }

    public String getLine2()
    {
        return line2;
    }

    public void setLine2(String line2)
    {
        this.line2 = line2;
    }

    public String getLine3()
    {
        return line3;
    }

    public void setLine3(String line3)
    {
        this.line3 = line3;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getZip()
    {
        return zip;
    }

    public void setZip(String zip)
    {
        this.zip = zip;
    }
}
