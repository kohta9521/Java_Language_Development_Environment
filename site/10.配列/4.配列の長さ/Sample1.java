class Sample1 {
    public static void main(String[] args) {
        double[] num = new double[3];

        num[0] = 5.24;
        num[1] = 8.0;
        num[2] = 12.375;

        for (int i = 0; i < num.length; i ++) {
            System.out.println("num[" + i + "] = " + num[i]); 
        }
    }
}