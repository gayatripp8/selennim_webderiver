package javapgm;

import java.util.Scanner;

public class kmtomiles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your km");
		double km=sc.nextDouble();
		
		double miles =km*0.621371;
		System.out.println("Distnce in miles:"+miles);
	}

}
