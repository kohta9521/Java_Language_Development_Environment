class Sample2 {
    public static void main(String[] args) {
        Outer:
        for (int i = 1; i < 5; i ++) {

            Inner:
            for (int j = 1; j < 5; j ++) {
                System.out.println("i * j =" + i * j);

                if ( i * j > 10) {
                    break Outer;
                }
            }

            System.out.println("Next");
        }
        System.out.println("End");
    }
}