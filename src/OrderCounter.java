import java.util.LinkedHashMap;

public class OrderCounter {
    private LinkedHashMap<String, Integer> orders;

    public OrderCounter() {
        orders = new LinkedHashMap<>();
    }

    public void addOrder(String dish) {
        int currentCount = orders.getOrDefault(dish, 0);
        orders.put(dish, currentCount + 1);
    }

    public int getCount(String dish) {
        return orders.getOrDefault(dish, 0);
    }

    public void printReport() {
        System.out.println("=== Order Report ===");
        for (String dish : orders.keySet()) {
            System.out.println(dish + ": " + orders.get(dish));
        }
    }

    public String findBestSeller() {
        String bestDish = null;
        int bestCount = 0;

        for (String dish : orders.keySet()) {
            int count = orders.get(dish);
            if (count > bestCount) {
                bestCount = count;
                bestDish = dish;
            }
        }

        return bestDish;
    }
}