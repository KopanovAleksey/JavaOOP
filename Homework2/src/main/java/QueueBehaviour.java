public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrder();
    void  giveOrders();
    void releaseFromQueue();
}
