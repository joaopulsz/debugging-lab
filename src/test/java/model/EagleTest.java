package model;

import model.interfaces.IFly;
import model.interfaces.IHunt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EagleTest {
    public Eagle eagle;
    public Class<?> eagleClass;

    @BeforeEach
    public void setUp(){
        this.eagle = new Eagle("Bob");
        this.eagleClass = Eagle.class;
    }

    @Test
    public void implementsIFly(){
        assertThat(IFly.class.isAssignableFrom(eagleClass)).isTrue();
    }

    @Test
    public void implementsIAnimal(){
        assertThat(Animal.class.isAssignableFrom(eagleClass)).isTrue();
    }

    @Test
    public void implementsIHunt() {
        assertThat(IHunt.class.isAssignableFrom(eagleClass)).isTrue();
    }


    @Test
    public void canEat() throws NoSuchMethodException {
        assertThat(eagleClass.getMethod("eat")).isNotNull();
    }

    @Test
    public void canSleep() throws NoSuchMethodException {
        assertThat(eagleClass.getMethod("sleep")).isNotNull();
    }

    @Test
    public void canFly() throws NoSuchMethodException {
        assertThat(eagleClass.getMethod("fly")).isNotNull();
    }
}
