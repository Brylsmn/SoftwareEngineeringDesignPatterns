import java.util.*;
public class HotelApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Valet valetService = new Valet("123ABC");
        HouseKeeping houseKeepingService = new HouseKeeping(101);
        Cart cartService = new Cart(2);

        System.out.print("Options: \n1. Valet \n2. Housekeeping \n3. Cart \n\nEnter option: ");
        Integer option = sc.nextInt();

        switch(option) {
            case 1:
                FrontDesk frontDesk = new FrontDesk(valetService);
                frontDesk.executeService();
                break;
            case 2:
                frontDesk = new FrontDesk(houseKeepingService);
                frontDesk.executeService();
                break;
            case 3:
                frontDesk = new FrontDesk(cartService);
                frontDesk.executeService();
                break;
        }
    }
}
