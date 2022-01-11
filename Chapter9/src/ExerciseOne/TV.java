
package ExerciseOne;

/**
 * @author Danso Solomon Danquah (Zhìhuì)
 */
public class TV {
    
    // Define All Placeholders as package public
    int channel;
    int volumeLevel;
    boolean on;

    public TV() {
        //Initialization of placeholder
        channel = 1;
        volumeLevel = 1;
        on = false;
    }
    
    // Turn On TV method
    void turnOn(){
        on = true;
    }
    
    //Turn Off TV method
    void turnOff(){
        on = false;
    }
    
    //Set Channel Method
    void setChannel(int channel){
        
        //Ensure channel is from 1 to 120
        if((channel >= 1 && channel <=120) && on){
            this.channel = channel;
        }
    }
    
    //Set Volume Method
    void setVolume(int volumeLevel){
         //Ensure channel is from 1 to 120
        if((volumeLevel >= 1 && volumeLevel <=100) && on){
            this.volumeLevel = volumeLevel;
        }
    }
    
    //Channel Increment Methond
    void channelUp(){
        if(channel < 120 && on){
            channel ++;
        }
    }
    
     //Channel Decrement Methond
    void channelDown(){
        if(channel < 120 && on){
            channel --;
        }
    }
    
     //Volume Increment Methond
    void volumeUp(){
        if(volumeLevel <= 100 && on){
            volumeLevel++;
        }
    }
    
     //Volume Decrement Methond
    void volumeDown(){
        if(volumeLevel<=100 && volumeLevel<=1){
            volumeLevel--;
        }
    }
    
}
