package com.pavan.string;

public class MidString {
    public static void main(String[] args) {
        String a = "Thailand";
        if (!a.isEmpty()) {
            if (a.length() % 2 != 0 && a.length() > 3) {
                int middle = a.length() / 2;
                System.out.println("The middle word is " + a.charAt(middle));
            } else {
                System.out.println("Invalid word");
            }
        }
    }
}
