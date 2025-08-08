package LLD_Patterns.ATM;

import LLD_Patterns.ATM.state.ATMState;

public class ATMManager {
    
    private static ATMManager instance;
    private ATMState currentState;

    private ATMManager()
    {
        currentState = new IdleState();
    }

    public static ATMManager getInstance()
    {
        if(instance == null)
        {
            synchronized(ATMManager.class)
            {
                if(instance == null)
                {
                    instance = getInstance();
                }
            }
        }
        return instance;
    }




}
