package FastOrderConstructor;

import flowerStore.FastOrderConstructor;
import flowerStore.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FastOrderConstructorTest {
    private Order order;
    @BeforeEach
    void setUp() {
        FastOrderConstructor fastOrder = new FastOrderConstructor();
        order = fastOrder.createOrder();
    }

    @Test
    void createOrder() {
        assertEquals("flowerStore.Order", order.getClass().getName());
    }

    @Test
    void getBucket() {
        assertEquals("flowerStore.FlowerBucket", order.getItems().get(0).getClass().getName());
    }

    @Test
    void getPrice() {
        assertEquals(491.0, order.calculateTotalPrice());
    }

    @Test
    void getDelivery() {
        assertEquals("class delivery.DHLdeliveryStrategy", order.getDelivery().getClass().toString());
    }
    @Test
    void getPayment() {
        assertEquals("class payment.PayPalPaymentStrategy", order.getPayment().getClass().toString());
    }
}