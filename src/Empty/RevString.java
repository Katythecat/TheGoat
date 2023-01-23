package Empty;

public class RevString {
    public static void main(String[] args) {
        String str="Miami";
        String rev=" ";
        /*for (int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse string is "+rev);*/

        /*char[] a=str.toCharArray();
        for (int i=a.length-1; i>=0;i--){
            rev=rev+a[i];
        }
        System.out.println("Reverse is "+rev);*/

        StringBuffer sb=new StringBuffer(str);
        System.out.println("Reverse string is "+sb.reverse());



    }


}
