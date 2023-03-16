package YouTube;

public class CountDigitsNum {
    public static void main(String[] args) {
        int num = 1536985741;
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);

    }
}