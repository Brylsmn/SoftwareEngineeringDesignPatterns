# Problem Scenario

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

public User(String firstName, String lastName, String email,
           String address, String phone, int age) {
     // ...
}

However, you encounter challenges:

**Registration forms**: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.<br>
**Optional fields**: Not all customers provide complete information, but the constructor forces them to.<br>
**Data consistency**: Changes to user profiles after registration can cause unexpected issues due to mutable fields.

Implement solution using the Builder Pattern to address the issue.

# UML Class Diagram
![SoftEng 2 - builderPattern](https://github.com/Brylsmn/builderPattern/assets/142909052/57836644-8595-4c4c-93c5-3d51cc8377d4)

