package com.alphaprojects.aaronandporter.Psdbalpha.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

/**
 * Created by jeffryporter on 6/5/17.
 */
public class Amendment
{
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String body;

    @Column(nullable = false)
    private String synopsis;

    @Column(nullable = false)
    private ArrayList<String> creators;

    public Amendment()
    {
    }

    public Amendment(String title, String body, String synopsis, ArrayList<String> creators)
    {
        this.title = title;
        this.body = body;
        this.synopsis = synopsis;
        this.creators = creators;
    }

    public Amendment(int id, String title, String body, String synopsis, ArrayList<String> creators)
    {
        this.id = id;
        this.title = title;
        this.body = body;
        this.synopsis = synopsis;
        this.creators = creators;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getBody()
    {
        return body;
    }

    public void setBody(String body)
    {
        this.body = body;
    }

    public String getSynopsis()
    {
        return synopsis;
    }

    public void setSynopsis(String synopsis)
    {
        this.synopsis = synopsis;
    }

    public ArrayList<String> getCreators()
    {
        return creators;
    }

    public void setCreators(ArrayList<String> creators)
    {
        this.creators = creators;
    }
}
