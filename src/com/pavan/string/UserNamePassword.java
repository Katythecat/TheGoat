package com.pavan.string;

import java.util.Scanner;

public class UserNamePassword {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter username");
        String user=input.nextLine();
        System.out.println("Enter password");
        String pass=input.nextLine();
        System.out.println("Confirm password");
        String con=input.nextLine();

        if(user.isEmpty() && pass.isEmpty()) {
            System.out.println("Username and Password cannot be empty");
        }else if(pass.length()<8){
            System.out.println("Password is too short");
        }else if(pass.contains(user)){
            System.out.println("Password cannot contain username");
        }else if(!pass.equals(con)){
            System.out.println("Password do not match");
        }else{
            System.out.println("Your username and Password have been created");
        }
    }
}
