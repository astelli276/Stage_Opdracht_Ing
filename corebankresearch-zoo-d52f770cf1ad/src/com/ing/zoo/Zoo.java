package com.ing.zoo;

import com.ing.zoo.animal.*;
import com.ing.zoo.animal.carnivore.Carnivore;
import com.ing.zoo.animal.carnivore.Lion;
import com.ing.zoo.animal.carnivore.Penguin;
import com.ing.zoo.animal.carnivore.Tiger;
import com.ing.zoo.animal.herbivore.Herbivore;
import com.ing.zoo.animal.herbivore.Hippo;
import com.ing.zoo.animal.herbivore.Zebra;
import com.ing.zoo.animal.omnivore.Bear;
import com.ing.zoo.animal.omnivore.Omnivore;
import com.ing.zoo.animal.omnivore.Pig;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        ArrayList<Animal> animals = new ArrayList();

        Lion henk = new Lion();
        henk.name = "henk";
        animals.add(henk);
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        animals.add(elsa);
        Pig dora = new Pig();
        dora.name = "dora";
        animals.add(dora);
        Tiger wally = new Tiger();
        wally.name = "wally";
        animals.add(wally);
        Zebra marty = new Zebra();
        marty.name = "marty";
        animals.add(marty);

        Bear yogi = new Bear();
        yogi.name = "yogi";
        animals.add(yogi);
        Penguin pingu = new Penguin();
        pingu.name = "pingu";
        animals.add(pingu);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        String[] splited = input.split("\\s+");

        switch (splited[0]){
            case "hello":
                try {
                    String inputAnimalName = splited[1];
                    for (Animal animal :animals) {
                        if (animal.name.equals(inputAnimalName)){
                            animal.sayHello();
                        }
                    }
                }catch (Exception e){
                    for (Animal animal :animals) {
                        animal.sayHello();
                    }
                }
                break;

            case "give":
                boolean giveLeaves;
                if (splited[1].equals("leaves")){
                    giveLeaves = true;
                    letAnimalsEat(animals, giveLeaves);
                }else if (splited[1].equals("meat")){
                    giveLeaves = false;
                    letAnimalsEat(animals, giveLeaves);
                }
                else{
                    System.out.println("Unknown command: " + input);
                }
                break;
            case "perform":
                if (splited[1].equals("trick")){
                    letAnimalsPreformTricks(animals);
                }
                break;
            default:
                System.out.println("Unknown command: " + input);
        }

    }

    public static void letAnimalsEat(ArrayList<Animal> animals, boolean eatLeaves){
        for (Animal animal: animals) {
            Class parentClass = animal.getClass().getSuperclass();
            if (parentClass.equals(Herbivore.class) && eatLeaves){
                Herbivore herbivore = (Herbivore) animal;
                herbivore.eatLeaves();
            }else if (parentClass.equals(Carnivore.class) && !eatLeaves){
                Carnivore carnivore = (Carnivore) animal;
                carnivore.eatMeat();
            }
            else if (parentClass.equals(Omnivore.class)){
                Omnivore omnivore = (Omnivore) animal;
                if (eatLeaves){
                    omnivore.eatLeaves();
                }else {
                    omnivore.eatMeat();
                }
            }
        }
    }

    public static void letAnimalsPreformTricks(ArrayList<Animal> animals){
        for (Animal animal: animals) {
            if (animal.trick != ""){
                animal.performTrick();
            }
        }
    }

}
