package Interview_question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount");

		int amount = sc.nextInt();
		int data = amount;
		System.out.println("amount in cash is like a");

		int arr[] = { 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		if (amount<=2000) {
		int count = 0;
		int balance = 0;
		try {
			while (!(amount == 0)) {
				for (int i = 0; i < arr.length; i++) {

					if (amount <= arr[i] && amount >= arr[i + 1]) {

						amount = amount - arr[i+1];
						balance = balance + arr[i+1];

						System.out.println(arr[i+1]);
						break;

					}

				}

			}
		} catch (Exception e) {
			System.out.println(data - balance);

		}
		}
		else 
		{
			System.out.println("Not more than 2000 is allweded by indian bank rule authority");
		}

	}
}
