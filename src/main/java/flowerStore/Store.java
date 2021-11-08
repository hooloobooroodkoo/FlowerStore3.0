package flowerStore;

import flowerStore.Flower;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Store {
    public List<Flower> chamomile = new ArrayList<Flower>();
    public List<Flower> tulip = new ArrayList<Flower>();
    public List<Flower> rose = new ArrayList<Flower>();
    Hashtable<String, Double> prices = new Hashtable<String, Double>();


    public void getFlower(Flower flower) {
        if (flower.getFlowerType().toString().equals("ROSE")) {
            rose.add(flower);

        }
        if (flower.getFlowerType().toString().equals("TULIP")) {
            tulip.add(flower);
        }
        if (flower.getFlowerType().toString().equals("CHAMOMILE")) {
            chamomile.add(flower);
        }
        prices.put(flower.getFlowerType().toString(), flower.getPrice());
    }

    public String search(String flowerType) {
        if (flowerType.equals("ROSE")) {
            return "Number of roses: " + rose.size() +"\nPrice: " + prices.get(flowerType);
        }
        else if (flowerType.equals("TULIP")) {
            return "Number of tulips: " + tulip.size() +"\nPrice: " + prices.get(flowerType);
        }
        else {
            return "Number of chamomiles: " + chamomile.size() +"\nPrice: " + prices.get(flowerType);
        }
    }


}