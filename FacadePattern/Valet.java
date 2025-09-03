public class Valet implements HotelService{
    String plateNumber;

    Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void executeService() {
        pickUpVehicle();
    }

    private void pickUpVehicle() {
        System.out.println("Valet service is handling vehicle with plate number: " + plateNumber);
    }
}
