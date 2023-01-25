package com.pavan.MethodDemo;

public class ThisKeyword5 {
    int x,y; // class variables/ or instance variables / x and y can access everywhere

   /* void setData(int a, int b){// local variables/method variables
        //this variables belong to only in this method
        x=a;//re assigning
        y=b;
    }*/
    /*void setData(int x,int y){
        this.x=x;//this keyword representing class
        this.y=y;
    }*/

    ThisKeyword5(int x, int y){// constructor
        this.x=x;
        this.y=y;
    }

    void show(){
        System.out.println(x);
        System.out.println(y);
    }



    public static void main(String[] args) {

       /*ThisKeyword5 th=new ThisKeyword5();
        th.setData(50,89);
        th.show();*/ //--> this is for this keyword example

        ThisKeyword5 th=new ThisKeyword5(15,35);//this is for constructor example
        th.show();

    }
}
