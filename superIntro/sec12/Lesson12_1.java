class Student {
    String name = "sato";

    public void calculateAVG(int math, int english) {
        System.out.println((math + english) / 2);
    }
}



class Lesson12_1 {
    public static void main(String[] args) {
        Student a001 = new Student();
        a001.name = "sato";

        System.out.println(a001.name);

    }
}