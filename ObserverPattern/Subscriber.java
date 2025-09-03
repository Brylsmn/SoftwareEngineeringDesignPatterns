public class Subscriber implements SubscriberObserver {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String news) {
        System.out.println("Subscriber " + name + " received an update: " + news);
    }
}
