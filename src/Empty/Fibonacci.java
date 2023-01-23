package Empty;

public class Fibonacci {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34
        int n1= 0;
        int n2= 1;
        int n3;

        System.out.print(n1+" "+n2);// 0 1
        for (int i = 0; i <8 ; i++) {
            n3=n1+n2;// 1=0+1/ 2=1+1/ 3=1+2/ 5=2+3/ 8=3+5 / 13=5+8/ 21=8+13/ 34=13+21
            System.out.print(" "+n3);//repeat util n3 <8 round
            n1=n2;
            n2=n3;
        }


    }
}
