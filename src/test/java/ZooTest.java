import model.Eagle;
import model.Puffin;
import model.Seal;
import model.Tiger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ZooTest {

    private Zoo zoo;

    @BeforeEach
    public void setUp() {
        zoo = new Zoo();
    }

    @Test
    public void canAddAllAnimalTypes() {
        zoo.addAnimal(new Eagle("Bob"));
        zoo.addAnimal(new Puffin("Pingu"));
        zoo.addAnimal(new Seal("Leonardo"));
        zoo.addAnimal(new Tiger("Stevie"));
        assertThat(zoo.allAnimals.size()).isEqualTo(4);
    }
}
