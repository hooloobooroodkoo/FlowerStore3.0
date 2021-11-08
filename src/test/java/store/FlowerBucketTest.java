package store;

import flowerStore.Flower;
import flowerStore.FlowerBucket;
import flowerStore.FlowerPack;
import flowerStore.FlowerTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerBucket bucket;
    @BeforeEach
    void setUp() {
        FlowerPack pack1 = new FlowerPack();
        Flower flower = new Flower();
        flower.setFlowerType(FlowerTypes.TULIP);
        flower.setPrice(32.75);
        pack1.setAmount(4);
        pack1.setFlower(flower);
        pack1.setPrice();

        bucket = new FlowerBucket();
        bucket.addFlower(pack1);

        FlowerPack pack2 = new FlowerPack();
        Flower flower2 = new Flower();
        flower2.setFlowerType(FlowerTypes.ROSE);
        flower2.setPrice(35);
        pack2.setAmount(4);
        pack2.setFlower(flower2);
        pack2.setPrice();

        bucket.addFlower(pack2);

    }

    @Test
    void addFlowerPack() {
        assertEquals(2, bucket.flowerpacks.size());
    }

    @Test
    void getPrice() {
        assertEquals(271, bucket.getPrice());
    }
}