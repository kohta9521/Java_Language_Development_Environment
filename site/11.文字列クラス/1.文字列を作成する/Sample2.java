class Sample2 {
    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = msg1;

        System.out.println(msg1);
        System.out.println(msg2);


        System.out.println("-----------");

        msg2 = "Bye!";
        System.out.println(msg1);
        System.out.println(msg2);

    }
}