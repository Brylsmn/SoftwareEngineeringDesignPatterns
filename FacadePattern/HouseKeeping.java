public class HouseKeeping implements HotelService{
    int roomNumber;

    HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void executeService() {
        cleanRoom();
    }

    private void cleanRoom() {
        System.out.println("HouseKeeping service is cleaning room number: " + roomNumber);
    }
}
