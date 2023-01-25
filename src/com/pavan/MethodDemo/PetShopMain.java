package com.pavan.MethodDemo;

public class PetShopMain {
    public static void main(String[] args) {
        PetShop ps=new PetShop();
        ps.pet();

        String str=ps.pet1();
        System.out.println(str);

        ps.pet2("2 Floors condo",45);
        ps.pet2("3 Floors condo",55);
        ps.pet2("Princess 2 Floors",65);


        System.out.println(ps.pet3("Salmon from Thailand",10));
        System.out.println(ps.pet3("Red tuna from Japan",12));
        System.out.println(ps.pet3("Too fish",5));


    }
}


