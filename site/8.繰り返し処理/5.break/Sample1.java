class Sample1 {
    public static void main(String[] args) {
        int num = 1;

        for(int i = 0; i < 30; i ++) {
            num *= 5;
            System.out.println("num = " + num);

            if (num > 10000) {
                System.out.println("Over 10000");
                break;
            }
        }
    }
}