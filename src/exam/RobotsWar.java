package exam;

import java.util.Scanner;

public class RobotsWar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1-st Robot name: ");
        String name1 = in.nextLine();

        System.out.println("Enter 2-nd Robot name: ");
        String name2 = in.nextLine();

        Robot robot1 = new Robot(name1, 100);
        Robot robot2 = new Robot(name2, 100);
        ListOfRobots robots = new ListOfRobots();
        robots.addRobot(robot1);
        robots.addRobot(robot2);

        while (true){
//            robot1.print();
//            robot2.print();
              robots.print();
// First robot step
            System.out.println("First player step: ");
            String step1 = in.nextLine();
            if (step1.contains("L")){
                break;
            }
            if (!robot1.move(step1)){
                break;
            }
// Second robot step
            System.out.println("Second player step: ");
            String step2 = in.nextLine();
            if (step2.contains("L")){
                break;
            }
            if (!robot2.move(step2)){
                break;
            }
        }
    }
}



