package com.accountbank;

public class TestExceptions {
    public static void main(String[] args) {
        System.out.println("Main start");
        try {
            method1();
        } catch (Exception ex) {
            //System.out.println("Arithmetic error: " + ex.getMessage());
            //System.out.println("Stack Trace:");
            ex.printStackTrace();
        }
        System.out.println("End of Main");
    }

    private static void method1() throws MyExceptions {
        System.out.println("Method1 start");
        try {
            method2();
        } catch (MyExceptions exception) {}
        System.out.println("End of method1");
    }

    private static void method2() throws MyExceptions{
        System.out.println("Method2 start");
        System.out.println("Testing exception:");
        //NullPointerException ex = new NullPointerException("Error, you can't use null!");
        //throw ex;
        throw new MyExceptions("Error, you can't use null!");

        //for(int i = 1; i <= 5; i++) {
        //    System.out.println(i/0);
        //}
        //System.out.println("End of method2");
    }

}
