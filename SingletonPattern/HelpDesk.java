public class HelpDesk {
    public void serveCustomer() {
        CentralizedQueueSystem queueSystem = CentralizedQueueSystem.getInstance();

        queueSystem.getNextQueueNumber();
    }

    public void resetQueueNumber(int newQueueNumber) {
        CentralizedQueueSystem queuingSystem = CentralizedQueueSystem.getInstance();
        queuingSystem.resetQueueNumber(newQueueNumber);
    }
}
