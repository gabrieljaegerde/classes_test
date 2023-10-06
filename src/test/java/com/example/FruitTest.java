package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FruitTest {
    
    @Test
    public void testFruitInitialization() {
        Fruit fruit = new Fruit("Apple", "Red", "Sweet", 0.2);
        assertEquals("Apple", fruit.getName());
        assertEquals("Red", fruit.getColor());
        assertEquals("Sweet", fruit.getTaste());
        assertEquals(0.2, fruit.getWeight(), 0.01); // Using delta for double comparison
    }
    
    @Test
    public void testGettersAndSetters() {
        Fruit fruit = new Fruit("Apple", "Red", "Sweet", 0.2);

        fruit.setName("Banana");
        assertEquals("Banana", fruit.getName());

        fruit.setColor("Yellow");
        assertEquals("Yellow", fruit.getColor());

        fruit.setTaste("Mild");
        assertEquals("Mild", fruit.getTaste());

        fruit.setWeight(0.3);
        assertEquals(0.3, fruit.getWeight(), 0.01); // Using delta for double comparison
    }
}
