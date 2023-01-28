import java.util.*;

public class CatApp{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        final String[] TYPES = {"黒", "白", "茶トラ"};
        ArrayList<Cat> list = new ArrayList<>();
    }
}

class Cat {
    String name;
    String type;
    int intimacy=0;
    
    Cat(String name, String type) {
        this.name=name;
        this.type=type;
    }

    String showStatus() {
        return String.format("%s[%s}(%d)",this.name,type,this.intimacy);
    }

    void play() {
        System.out.println(this.name + "と遊んだ");
        System.out.println("...");
        System.out.println(this.name + "の親密度がアップした");
        this.intimacy++;
    }
}