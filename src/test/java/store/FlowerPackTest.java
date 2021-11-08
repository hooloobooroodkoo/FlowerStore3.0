package store;

import flowerStore.Flower;
import flowerStore.FlowerPack;
import flowerStore.FlowerTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack pack;
    @BeforeEach
    void setUp() {
        pack = new FlowerPack();
        Flower flower = new Flower();
        flower.setFlowerType(FlowerTypes.TULIP);
        flower.setPrice(32.75);
        pack.setAmount(4);
        pack.setFlower(flower);
        pack.setPrice();
    }

    @Test
    void getFlowerType() {
        assertEquals("TULIP", pack.getFlowerType().toString());
    }

    @Test
    void getAmount() {
        assertEquals(4, pack.getAmount());
    }

    @Test
    void getPrice() {
        assertEquals(131, pack.getPrice());
    }

    @Test
    void testToString() {
        assertEquals("FlowerPack(flower=Flower(sepalLength=0.0, color=null, price=32.75, flowerType=TULIP), amount=4, price=131.0)", pack.toString());
    }
}