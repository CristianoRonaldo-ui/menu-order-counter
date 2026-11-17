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
    }
}