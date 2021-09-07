package org.example;

import java.util.Scanner;
public class SimpleMath {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
     int number1;
     int number2;

    System.out.print("What is the first number? ");
        number1 = reader.nextInt(); //this asks for int input

    System.out.print("What is the second number? ");
        number2 = reader.nextInt(); //this asks for int input

    System.out.println(number1+ " + " +number2 + " = " + (number1+number2));
    System.out.println(number1+ " - " +number2 + " = " + (number1-number2));
    System.out.println(number1+ " * " +number2 + " = " + (number1*number2));
    System.out.println(number1+ " / " +number2 + " = " + (number1/number2));
}
}