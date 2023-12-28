package com.Mycalculator.ThreeLayer;
import java.util.Scanner;

public class CalculatorSolution1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);


		// UPCASTING --> ABTRACTION
		MyCalculator m1=new CalculatorClass1();

		while(true) {
			//menu driver program
			System.out.println("1.Mod Oparetion\n2.addition\n3.subtraction");
			System.out.println("4.multiplecation\n5.division\n6.Exit");
			System.out.println("---------");
			System.out.println("ENTER THE CHOICE");

			int choice=scan.nextInt(); 

			// the default values of local variable are not null, we should initializing to 0
			int a=0;
			int b=0;
			if(choice>=1 && choice<=5)
			{	
				System.out.println(" ENTER FIRST VALUES");
				a=scan.nextInt();
				System.out.println("ENTER SECOND VALUES");
				b=scan.nextInt();
			}
			switch(choice)
			{
			case 1:
				System.out.println("Mod of "+a+" and "+b+" is "+m1.mod( a, b));
				System.out.println();
				break;
			case 2:
				System.out.println("Add of "+a+" and "+b+" is "+m1.add( a, b));
				System.out.println();
				break;
			case 3:
				System.out.println("Sub of "+a+" and "+b+" is "+m1.sub( a, b));
				System.out.println();
				break;
			case 4:
				System.out.println("Mul of "+a+" and "+b+" is "+m1.mul( a, b));
				System.out.println();
				break;
			case 5:
				System.out.println("Div of "+a+" and "+b+" is "+m1.div( a, b));
				System.out.println();
				break;
			default:
				System.out.println("INVALID CHOICE...!");	
				System.out.println();
				System.out.println("-----------------");
				System.exit(0);
			}

		}

	}

}
