package builderPattern;

public class Main {
    public static void main (String[] args){
        User user1 = new User.UserBuilder("Juan", "Dela Cruz")
                .email("Juan.Cruz@gmail.com")
                .address("123 Lanao")
                .phone("8-7000")
                .age(27)
                .build();

        User user2 = new User.UserBuilder("Maria", "Dela Cruz")
                .email("Maria.Cruz@gmail.com")
                .address("456 St. Peter")
                .phone("123-4567")
                .age(25)
                .build();

        System.out.println("Name: " + user1.firstName + " " + user1.lastName);
        System.out.println("Email: " + user1.email);
        System.out.println("Address: " + user1.address);
        System.out.println("Phone: " + user1.phone);
        System.out.println("Age: " + user1.age);
        System.out.println();

        System.out.println("Email: " + user2.email);
        System.out.println("Name: " + user2.firstName + " " + user2.lastName);
        System.out.println("Age: " + user2.age);
    }
}
