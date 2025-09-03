public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("Dawg", "Juan");
        Pet cat = new Pet("Ming", "Maria");
        
        Sound dogSound = new DogSound();
        Sound catSound = new CatSound();

        Food dogFood = new DogFood();
        Food catFood = new CatFood();

        System.out.println(dog.getPetName() + "'s owner is " + dog.getOwner() + ", and says " + dogSound.makeSound() + " and eats " + dogFood.eat());
        System.out.println(cat.getPetName() + "'s owner is " + cat.getOwner() + ", and says " + catSound.makeSound() + " and eats " + catFood.eat());

    }
}
