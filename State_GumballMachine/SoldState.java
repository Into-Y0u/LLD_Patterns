
public class SoldState implements MachineState {

    GumBallMachine gumBallMachine;

    public SoldState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    public void insertQuarter() {
        System.out.println("[SoldState][Cant take quarter now, We are processing a gumball dispense]");
    }

    public void ejectQuarter() {
        System.out.println("[SoldState][Can't eject quarter now, We are processing your gumball]");
    }

    public void turnChunk() {
        System.out.println("[SoldState][Dont turn chunk twice, We are processing your gumball]");
    }

    public void dispense() {
        if (gumBallMachine.getCurGumBallCount() > 0) {
            gumBallMachine.reduceGumBall(1);
            gumBallMachine.setMachineState(gumBallMachine.getNoQuarterState());
            System.out.println("[SoldState][We are dispensing your gum ball]");
            gumBallMachine.updateSoldCount();
        } else {
            gumBallMachine.setMachineState(gumBallMachine.getSoldOutState());
            System.out.println("[SoldState][No Gum ball left, Retun the quarter inserted]");
        }
    }
}
