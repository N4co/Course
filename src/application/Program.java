package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Rectangles;


public class Program {
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
           Rectangles rect = new Rectangles();
           
           System.out.println("Enter Rectangles Width and Height");
           
           rect.width = sc.nextDouble();
           rect.height = sc.nextDouble();
           
           System.out.printf("AREA = %.2f%n", rect.area()); 
           System.out.printf("PERIMETER  = %.2f%n", rect.perimeter()); 
           System.out.printf("DIAGONAL  = %.2f%n", rect.diagonal()); 
           
           sc.close();
	}

}
