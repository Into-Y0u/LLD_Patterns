package Strategy_AlexDvices;

public class ScreenAlexa extends AlexaDevice implements ScreenFunctions {

    public ScreenAlexa(ChargingDetails charginDetails) {
        super(charginDetails);
    }

    @Override
    public void display() {
        System.out.println("Screen is Visible");
    }

}