package model;

import model.interfaces.IFly;
import model.interfaces.IPrey;
import model.interfaces.ISwim;

public class Puffin extends Animal implements IFly, ISwim, IPrey {
    public Puffin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Puffin is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void fly() {
        System.out.println("Puffin is flying");
    }

    @Override
    public void swim() {
        System.out.println("Puffin is swimming");
    }

    @Override
    public void flee() {
        System.out.println("Puffin is fleeing from predator");
    }
}
