package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int n;
    System.out.print("Please enter a digit: ");

    Scanner scan = new Scanner(System.in);

    n = scan.nextInt();

	double[] fibonacchi = new double[n+1];
	fibonacchi[0] = 0;
	fibonacchi[1] = 1;

	for(int i = 2; i <= n; ++i){
	    fibonacchi[i] = fibonacchi[i-2] + fibonacchi[i-1];


	    if (i == n){
	        System.out.print("Your digit is : "); System.out.println(fibonacchi[i]);
        }

    }
    }
}
