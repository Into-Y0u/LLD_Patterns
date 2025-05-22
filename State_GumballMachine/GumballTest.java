public class GumballTest {

    public static void main(String[] args) {
        GumBallMachine gumBallMachineObj = new GumBallMachine(10);

        for (int i = 0; i < 20; i++) {
            System.out.println("Round : " + i);
            gumBallMachineObj.addQuarter();
            gumBallMachineObj.turnCrank();
            gumBallMachineObj.dispense();
            System.out.println();

            if (i == 12) {
                gumBallMachineObj.addGumBall(5);
            }
        }
    }
}