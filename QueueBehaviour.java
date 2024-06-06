public interface QueueBehaviour {
    void addToQueue(Customer customer); // добавить клиента в очередь
    void removeFromQueue(); // удалить клиента из очереди
    Customer peekQueue(); // посмотреть первого клиента в очереди
    boolean isQueueEmpty(); // проверка, пуста ли очередь
}