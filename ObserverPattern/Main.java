public class Main {
    public static void main(String[] args){
        NewsAgency newsAgency = new NewsAgency();

        Subscriber subscriber1 = new Subscriber("User1");
        Subscriber subscriber2 = new Subscriber("User2");

        newsAgency.register(subscriber1);
        newsAgency.register(subscriber2);

        newsAgency.setNews("Breaking News: Important Event!");

        newsAgency.unregister(subscriber1);

        newsAgency.setNews("More Breaking News: Another Event!");
    }
}
