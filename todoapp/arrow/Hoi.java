import java.util.*;

public class Hoi {
    public static void main(String[] args) {
        System.out.println("あっちむいてホイをしましょう!");
        int score = 0;
        while (true) {
            System.out.println("あっちむいてホイ! (上:0・下:1・右:2・左:3)>>");
            int you = new Scanner(System.in).nextInt();
            int pc = new Ramdom().nextInt(4);
            System.out.println("pc:" + pc);
            if (pc == you) {
                System.out.println("アウト!!");
                break;
            }
            score ++;
            System.out.println("セーフ!" + score + "ポイント");
        }
        System.out.println(score + "ポイントでした!!");
    }
}