import java.util.*;

public class NewsAgency implements NewsAgencySubject{
    private String news;
    private List<Subscriber> subscribers;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
        notifySubscribers();
    }


    public void register(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void unregister(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void register(SubscriberObserver subscriber) {

    }

    @Override
    public void unregister(SubscriberObserver subscriber) {

    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : this.subscribers) {
            subscriber.update(getNews());
        }
    }
}
