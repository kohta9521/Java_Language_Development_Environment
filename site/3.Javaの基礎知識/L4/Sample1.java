class Sample4 {
    public static void main(String[] args) {
        /**
         *  この部分はコメント
         */
        int sum = 0;

        // 10回繰り返す
        for (int i = 1; i <= 10; i ++) {
            sum = sum + i;
        }

        /*
         * 集計した結果を画面に出力する
         */
        System.out.println(sum);
    }
}