class Sample {
    public static void main(String[] args) {
        int[][] num = {{87,54,67}, {76, 92, 47}};

        for (int i = 0; i < 2; i ++) {
            for (int j = 0; j < 3; j ++) {
                System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
            }
        }
    }
}