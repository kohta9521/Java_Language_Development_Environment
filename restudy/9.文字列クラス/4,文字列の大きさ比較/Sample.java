class Sample {
    public static void main(String[] args) {
        String str1 = "東京都港区";
        String str2 = "東京都港区";
        String str3 = "東京都";
        String str4 = "東京都中央区";

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareTo(str4));
    }
}