public class CentralizedQueueSystem {
    private static CentralizedQueueSystem instance;
    private int queueNumber;
    private CentralizedQueueSystem() {
        queueNumber = 0;
    }

    public static CentralizedQueueSystem getInstance() {
        if (instance == null) {
            synchronized (CentralizedQueueSystem.class) {
                if (instance == null) {
                    instance = new CentralizedQueueSystem();
                }
            }
        }
        return instance;
    }

    public int getCurrentQueueNumber() {
        return queueNumber;
    }

    public void getNextQueueNumber(){
        queueNumber++;
    }
    public void resetQueueNumber(int newStart) {
        queueNumber = newStart;
    }
}
