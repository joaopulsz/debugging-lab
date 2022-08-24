import model.Animal;

import java.util.ArrayList;

public class Zoo {
    public ArrayList<Animal> allAnimals;

    public Zoo() {
        allAnimals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        allAnimals.add(animal);
    }
}
