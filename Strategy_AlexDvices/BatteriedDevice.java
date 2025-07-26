package Strategy_AlexDvices;

public class BatteriedDevice implements ChargingDetails, ChargingActivity {

    private boolean charginStatus = false;
    private double chargePercentage;

    public BatteriedDevice(double chargePercentage) {
        this.chargePercentage = chargePercentage;
    }

    public double showBatteryPercentage() {
        return chargePercentage;
    }

    @Override
    public boolean isCharging() {
        return this.charginStatus;
    }

    @Override
    public void putOnCharge() {
        charginStatus = true;
    }

    @Override
    public void putOffFromCharge() {
        charginStatus = false;
    }
}
