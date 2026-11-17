import java.util.HashMap;

public class OrderCounter {
    private HashMap<String, Integer> orders;

    public OrderCounter() {
        orders = new HashMap<>();
    }

    public void addOrder(String dish) {
        int currentCount = orders.getOrDefault(dish, 0);
        orders.put(dish, currentCount + 1);
    }

    public int getCount(String dish) {
        return orders.getOrDefault(dish, 0);
    }
}