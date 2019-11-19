package facade.logic;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-18  */
public class RobotFacade {

    RobotColor rc;
    RobotMetal rm;
    RobotBody rb;
    public RobotFacade(){
        rc = new RobotColor();
        rm = new RobotMetal();
        rb = new RobotBody();
    }
    public void constructRobot(String color, String metal) {
        System.out.println("\nCreation of the Robot Start");
        rc.setColor(color);
        rm.setMetal(metal);
        rb.createBody();
        System.out.println("\nRobot creation end");
        System.out.println();
    }
}
