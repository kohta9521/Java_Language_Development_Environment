class Robot {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.hello();
        robot.bye();
    }

    void hello() {
        System.out.println("Hello");
    }

    void bye() {
        System.out.println("Bye");
    }
}