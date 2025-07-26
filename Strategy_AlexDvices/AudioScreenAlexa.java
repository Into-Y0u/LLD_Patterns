package Strategy_AlexDvices;

public class AudioScreenAlexa extends AlexaDevice implements AudioFunctions, ScreenFunctions {

    public AudioScreenAlexa(ChargingDetails charginDetails) {
        super(charginDetails);
    }

    @Override
    public void playAudio() {
        System.out.println("Audio is playing");
    }

    @Override
    public void display() {
        System.out.println("Screen is Visible");
    }

}