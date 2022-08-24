package model;

import model.interfaces.IFly;
import model.interfaces.IHunt;

public class Eagle extends Animal implements IFly, IHunt {

   public Eagle(String name){
    super(name);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void hunt() {
        System.out.println("Eagle is looking for the next meal");
    }

    @Override
    public void eat() {
        System.out.println("Yum!");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

}
