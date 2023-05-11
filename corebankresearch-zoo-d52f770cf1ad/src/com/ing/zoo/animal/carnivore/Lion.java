package com.ing.zoo.animal.carnivore;

import com.ing.zoo.animal.carnivore.Carnivore;

public class Lion extends Carnivore {

    public Lion()
    {
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
