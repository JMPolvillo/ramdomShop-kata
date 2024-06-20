package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

class ShoppingCartTest {

   @Test
    void calculatePriceForMagicCards_blueLessThanTen() {
        
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, 8, false, "blue", null, "Magic: The Gathering", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.0);

    }

    @Test
    void calculatePriceForMagicCards_blueMoreThanTen() {
       
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, 12, false, "blue", null, "Magic: The Gathering", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 2.5);

    }

    @Test
    void calculatePriceForMagicCards_redLessThanTen() {
       
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, 3, false, "red", null, "Magic: The Gathering", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 3.5);

    }

    @Test
    void calculatePriceForMagicCards_redMoreThanTen() {
        
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, 12, false, "red", null, "Magic: The Gathering", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 1.75);
    }

    @Test
    void calculatePriceForMagicCards_greenLessThanTwenty() {
        
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, 8, false, "green", null, "Magic: The Gathering", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 4.4);

    }

    @Test
    void calculatePriceForMagicCards_greenMoreThanTwenty() {
        
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, 25, false, "green", null, "Magic: The Gathering", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.28);
    }

    @Test
    void calculatePriceForMagicCards_blackLessThanTwenty() {
        
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, 8, false, "black", null, "Magic: The Gathering", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 6.8);

    }

    @Test
    void calculatePriceForMagicCards_blackMoreThanTwenty() {
        
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, 25, false, "black", null, "Magic: The Gathering", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 8.16);

    }

    @Test
    void calculatePriceForMagicCards_brown() {
        
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "brown", null, "Magic: The Gathering", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 2.0);

    }

    @Test
    void calculatePriceForMagicCards_blacklotus() {
        
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, null, null, "Magic: The Gathering - Black Lotus", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 40000.0);

    }
    
    @Test
    void calculatePriceForFish_blue() {
        
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "blue", BigDecimal.valueOf(0), null, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 0.1);
    }

    @Test
    void calculatePriceForFish_gold() {
       
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "gold", BigDecimal.valueOf(1), null, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 100);
    }

    @Test
    void calculatePriceForAnimal_mammal() {
        
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(1, null, false, null, null, null, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 4.2);
    }

    @Test
    void calculatePriceForAnimal_spiderRed() {
        
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(10, null, false, "red", null, null, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 14);
    }

    @Test
    void calculatePriceForAnimal_spiderGold() {
        
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(10, null, false, "golden", null, null, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 15);
    }

    @Test
    void calculatePriceForAnimal_spiderGoldenStinky() {
        
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(10, null, true, "golden", null, null, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 7.5);
    }

    @Test
    void calculatePriceForAnimal_spiderRedStinky() {
        
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(10, null, true, "red", null, null, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 7.0);
    }

    @Test
    void calculatePriceForWine() {
        
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 100.0);

    }

    @Test
    void calculatePriceForCheese() {
        
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, 5, true, null, null, "French Camembert", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 50.0);

    }
}