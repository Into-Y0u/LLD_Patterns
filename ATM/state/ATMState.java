package LLD_Patterns.ATM.state;

import LLD_Patterns.ATM.trasnsaction.Transaction;

public interface ATMState {
    void insertCard();
    void ejectCard();
    void selectOperation(Transaction trasnsation);
    void transaction();
}
