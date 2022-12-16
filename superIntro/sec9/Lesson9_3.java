import javax.print.event.PrintJobListener;

class Lesson9_3 {
    public static void main(String[] args) {
        int age = 0;

        if (age >= 20) {
            System.out.println("adult");
        } else if (age == 0) {
            System.out.println("baby");
        } else {
            System.out.println("child");
        }
    }
}