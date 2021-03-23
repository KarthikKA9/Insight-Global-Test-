package com.appservice;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinaryDecimalConversion {

	private final static Logger logger = LoggerFactory.getLogger(BinaryDecimalConversion.class);
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter number- ");  
		int input= sc.nextInt(); 
		
		logger.info("The Final Output in Decimal is {}", binaryReversal(String.valueOf(input)));
	}

	private static int binaryReversal(String strNumber) {
		// Binary to Decimal + Add Padding
		logger.info("Binary representation of : " + strNumber);
		String binary = String.format("%8s", Integer.toBinaryString(Integer.parseInt(strNumber))).replace(" ", "0");
		logger.info(binary);

		// Reverse String
		String reverse = new StringBuilder(binary).reverse().toString();

		// Decimal to binary
		int decimal = Integer.parseInt(reverse, 2);
		return decimal;
	}

}
