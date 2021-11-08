package flowerStore;

import delivery.DHLdeliveryStrategy;
import delivery.Delivery;
import lombok.Getter;
import lombok.Setter;
import payment.PayPalPaymentStrategy;

@Getter @Setter
public class FastOrderConstructor {
    private FlowerBucket bucket;
    private double price;
    private DHLdeliveryStrategy delivery;
    private PayPalPaymentStrategy payment;
    public Order createOrder() {
        bucket = new FlowerBucket();
        Order order = new Order();
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
        order.addItem((Item)bucket);
        return order;
    }


}
