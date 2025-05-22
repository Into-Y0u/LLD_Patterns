public class NoQuarterState implements MachineState {
    GumBallMachine gumBallMachine;

    public NoQuarterState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    public void insertQuarter() {
        gumBallMachine.setMachineState(gumBallMachine.getHasQuarterState());
        System.out.println("[NoQuarterState][Got Quarter IN]");
    }

    public void ejectQuarter() {
        System.out.println("[NoQuarterState][No Quarte In]");
    }

    public void turnChunk() {
        System.out.println("[NoQuarterState][Insert quarter first, then turn chunk]");
    }

    public void dispense() {
        System.out.println("[NoQuarterState][No money no honey]");
    }
}
