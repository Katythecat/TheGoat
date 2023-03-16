package YouTube;

public class LargestOf3Num {
    public static void main(String[] args) {
        int a=110;
        int b=150;
        int c=20;

        if(a>b&&a>c){
            System.out.println(a+" Is largest number");
        }else if(b>c&&b>a){
            System.out.println(b+" Is largest number");
        }else{
            System.out.println(c+" Is largest number");
        }
    }
}
