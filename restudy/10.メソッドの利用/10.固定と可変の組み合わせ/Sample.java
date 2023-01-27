class Sample {
    public static void main(String[] args) {
        disp("[", "]", 10, 7, 8);
        disp("{", "}", 128, 76);
    }

    private static void disp(String sb, String sa, int... num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(sb + num[i] + sa);
        }
    }
}