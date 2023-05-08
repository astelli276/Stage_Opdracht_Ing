package com.ing.zoo;

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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        String[] splited = input.split("\\s+");

        switch (splited[0]){
            case "hello":
                for (Animal animal :animals) {
                    if (animal.name.equals(splited[1])){
                        animal.sayHello();
                    }
                }
                break;
            case "give":
                if (splited[1].equals("leaves")){
                    System.out.println("no leaves yet");
                }else if (splited[1].equals("meat")){
                    System.out.println("no meat yet");
                }
                else{
                    System.out.println("Unknown command: " + input);
                }
                break;
            case "perform":
                if (splited[1].equals("trick")){
                    for (Animal animal: animals) {
                        if (animal.trick != ""){
                            animal.performTrick();
                        }
                    }
                }
                break;
//
        }

    }

}
