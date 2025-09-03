public interface NewsAgencySubject {
    public void register(SubscriberObserver subscriber);
    public void unregister(SubscriberObserver subscriber);
    public void notifySubscribers();
    public String getNews();
}
