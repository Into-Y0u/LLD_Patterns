public class HasQuarterState implements MachineState {

    GumBallMachine gumBallMachine;

    public HasQuarterState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    public void insertQuarter() {
        System.out.println("[HasQuarterState][There is already a Quarter IN]");
    }

    public void ejectQuarter() {
        gumBallMachine.setMachineState(gumBallMachine.getNoQuarterState());
        System.out.println("[HasQuarterState][Returning quarter back to customer]");
    }

    public void turnChunk() {
        int x = gumBallMachine.getSoldCount();
        if (x % 5 == 0) {
            gumBallMachine.setMachineState(gumBallMachine.getWinnerState());
            System.out.println("[HasQuarterState][Behenchoo..... You won one Extra]");
        } else {
            gumBallMachine.setMachineState(gumBallMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("[HasQuarterState][Turn Chunk to get the Gum Ball]");
    }

}
