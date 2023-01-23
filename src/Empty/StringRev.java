package Empty;

public class StringRev {
    public static void main(String[] args) {
        String s="Miss Universe";
        String rev=" ";
       /* for (int i = s.length()-1;i>=0;i--) {
            rev=rev+s.charAt(i);
        }
       System.out.println(rev);*/

        //StringBuffer is a class
        //StringBuffer is mutable= allows the valur of the sequence to be modified
        // after it is created

        //String is immutable - each time it is modified a new object is created
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse());




    }
}
