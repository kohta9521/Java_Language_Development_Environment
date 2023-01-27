class Smaple {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("引数を2つ指定してください");
            System.out.println("sample 値1 値2");
            System.exit(1);
        }

        System.out.println("[ "  + args[0] + " ]");
        System.out.println("[ "  + args[1] + " ]");
    }
}