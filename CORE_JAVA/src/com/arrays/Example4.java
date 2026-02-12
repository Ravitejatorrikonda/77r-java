package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter trhe size of an array :");
		int size = Integer.parseInt(sc.nextLine());
		if (size <= 0 || size > 10) {
			System.out.println("Invalid ");
			sc.close();
		} else {
			String[] str = new String[size];
			for (int i = 0; i < size; i++) {
				System.out.println("Enter " + i + " index value : ");
				str[i] = sc.nextLine();
			}
			sc.close();
			System.out.println(Arrays.toString(str));
		}

	}

}
