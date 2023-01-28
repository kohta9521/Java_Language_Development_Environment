public class EnterKey {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("Press Enter Key!!");
        while (true) {
            new java.util.Scanner(System.in).nextLine();
            count ++;
            System.out.print(count);
            if (count == 10) {
                System.out.println();
                break;
            }
        }
    }
}