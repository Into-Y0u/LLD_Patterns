package Strategy_AlexDvices;

public class AudioAlexa extends AlexaDevice implements AudioFunctions {

    public AudioAlexa(ChargingDetails charginDetails) {
        super(charginDetails);
    }

    @Override
    public void playAudio() {
        System.out.println("Audio is playing");
    }

}
