package com.pavan.MethodDemo;

public class ConstructorOverloading4 {

    int x,y;
    double d;

    ConstructorOverloading4(){
        x=10;
        y=20;
    }
    ConstructorOverloading4(int a, int b){
        x=a;
        y=b;
    }
    ConstructorOverloading4(int a, double b){
        x=a;
        d=b;
    }
    ConstructorOverloading4(double b, int a){
        x=a;
        d=b;
    }
    void show(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(d);
    }
    public static void main(String[] args) {
        /*ConstructorOverloading4 co=new ConstructorOverloading4();
        co.show();// 10 20 0.0*/

        /*ConstructorOverloading4 co=new ConstructorOverloading4(44,55);
        co.show();// 44 55 0.0*/

        /*ConstructorOverloading4 co=new ConstructorOverloading4(18.25,9);
        co.show();//9 0 18.25*/

        ConstructorOverloading4 co=new ConstructorOverloading4(25,76.54);
        co.show();//25 0 76.54

    }
}
