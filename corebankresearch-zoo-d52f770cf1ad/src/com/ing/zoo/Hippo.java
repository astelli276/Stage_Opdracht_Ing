package com.ing.zoo;

public class Hippo extends Herbivore{

    public Hippo()
    {
    }

    @Override
    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
