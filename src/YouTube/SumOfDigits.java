package YouTube;

public class SumOfDigits {
    public static void main(String[] args) {
        int num=33225;
        //int emp;
        int sum=0;
        while(num>0){
            //emp=num%10;
            //sum=sum+emp;
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println(sum);
    }
}
