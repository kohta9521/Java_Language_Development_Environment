import java.util.Arrays;

class Sample3 {
    public static void main(String[] args) {
        int[] src = {12, 24, 18, 31, 17};
        System.out.println(Arrays.toString(src));

        for (int f = 0, I = src.length -1; f < I; f ++, I --) {
            int temp = src[f];
            src[f] = src[I];
            src[I] = temp;
        }

        System.out.println(Arrays.toString(src));
    }
}