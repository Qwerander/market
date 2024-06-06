public interface MarketBehaviour {
    void acceptOrder(Order order); // принять заказ
    void releaseOrder(); // выдать заказ
}
