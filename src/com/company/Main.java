package com.company;

import java.util.Scanner;

public class Main {
    private static String name="";
    public static void main(String[] args) {
	System.out.println("Enter your name: ");
	Scanner in = new Scanner(System.in);
	name = in.nextLine();
	System.out.println("Your name is "+name);
    }
}
