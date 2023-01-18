class Robot2 {
    int currentPosition = 0;
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.report();
        robot.moveForward();
        robot.report();
    }

    void report() {
        System.out.println("Current Position = " + currentPosition);
    }

    void moveForward() {
        currentPosition = currentPosition + 1;
    }
}