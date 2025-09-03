public class CarAssemble {
    public static void main (String[] args) {
        Car myCar = new Car.CarBuilder()
            .engineType("Gasoline")
            .brand("Honda")
            .color("Black")
            .transmission("Automatic")
            .passengerCapacity(7)
            .build();

            System.out.println(myCar.engineType);
            System.out.println(myCar.brand);
            System.out.println(myCar.color);
            System.out.println(myCar.transmission);
            System.out.println(myCar.passengerCapacity);
    }

}