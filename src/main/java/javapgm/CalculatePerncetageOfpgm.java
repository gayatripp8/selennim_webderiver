package javapgm;

import java.util.Scanner;

public class CalculatePerncetageOfpgm {

	public static void main(String[] args) {
		System.out.println("Take input as marks obtained in subject from user");
		Scanner sc=new Scanner(System.in);
		System.out.println("Ennter the marks obtained in Math subject");
		int a=sc.nextInt();
			
		System.out.println("Ennter the marks obtained in Englsih subject");
		int b=sc.nextInt();
			
		System.out.println("Ennter the marks obtained in  science subject");
		int c=sc.nextInt();
		
		System.out.println("Ennter the marks obtained in hindi subject");
		int d=sc.nextInt();

		double percentage=(a+b+c+d)/400.0*100;
		System.out.println("Calculation of percentage is:"+percentage);
	}

}
