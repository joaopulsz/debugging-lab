package model;

import model.interfaces.ISwim;
import model.interfaces.IPrey;
public class Seal extends Animal implements ISwim, IPrey {

public Seal(String name){
    super(name);
    }

    @Override
    public void eat() {
        System.out.println("Seal is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Seal is sleeping");
    }

    @Override
    public void swim() {
        System.out.println("Seal is swimming");
    }

    @Override
    public void flee() {
        System.out.println("Seal is fleeing from a predator");
    }
}
