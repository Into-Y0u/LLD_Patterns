package Strategy_AlexDvices;

public class AlexaDevice {
    ChargingDetails charginDetails;

    public AlexaDevice(ChargingDetails charginDetails) {
        this.charginDetails = charginDetails;
    }

    public void showBatteryStatus() {
        double pers = charginDetails.showBatteryPercentage();
        boolean isCharging = charginDetails.isCharging();
        String prefix = (isCharging) ? "Charging | " : "";
        String suffix = (pers != -1) ? pers + "%" : "NO BATTERY";
        System.out.println(prefix + suffix);
    }

    public void putOnCharging() {

    }

}
