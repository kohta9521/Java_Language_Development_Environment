class Sample1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i ++) {
            System.out.println(i + "は");

            if ( i % 2 == 0) {
                System.out.println("偶数です");
            } else {
                System.out.println("奇数です");
            }
        }
    }
}