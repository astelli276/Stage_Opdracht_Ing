package com.ing.zoo.animal.carnivore;

import com.ing.zoo.animal.carnivore.Carnivore;

public class Penguin extends Carnivore {

    public Penguin(){

    }

    @Override
    public void sayHello() {
        helloText = "Noot Noot";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "honk honk eat fish";
        System.out.println(eatText);
    }
}
