package com.pavan.exception.handling;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program is started");
        System.out.println("Program is in progress");
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        Thread.sleep(5000);
        
        System.out.println("Program is finished");
        System.out.println("Program is terminated");
    }
}
