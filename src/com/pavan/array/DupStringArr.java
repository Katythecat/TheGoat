package com.pavan.array;

public class DupStringArr {
    public static void main(String[] args) {
        String[] str = {"Money", "Cat", "Food", "cat", "Travel", "money"};
        boolean flag = false;
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    System.out.println(str[i] + " This is duplicate array string");
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("We don't have duplicate string");
        }
    }
}

