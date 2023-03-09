package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // dealing with x cords
        changeDirectionForX(robot, toX);
        while (toX != robot.getX()) {
            robot.stepForward();
        }

        // dealing with y cords
        changeDirectionForY(robot, toY);
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }

    public void changeDirectionForX(Robot robot, int toX) {
        if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        }
    }

    public void changeDirectionForY(Robot robot, int toY) {
        if (toY > robot.getX()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }
    }
}
