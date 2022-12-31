class Sample1 {
    public static void main(String[] args) {
        System.out.println("1から10までの数値で偶数を出力します");

        for (int i = 1; i <= 10; i ++) {
            System.out.print(i + "は");

            if (i % 2 == 0) {
                System.out.println("偶数です");
            }else {
                System.out.println("奇数です");
            }
        }
    }
}