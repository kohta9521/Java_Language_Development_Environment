import java.util.Arrays;

class Sample2 {
    public static void main(String[] args) {
        int[][] a = {{10, 8}, {9, 14}};
        int[][] b = a;
        int[][] c = {{10, 8}, {9, 14}};

        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.equals(b, c));
        System.out.println(Arrays.equals(a, c));
        System.out.println(Arrays.deepEquals(a, b));
        System.out.println(Arrays.deepEquals(a, c));
        System.out.println(Arrays.deepEquals(b, c));
    }
}