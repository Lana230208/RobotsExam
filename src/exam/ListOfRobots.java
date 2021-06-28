package exam;

import java.util.ArrayList;

public class ListOfRobots {
    ArrayList<Robot> robotArrayList = new ArrayList<>();

    public void addRobot(Robot robot){
           robotArrayList.add(robot);
    }
    public ArrayList<Robot> getArrayList(){
           return robotArrayList;
    }
    public void print(){
        for (int i = 0; i < robotArrayList.size(); i++) {
        Robot robot = robotArrayList.get(i);
        robot.print();
        }
    }
}