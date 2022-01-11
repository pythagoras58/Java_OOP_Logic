package ExerciseOne;

/**
 *
 * @author Danso Solomon Danquah (Zhìhuì)
 */
public class TestTV {
    public static void main(String[] args) {
        
        //Create two TV object
        TV samsungTV = new TV(); //samsung Tv object
        TV philipsTV = new TV(); // Philips TV object
        
        // Turn On The TV objects
        samsungTV.turnOn();
        System.out.println("State of Samsung TV: " + samsungTV.on);
        philipsTV.turnOn();
        System.out.println("State of Philips TV: " + philipsTV.on);
        
        
        //set channels for both TV objects
        samsungTV.setChannel(30); // set samsung channel to 30
        System.out.println("Current Channnel of Samsung TV: " + samsungTV.channel);
        philipsTV.setChannel(45); // set philips channel to 45
        System.out.println("Current Channnel of Philips TV: " + philipsTV.channel);
        
        // increase the channels
        samsungTV.channelUp();
        System.out.println("New Channel of Samsung TV: " + samsungTV.channel);
        philipsTV.channelUp();
        System.out.println("New Channel of Philips TV: " + philipsTV.channel);
        
        // set the volume for both tv objects
        samsungTV.setVolume(10); // set samsung volumeLevel to 10
        System.out.println("Current Volume Level of Samsung TV: " + samsungTV.volumeLevel);
        philipsTV.setVolume(15); // set philips channel to 45
        System.out.println("Current Volume Level of Philips TV: " + philipsTV.volumeLevel);
        
        // increase the channels
        samsungTV.volumeUp(); // increase volume of samsung tv
        System.out.println("New Volume Level of Samsung TV: " + samsungTV.volumeLevel);
        philipsTV.volumeUp();// increase volume level of philips tv
        System.out.println("New Volume Level of Philips TV: " + philipsTV.volumeLevel);
    }
}
