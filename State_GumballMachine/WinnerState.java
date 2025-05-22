
public class WinnerState implements MachineState {

    GumBallMachine gumBallMachine;

    public WinnerState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    public void insertQuarter() {
        System.out.println("[WinnerState][Cant take quarter now, We are processing a gumball dispense]");
    }

    public void ejectQuarter() {
        System.out.println("[WinnerState][Can't eject quarter now, We are processing your gumball]");
    }

    public void turnChunk() {
        System.out.println("[WinnerState][Dont turn chunk twice, We are processing your gumball]");
    }

    public void dispense() {
        if (gumBallMachine.getCurGumBallCount() > 1) {
            gumBallMachine.reduceGumBall(2);
            gumBallMachine.setMachineState(gumBallMachine.getNoQuarterState());
            System.out.println("[WinnerState][Sold done. We are dispensing your gum ball]");
            gumBallMachine.updateSoldCount();
        } else {
            gumBallMachine.setMachineState(gumBallMachine.getSoldOutState());
            System.out.println("[WinnerState][No Gu ball left, Retun the quarter inserted]");
        }
    }
}
