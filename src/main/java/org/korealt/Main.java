package org.korealt;


public class Main {
    public static void main(String[] args) {


        System.out.println("== 3번 문제 ==");


        int firstnumber = 0;
        int secondnumber = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print(firstnumber + " ");

            int nextnumber = firstnumber + secondnumber;
            firstnumber = secondnumber;
            secondnumber = nextnumber;

        }
    }
}