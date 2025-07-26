package Strategy_AlexDvices;

public class Driver {
    public static void main(String[] args) {

        BatteriedDevice bd = new BatteriedDevice(78);
        AudioAlexa audioDev = new AudioAlexa(bd);

        audioDev.showBatteryStatus();
        audioDev.playAudio();

    }
}
