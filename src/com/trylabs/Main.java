package com.trylabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите число для проверки делится ли оно на 3:");
        Scanner scanner = new Scanner(System.in);
       int n=scanner.nextInt();
       int temp=n/3;
       if (n==(temp*3)){
        System.out.println("число делится на 3");

    }
    else {
           System.out.println("не делится на 3");
       }
    }
}
