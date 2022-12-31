class Sample1 {
    public static void main(String[] args) {
        hello();
        bye();
        hellobye();
    }

    private static void hello() {
        System.out.println("Hello");
    }

    private static void bye() {
        System.out.println("Bye");
    }

    private static void hellobye() {
        hello();
        bye();
    }
}