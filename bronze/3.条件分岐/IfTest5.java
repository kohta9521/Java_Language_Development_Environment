import java.io.Console;

public class IfTest5 {
    public static void main(String[] args) throws Exception {
        Console console = System.console();
        int score = Integer.parseInt(console.readLine());
        if (score < 10 | 100 < score) {
            System.out.println("範囲外です");
        } else {
            System.out.println("範囲内です");
        }
    }
}