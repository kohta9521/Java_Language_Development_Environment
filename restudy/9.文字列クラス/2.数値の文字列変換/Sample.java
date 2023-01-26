class Sample {
    public static void main(String[] args) {
        int i = 10;
        long I = 12L;
        double d = 7.29;
        boolean b = true;

        String si = Integer.valueOf(i).toString();
        String sI = Long.valueOf(I).toString();
        String sd = Double.valueOf(d).toString();
        String sb = Boolean.valueOf(b).toString();

        System.out.println(si);
        System.out.println(sI);
        System.out.println(sd);
        System.out.println(sb);
    }
}