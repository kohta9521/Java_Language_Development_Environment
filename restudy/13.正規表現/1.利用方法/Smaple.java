import java.util.regex.*;

class Sample {
    public static void main(String[] srgs) {
        Pattern p = Pattern.compile("g..d");
        Matcher m = p.matcher("good");

        System.out.println(m.matches());
    }
}