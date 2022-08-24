package model;

import model.interfaces.IHunt;
import model.interfaces.IRun;
import model.interfaces.ISwim;

public class Tiger extends Animal implements ISwim, IHunt, IRun {


public Tiger(String name){
    super(name);
    }


    @Override
    public void swim() {
        System.out.println("Tiger is swimming");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating");
    }

    @Override
    public void run() {
        System.out.println("Tiger is running");
    }

    @Override
    public void hunt() {
        System.out.println("Rawr");
    }

}
