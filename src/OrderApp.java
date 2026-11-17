public class OrderApp {
    public static void main(String[] args) {
        OrderCounter counter = new OrderCounter();

        counter.addOrder("Pho");
        counter.addOrder("Banh Mi");
        counter.addOrder("Pho");
        counter.addOrder("Spring Rolls");
        counter.addOrder("Bun Bo Hue");
        counter.addOrder("Com Tam");

        System.out.println("Pho: " + counter.getCount("Pho"));
        System.out.println("Banh Mi: " + counter.getCount("Banh Mi"));
        System.out.println("Spring Rolls: " + counter.getCount("Spring Rolls"));
        counter.printReport();
        System.out.println("Best seller: " + counter.findBestSeller());
        runTests();
    }

    public static void runTests() {
        System.out.println("=== Running Tests ===");

        // Test 1: an empty counter has no best seller
        OrderCounter empty = new OrderCounter();
        if (empty.findBestSeller() == null) {
            System.out.println("Test 1 PASS: empty counter returns null");
        } else {
            System.out.println("Test 1 FAIL: expected null");
        }

        // Test 2: on a tie, the dish ordered first wins
        OrderCounter tie = new OrderCounter();
        tie.addOrder("Pho");
        tie.addOrder("Banh Mi");
        tie.addOrder("Banh Mi");
        tie.addOrder("Pho");
        String best = tie.findBestSeller();
        if ("Pho".equals(best)) {
            System.out.println("Test 2 PASS: tie goes to first ordered dish");
        } else {
            System.out.println("Test 2 FAIL: expected Pho but got " + best);
        }

        // Test 3: adding orders increases the count correctly
        OrderCounter counter = new OrderCounter();
        counter.addOrder("Pho");
        counter.addOrder("Pho");
        if (counter.getCount("Pho") == 2) {
            System.out.println("Test 3 PASS: count increased correctly");
        } else {
            System.out.println("Test 3 FAIL: expected count 2 but got " + counter.getCount("Pho"));
        }
    }
}