class Sample1 {
    public static void main(String[] args) {
        String msg1 = "Hello";

        char[] c = {'B', 'y', 'e'};
        String msg2 = new String(c);

        String msg3 = new String(msg1);

        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println(msg3);
    }
}