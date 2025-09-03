public class SystemMonitor {
    public void displayCurrentQueueNumber() {
        CentralizedQueueSystem queuingSystem = CentralizedQueueSystem.getInstance();
        int currentQueueNumber = queuingSystem.getCurrentQueueNumber();
        System.out.println("Current Queue Number: " + currentQueueNumber);
    }
}
