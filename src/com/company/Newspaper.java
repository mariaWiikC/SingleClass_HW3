package com.company;

public class Newspaper
{
    private String name;
    private int year, month, dayOfmonth;
    private boolean isFinnish;

    public Newspaper(String name, int year, int month, int dayOfmonth, boolean isFinnish)
    {
        this.name = name;
        this.year = year;
        this.month = month;
        this.dayOfmonth = dayOfmonth;
        this.isFinnish = isFinnish;
    }

    public String getName()
    {
        return name;
    }

    public void setDate(int year, int month, int dayOfmonth)
    {
        this.year = year;
        this.month = month;
        this.dayOfmonth = dayOfmonth;
    }

    public int getYear()
    {
        return year;
    }

    public int getMonth()
    {
        return month;
    }

    public int getDayOfmonth()
    {
        return dayOfmonth;
    }

    public boolean getIsFinnish()
    {
        return isFinnish;
    }

    public String toString()
    {
        return name + " (" + year + ". " + month + ". " + dayOfmonth + "). Is it Finnish? - " + isFinnish;
    }
}
