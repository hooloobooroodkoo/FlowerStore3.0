package order;

import delivery.DHLdeliveryStrategy;
import flowerStore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import payment.PayPalPaymentStrategy;
import user.Receiver;
import user.User;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private Order order;
    private Receiver user;
    private FlowerBucket bucket;
    private double price;
    private DHLdeliveryStrategy delivery;
    private PayPalPaymentStrategy payment;
    @BeforeEach
    void SetUp() {
        bucket = new FlowerBucket();
        order = new Order();
        FlowerPack pack = new FlowerPack();
        Flower flower = new Flower();
        flower.setFlowerType(FlowerTypes.ROSE);
        flower.setPrice(32.75);
        pack.setAmount(15);
        pack.setFlower(flower);
        pack.setPrice();
        bucket.addFlower(pack);
        price = bucket.getPrice();
        delivery = new DHLdeliveryStrategy();
        order.setDelivery(delivery);
        payment = new PayPalPaymentStrategy();
        order.setPaymentStrategy(payment);
        order.addItem((Item) bucket);
        user = new Receiver();
        order.addUser(user);
    }

    @Test
    void addUser() {
        assertEquals(1, order.getUsers().size());
    }

    @Test
    void removeUser() {
        order.removeUser(user);
        assertEquals(0, order.getUsers().size());
    }

    @Test
    void calculateTotalPrice() {
        assertEquals(491.0, order.calculateTotalPrice());
    }


}