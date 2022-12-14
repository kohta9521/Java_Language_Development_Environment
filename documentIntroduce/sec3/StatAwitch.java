public class StatAwitch {
    public static void main(String[] args) {
        int val = 3;
        switch (val) {
            case 1:
                System.out.println("変数vakは1です。");
            case 2:
                System.out.println("変数valは2です。");
            case 3:
                System.out.println("変数valは3です。");
            default:
                System.out.println("変数valは1,2,3いずれでもありません。");
                break;
        }
    }
}