package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Newspaper[] newspapers = new Newspaper[2];
        newspapers[0] = new Newspaper("Veja", 2015, 10, 24, false);
        newspapers[1] = new Newspaper("HS", 2020, 04, 19, true);

        newspapers[0].setDate(1999, 02, 30);

        System.out.println(newspapers[0]);
        System.out.println("Year of publication of HS edition: " + newspapers[1].getYear());
    }
}
