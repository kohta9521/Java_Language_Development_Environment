import java.util.Random;
// import java.util.Scanner;


class Sample5 {
    public static void main(String[] args) {
        int num;
        Random rand = new Random();

        System.out.println("6が出たら終わりです。");

        do {
            num = rand.nextlnt(6) + 1;
            System.out.println("no = " + num);
        } while (num != 6);
    } 
}