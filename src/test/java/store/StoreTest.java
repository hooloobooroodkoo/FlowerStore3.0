package store;

import flowerStore.Flower;
import flowerStore.FlowerTypes;
import flowerStore.Store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Store store;
    @BeforeEach
    void setUp() {
        store = new Store();
        Flower flower = new Flower();
        flower.setFlowerType(FlowerTypes.CHAMOMILE);
        flower.setPrice(23.50);
        Flower flower2 = new Flower();
        flower2.setFlowerType(FlowerTypes.CHAMOMILE);
        flower2.setPrice(23.50);
        Flower flower3 = new Flower();
        flower3.setFlowerType(FlowerTypes.TULIP);
        flower3.setPrice(30.15);
        Flower flower4 = new Flower();
        flower4.setFlowerType(FlowerTypes.ROSE);
        flower4.setPrice(35.00);
        store.getFlower(flower);
        store.getFlower(flower2);
        store.getFlower(flower3);
        store.getFlower(flower4);
    }

    @Test
    void getFlower() {
        assertEquals(2, store.chamomile.size());
        assertEquals(1, store.rose.size());
        assertEquals(1, store.tulip.size());
    }

    @Test
    void search() {
        assertEquals("Number of roses: 1\nPrice: 35.0", store.search("ROSE"));
    }
}