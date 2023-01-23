package Empty;

import java.util.Scanner;

public class Scanner2DarrrayInt {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many rows you want to enter");
        int rows=scan.nextInt();
        System.out.println("How many columns you want ot enter");
        int columns=scan.nextInt();
        int[][] arr=new int[rows][columns];
        for (int i=0;i<rows;i++){
            System.out.println(i+1+ " row data");
            for (int j = 0; j < columns; j++) {
                System.out.println(j+1+ " cols data");
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println("--------");
        System.out.println("After set all data in arr");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
