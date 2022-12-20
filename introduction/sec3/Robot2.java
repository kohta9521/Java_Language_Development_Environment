class Robot2 {
    public static void main(String[] args){
        Robot robot = new Robot();
        robot.greeting("Hello");
        robot.greeting("Bye");
    }

    void greeting(String msg) {
        System.out.println(msg);
    }
}