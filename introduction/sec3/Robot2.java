class Robot2 {
    public static void main(String[] args){
        Robot2 robot = new Robot2();
        robot.greeting("Hello");
        robot.greeting("Bye");
    }

    void greeting(String msg) {
        System.out.println(msg);
    }
}