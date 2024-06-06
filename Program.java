public class Program {
    public static void main(String[] args) {
        Market market = new Market();

        Customer customer1 = new Customer("Алиса");
        Customer customer2 = new Customer("Борис");
        Customer customer3 = new Customer("Виктор");
        Customer customer4 = new Customer("Геннадий");
        Customer customer5 = new Customer("Денис");

        market.addToQueue(customer1);
        market.addToQueue(customer2);
        market.addToQueue(customer3);
        market.addToQueue(customer4);
        market.addToQueue(customer5);

        market.update();
        market.update();
        market.update();
        market.update();
        market.update();

    }
}
