package YouTube;

public class CountNumEvenOdd {
    public static void main(String[] args) {
        int num=112244;
        int sumEven=0;
        int sumOdd=0;
        while(num>0){
            num=num/10;
            if(num%2==0){
                sumEven++;
            }else{
                sumOdd++;
            }
        }
        System.out.println("Sum of even number:"+sumEven);
        System.out.println("Sum of odd number:"+sumOdd);
    }
}
