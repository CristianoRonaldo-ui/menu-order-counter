public class OrderApp {
    public static void main(String[] args) {
        OrderCounter counter = new OrderCounter();

        counter.addOrder("Pho");
        counter.addOrder("Banh Mi");
        counter.addOrder("Pho");

        System.out.println("Pho: " + counter.getCount("Pho"));
        System.out.println("Banh Mi: " + counter.getCount("Banh Mi"));
        System.out.println("Spring Rolls: " + counter.getCount("Spring Rolls"));
    }
}