package com.ing.zoo;

import java.util.Random;

public class Bear extends Omnivore{

    public Bear(){

    }

    @Override
    public void sayHello() {
        helloText = "grrr growl";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "nom nom huf huf";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "grr nom nom";
    }

    @Override
    public void performTrick() {
        trick = "balances on ball";
        System.out.println(trick);
    }
}
