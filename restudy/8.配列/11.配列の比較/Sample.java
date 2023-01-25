import java.util.Arrays;

class Sample {
    public static void main(String[] args) {
        int[] a = {85, 78, 92};
        int[] b = a;
        int[] c = {85, 78, 92};

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.equals(a, c));
        System.out.println(Arrays.equals(b, c));
    }
}