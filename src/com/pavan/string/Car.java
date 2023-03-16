package com.pavan.string;

public class Car {
    public static void main(String[] args) {
        String[][] car={{"Tesla","Ford","GMC"},{"BMW","Audi","Volvo"},{"Kia","Hyundai"},
                {"Toyota","Honda"}};
/*
        for (int i = 0; i <car.length ; i++) {
            for (int j = 0; j <car[i].length ; j++) {
                System.out.print(car[i][j]+" ");
            }
            System.out.println();*/

        for(String[] s:car){
            for(String c:s){
                System.out.print(c+" ");
            }
            System.out.println();

        }
    }
}
