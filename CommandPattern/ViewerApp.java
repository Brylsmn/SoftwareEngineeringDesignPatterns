import java.util.*;
public class ViewerApp {
    public static void main (String[] args){

        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        RemoteControl rc = new RemoteControl();
        Scanner sc = new Scanner(System.in);

        System.out.print("Remote Control Options" +
                         "\n1. Turn on Light" +
                         "\n2. Turn off Light" +
                         "\n3. Increase Thermostat temperature" +
                         "\n4. Decrease Thermostat temperature" +
                         "\n5. Increase Music Player volume" +
                         "\n6. Decrease Music Player volume");
        System.out.print("\n\nClick number: ");
        Integer number = sc.nextInt();

        switch(number) {
            case 1:
                LightOn lightOn = new LightOn(light);
                System.out.println(lightOn.execute());
                break;
            case 2:
                LightOff lightOff = new LightOff(light);
                System.out.println(lightOff.execute());
                break;
            case 3:
                TempIncrease tempIncrease = new TempIncrease(thermostat);
                System.out.println(tempIncrease.execute());
                break;
            case 4:
                TempDecrease tempDecrease = new TempDecrease(thermostat);
                System.out.println(tempDecrease.execute());
                break;
            case 5:
                VolumeIncrease volumeIncrease = new VolumeIncrease(musicPlayer);
                System.out.println(volumeIncrease.execute());
                break;
            case 6:
                VolumeDecrease volumeDecrease = new VolumeDecrease(musicPlayer);
                System.out.println(volumeDecrease.execute());
                break;
        }
    }
}
