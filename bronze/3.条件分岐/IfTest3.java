import java.io.Console;

public class IfTest3 {
    public static void main(String[] args) {
        Console console = System.console();
        int a = Integer.parseInt(console.readLine());
        if ( 100 < a ) {
            System.out.println("エラー");
        } else if (a < 0 ) {
            System.out.println("エラー");
        } else if (10 < a) {
            System.out.println("大きい");
        } else {
            System.out.println("小さい");
        }
    }
}