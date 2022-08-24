package model;

import model.interfaces.IPrey;
import model.interfaces.ISwim;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SealTest {

    public Seal seal;
    public Class<?> sealClass;

    @BeforeEach
    public void setUp(){
        this.seal = new Seal("Leonardo");
        this.sealClass = Seal.class;
    }

    @Test
    public void implementsISwim(){
        assertThat(ISwim.class.isAssignableFrom(sealClass)).isTrue();
    }

    @Test
    public void implementsIAnimal(){
        assertThat(Animal.class.isAssignableFrom(sealClass)).isTrue();
    }

    @Test
    public void implementsIPrey() {
        assertThat(IPrey.class.isAssignableFrom(sealClass)).isTrue();
    }

    @Test
    public void canEat() throws NoSuchMethodException {
        assertThat(sealClass.getMethod("eat")).isNotNull();
    }

    @Test
    public void canSleep() throws NoSuchMethodException {
        assertThat(sealClass.getMethod("sleep")).isNotNull();
    }

    @Test
    public void canSwim() throws NoSuchMethodException {
        assertThat(sealClass.getMethod("swim")).isNotNull();
    }

    @Test
    public void canFlee() throws NoSuchMethodException {
        assertThat(sealClass.getMethod("flee")).isNotNull();
    }

}
