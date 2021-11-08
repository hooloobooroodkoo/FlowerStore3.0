package flowerStore;
import delivery.Delivery;
import lombok.Getter;
import lombok.Setter;
import payment.Payment;
import user.Receiver;
import user.User;

import java.util.ArrayList;
@Getter @Setter
public class Order {
    private ArrayList<Item> items = new ArrayList<Item>();
    private Payment payment;
    private Delivery delivery;
    private ArrayList<Receiver> users = new ArrayList<>();
    public Order() {
    }
    public void addUser(Receiver user) {
        users.add(user);
    }
    public void removeUser(User user) {
        users.remove(user);
    }
    public void notifyUsers() {
        for (int i=0; i< users.size(); i++) {
            users.get(i).update();
        }
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(FlowerBucket bucket){
        items.remove(bucket);
    }
    public double calculateTotalPrice(){
        double sum = 0;
        for (Item item: items) {
            sum += item.getPrice();
        }
        return sum;
    }
    public void setPaymentStrategy(Payment paymentStrategy) {
        payment = paymentStrategy;
    }

    public void setDelivery(Delivery deliveryStrategy) {
        delivery = deliveryStrategy;
    }

    public void processOrder() {
        System.out.println("Your order is being processed");
    }

}
