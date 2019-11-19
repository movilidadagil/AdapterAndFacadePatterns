package facade.logic;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-18  */
public class FacadePatternEx {

    public static void main(String[] args){
        System.out.println("**** Facade Pattern Demo***");
        RobotFacade rf1 = new RobotFacade();
        rf1.constructRobot("Green","Iron");
        RobotFacade rf2 = new RobotFacade();
        rf2.constructRobot("Blue","Steel");
    }
}
