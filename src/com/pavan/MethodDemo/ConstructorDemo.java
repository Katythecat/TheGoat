package com.pavan.MethodDemo;

public class ConstructorDemo {
    int a, b;
    String s;

   /* ConstructorDemo() {
        a = 10;
        b = 20;
        s = "Hell Yeah";
    }*/

    ConstructorDemo(int a, int b, String s){
        this.a=a;
        this.b=b;
        this.s=s;
    }
        void show(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(s);
        }

    public static void main(String[] args) {
       // ConstructorDemo cd=new ConstructorDemo();
        //cd.show();
        ConstructorDemo cd=new ConstructorDemo(50,100,"bags");
      cd.show();
    }
}
