package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    // constructor injections
    private AthleteCreator athCreate;

    public MyApplication(AthleteCreator athCreate)
    {
        this.athCreate = athCreate;
    }

    @Override
    public void displayAthlete()
    {
        System.out.println("***************");
        athCreate.getProcess();
        System.out.println("***************");
        System.out.println("\n");

    }
}
