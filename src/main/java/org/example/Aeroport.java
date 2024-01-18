package org.example;

public class Aeroport {

    private static Aeroport instance;

    private Aeroport()
    {
        System.out.println("this line should be there only once");
    }
    public static Aeroport getInstance()
    {
        System.out.println(instance);
        if (instance == null){instance = new Aeroport();}
        return instance;
    }
}
