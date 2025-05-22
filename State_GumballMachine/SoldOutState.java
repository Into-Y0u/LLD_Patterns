public class SoldOutState implements MachineState {

    GumBallMachine gumBallMachine;

    public SoldOutState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    public void insertQuarter() {
        System.out.println("[SoldOutState][Already Sold Out. No need to Insert Quarter]");
    }

    public void ejectQuarter() {
        System.out.println("[SoldOutState][Already Sold Out. Nothing to eject]");
    }

    public void turnChunk() {
        System.out.println("[SoldOutState][Already Sold Out. Dont try turn chunk]");
    }

    public void dispense() {
        System.out.println("[SoldOutState][Already Sold Out]");
    }

}
