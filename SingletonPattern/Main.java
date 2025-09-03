public class Main {
    public static void main(String[] args) {

        HelpDesk helpDesk1 = new HelpDesk();
        HelpDesk helpDesk2 = new HelpDesk();
        HelpDesk helpDesk3 = new HelpDesk();

        SystemMonitor monitor = new SystemMonitor();

        monitor.displayCurrentQueueNumber();

        helpDesk1.serveCustomer();
        helpDesk2.serveCustomer();
        helpDesk3.serveCustomer();

        monitor.displayCurrentQueueNumber();

        helpDesk2.resetQueueNumber(19);

        monitor.displayCurrentQueueNumber();

        helpDesk1.serveCustomer();

        monitor.displayCurrentQueueNumber();
    }
}