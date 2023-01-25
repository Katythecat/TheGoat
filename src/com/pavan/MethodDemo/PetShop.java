package com.pavan.MethodDemo;

public class PetShop {
    //1 on parameter,no return
    void pet() {
        System.out.println("Welcome to Pet Society");
    }

    //2 no params return value
    String pet1() {
        return "We have new cat's condo for special price";
    }

    //3 take params no return value
    void pet2(String type, int price) {
        System.out.println("This is " + type + " and " + price + " $");
    }

    //4 take param and return value
    String pet3(String food, int price) {
        return "This is the new formula " + food + " promotion price " + price + " $";



}

}

