import java.util.Arrays;

class Sample1 {
    public static void main(String[] args) {
        int[] src = {12, 24, 18, 31, 17};
        System.out.println(Arrays.toString(src));

        for (int f = 0, l = src.length -1; f < l; f ++, l --) {
            int temp = src[f];
            src[f] = src[l];
            src[l] = temp;
        }

        System.out.println(Arrays.toString(src));
    }
}