public class FrontDesk {
    HotelService service;

    FrontDesk(HotelService service) {
        this.service = service;
    }

    void executeService() {
        service.executeService();
    }
}
