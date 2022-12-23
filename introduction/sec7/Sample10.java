class Sample10 {
    public static void main(String[] args) {

        Outer:
        for (int i = 1; i < 6; i ++) {


            Inner:
            for (int j = 1; j < 6; j ++) {
                if (i * j % 4 == 0) {
                    continue Outer;
                }

                System.out.println(i + "*" + j + " = " + i + j);
            }

            System.out.println("Next");
        }

        System.out.println("End");
    }
}