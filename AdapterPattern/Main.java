import java.util.*;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        Laptop laptop = new Laptop();
        PowerOutlet laptopRC = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorRC = new RefrigeratorAdapter(refrigerator);

        Smartphone smartphone = new Smartphone();
        PowerOutlet smartphoneRC = new SmartphoneAdapter(smartphone);

        System.out.print("Options \n1. Charge Laptop \n2.  Start to cool Refrigerator \n3. Charge Smartphone \nEnter option: ");
        Integer option = sc.nextInt();

        switch(option){
            case 1:
                System.out.println(laptopRC.plugIn());
                break;
            case 2:
                System.out.println(refrigeratorRC.plugIn());
                break;
            case 3:
                System.out.println(smartphoneRC.plugIn());
                break;
        }

    }
}
