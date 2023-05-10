package com.ing.zoo;


public class Zebra extends Herbivore{

    public Zebra()
    {
    }

    @Override
    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
