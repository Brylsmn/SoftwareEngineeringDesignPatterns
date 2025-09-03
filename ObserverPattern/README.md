# Real-time News Subscription Service

**Background**: You're tasked with designing a real-time news subscription service for a media company. The system needs to notify subscribers about breaking news as soon as it's published by the news agency.

**Scenario Description**: The system comprises two main components: NewsAgency and Subscriber.
  <br>NewsAgency: Represents the central hub for publishing news. It maintains a list of subscribers and notifies them whenever new news is available.
  <br>Subscriber: Represents users or entities subscribed to the news service. Subscribers receive immediate notifications about any breaking news published by the agency.

**Requirements**:

  1. Subscription Management:
    <br>Users should be able to subscribe to the news service.
    <br>Subscribers should be notified promptly when new news is published.

  2. Dynamic Subscription Updates:
    <br>The system should allow for dynamic subscription updates. Subscribers can subscribe, unsubscribe, or modify their preferences without disrupting other subscribers.

  3. Decoupled Communication:
    <br>Ensure that the communication between the news agency and subscribers is decoupled. Subscribers shouldn't directly request news updates but should be notified by the news agency when new information is available.

**Expected Behavior**:
  <br>When the news agency publishes breaking news, all subscribed users should receive immediate updates.
  <br>Subscribers can join or leave the service without affecting the delivery of news to other subscribers.
  <br>The system should provide flexibility for future enhancements, such as personalized subscriptions or categorization of news updates.

**Constraints**:
  <br>The system should be scalable to handle a growing number of subscribers without compromising performance.
  <br>Ensure that the implementation follows object-oriented design principles and promotes loose coupling between the news agency and subscribers.

# UML Class Diagram
![Alt Text](https://scontent.fmnl8-3.fna.fbcdn.net/v/t1.15752-9/386833745_889146619104799_6802733080766412936_n.png?_nc_cat=102&ccb=1-7&_nc_sid=8cd0a2&_nc_eui2=AeFjwkM-kLxmlKyEKwG5HmKbU1ZMMxzJ5AtTVkwzHMnkC-4ChmBIFLjDkOjadubmp0BRa3ckEZ62IDtAKXmySK5Y&_nc_ohc=MSLjQT_NpzkAX_fLEVE&_nc_ht=scontent.fmnl8-3.fna&oh=03_AdRwTlkiV34rr3RLBuZ1pf-dbOQEPBSQBZAtChSLxxJ2TA&oe=65968A1A)
