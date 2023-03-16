package com.pavan.string;

public class StudentGrade {
    public static void main(String[] args) {
        String[][] arr={{"Leo","Nala","GG","Katy"},
                            {"D","C","B","A"}
                            };
        for(int i=0;i<arr.length;i++){
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j].equals("A")||arr[i][j].equals("B")){
                    System.out.println(arr[0][j]);
                }

            }

        }

    }
}
