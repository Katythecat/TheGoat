package com.pavan.MethodDemo;

public class OverLoadingDemo {

        //we can create multiple method and method name should be the same
        //inside the () we can put whatever we want but shouldn't duplicate
        //( ), (int a, int b), (int b, int a), (int a , double b)
        int x,y,z;
        double d;

        void sum(){
            x=10;
            y=20;
            System.out.println(x+y);
        }
        void sum(int a, int b){//definition should be different
            x=a;
            y=b;
            System.out.println(x+y);
        }
    void sum(int a, double b){
        x=a;
        d=b;
        System.out.println(x+d);
    }
    void sum(double b, int a){
        d=b;
        x=a;
        System.out.println(x+d);
    }

    public static void main(String[] args) {

            OverLoadingDemo ol=new OverLoadingDemo();
            //user point of view they can see only this part
        //overloading one thing can have many forms
        //convenient for user
            ol.sum();
            ol.sum(20,40);
            ol.sum(15.5,20);
            ol.sum(25,16.8);

    }
}
