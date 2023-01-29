import java.util.*;

public class High {
    public static void main(String[] args) {
        int card1 = new Random().nextInt(13) + 1;
        System.out.println("1枚目のカードは" + card1 +  "です!!");

        System.out.println("さて、次のカードはこのカードよりも(High or Low ? >>");
        String ans = new Scanner(System.in).next();
        int card2 = new Random().nextInt(13) + 1;
        System.out.println(card2);
    }
}