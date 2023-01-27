import java.util.regex.*;

class Sample {
    public static void main(String[] args) {
        String regex = "a\\.b";
        Pattern p = Pattern.compile(regex);

        Matcher m1 = p.matcher("a.b");
        System.out.println(m1.matches());
    }
}