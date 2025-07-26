package State_ATMMachine;

public interface ATMMachineStates {

    abstract void insertCard();

    abstract void ejectCard();

    abstract void noCashState();

    abstract void dispenseCash();

    abstract void waitingForActionState();
}
