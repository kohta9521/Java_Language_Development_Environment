class Lesson3 {
    public static void main(String[] args) {
        int i = 10;
        long l = 12L;
        double d = 7.28;
        boolean b = true;

        String si =     Integer.valueOf(i).toString();
        String sl=     Long.valueOf(l).toString();
        String sd =     Double.valueOf(d).toString();
        String sb =     Boolean.valueOf(b).toString();

        System.out.println(si);
        System.out.println(sl);
        System.out.println(sd);
        System.out.println(sb);

    }
}