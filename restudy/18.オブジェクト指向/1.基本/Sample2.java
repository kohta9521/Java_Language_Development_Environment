import java.util.*;

class Sample2 {
    public static void main(String[] args) {
        Randamer r = new Randamer(10);

        for (int i = 0; i < 5; i ++) {
            System.out.println(r.getNum());
        }
    }
}

class Randamer {
    private int maxnum;
    private int lastNum;

    public Randamer(int maxnum) {
        this.maxnum = maxnum;
        lastNum = 0;
    }

    public int getNum() {
        int newNum;
        do {
            newNum = (int)Math.ceil(Math.random() * 10);
        } while (newNum == lastNum);

        lastNum = newNum;
        return lastNum;
    }
}