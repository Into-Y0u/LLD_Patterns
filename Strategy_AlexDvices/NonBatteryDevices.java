package Strategy_AlexDvices;

public class NonBatteryDevices implements ChargingDetails, ChargingActivity {

    private boolean charginStatus = false;

    public NonBatteryDevices() {

    }

    @Override
    public double showBatteryPercentage() {
        return -1;
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
