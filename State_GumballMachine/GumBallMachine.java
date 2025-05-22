public class GumBallMachine {
    static int currentGumBallCount = 0;
    MachineState currentMachineState;

    MachineState noQuarterState;
    MachineState hasQuarterState;
    MachineState soldOutState;
    MachineState soldState;
    MachineState winnerState;
    static int soldCount = 0;

    public GumBallMachine(int initGumballCount) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        if (initGumballCount > 0) {
            currentGumBallCount = initGumballCount;
            currentMachineState = noQuarterState;
        } else {
            currentMachineState = soldOutState;
        }
    }

    public void addGumBall(int n) {
        currentGumBallCount += n;
        currentMachineState = noQuarterState;
    }

    public int getCurGumBallCount() {
        return currentGumBallCount;
    }

    public void addQuarter() {
        currentMachineState.insertQuarter();
    }

    public void removeQuarter() {
        currentMachineState.ejectQuarter();
    }

    public void turnCrank() {
        currentMachineState.turnChunk();
    }

    public void dispense() {
        currentMachineState.dispense();
    }

    public void setMachineState(MachineState state) {
        currentMachineState = state;
    }

    public String getMachineState() {
        return currentMachineState.getClass().getName();
    }

    public MachineState getNoQuarterState() {
        return noQuarterState;
    }

    public MachineState getHasQuarterState() {
        return hasQuarterState;
    }

    public MachineState getSoldOutState() {
        return soldOutState;
    }

    public MachineState getSoldState() {
        return soldState;
    }

    public MachineState getWinnerState() {
        return winnerState;
    }

    public int getSoldCount() {
        return soldCount;
    }

    public int updateSoldCount() {
        return soldCount += 1;
    }

    public void reduceGumBall(int a) {
        currentGumBallCount -= a;
    }
}
