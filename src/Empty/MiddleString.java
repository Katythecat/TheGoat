package Empty;

public class MiddleString {
    public static void main(String[] args) {
        String str="Milo and the Dragon";
        if(!str.isEmpty()){
            if(str.length()%2!=0&&str.length()>=3){
                int middle=str.length()/2;
                System.out.println("Middle character : "+str.charAt(middle));

            }else{
                System.out.println("Invalid");
            }
        }
    }
}
