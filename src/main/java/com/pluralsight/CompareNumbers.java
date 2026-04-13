package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println(isPositive(9));
    }

    private static boolean isEven(int number) {
//        if (number % 2 == 0) {
//            return true;
//        }else{
//            return false;
//        }
        boolean result = number % 2 == 0;

        return result;
    }

    private static boolean isPositive(double number){
        return number > 0;
    }
}

