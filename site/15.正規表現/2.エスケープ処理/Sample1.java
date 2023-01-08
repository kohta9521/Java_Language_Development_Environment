import java.util.*;

class Sample1 {
    public static void main(String[] args) {
        String regex = "a\\.b";
        Pattern p = Pattern.compile(regex);

        Matcher m1 = p.matcher("a.b");
        System.out.println(m1.matches());

        Matcher m2 = p.matcher("axb");
        System.out.println(m2.matches());
    }
}