package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class BasketTest {

    @Test
    public void testBasketInitialization() {
        Basket basket = new Basket(5);
        assertEquals(5, basket.getCapacity());
        assertNotNull(basket.getFruits());
        assertTrue(basket.getFruits().isEmpty());
    }

    @Test
    public void testAddFruit() {
        Basket basket = new Basket(2);
        Fruit apple = new Fruit("Apple", "Red", "Sweet", 0.2);
        Fruit banana = new Fruit("Banana", "Yellow", "Sweet", 0.3);
        Fruit cherry = new Fruit("Cherry", "Red", "Sour", 0.01);

        basket.addFruit(apple);
        basket.addFruit(banana);
        
        assertEquals(2, basket.getFruits().size());
        assertTrue(basket.getFruits().contains(apple));
        assertTrue(basket.getFruits().contains(banana));

        basket.addFruit(cherry); // This should not be added due to capacity constraints
        assertEquals(2, basket.getFruits().size());
    }

    @Test
    public void testRemoveFruit() {
        Basket basket = new Basket(2);
        Fruit apple = new Fruit("Apple", "Red", "Sweet", 0.2);
        basket.addFruit(apple);
        basket.removeFruit(apple);
        
        assertTrue(basket.getFruits().isEmpty());
    }

    @Test
    public void testGettersAndSetters() {
        Basket basket = new Basket(3);
        assertEquals(3, basket.getCapacity());

        basket.setCapacity(5);
        assertEquals(5, basket.getCapacity());

        Fruit apple = new Fruit("Apple", "Red", "Sweet", 0.2);
        ArrayList<Fruit> newFruits = new ArrayList<>();
        newFruits.add(apple);

        basket.setFruits(newFruits);
        assertEquals(1, basket.getFruits().size());
        assertTrue(basket.getFruits().contains(apple));
    }
}
