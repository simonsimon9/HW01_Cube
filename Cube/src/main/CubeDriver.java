package main;

import java.util.Scanner;
/**
 * Driver program to calculate the cube's surface area
 * and volume
 * @author simon
 *
 */
public class CubeDriver {
	/**
	 * Main driver program that requests for user input for
	 * the side length of a cube. 
	 * The program calculates the surface area and volume of cube.
	 * @param args na
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.print("Input number: ");
		double userNumber = userInput.nextDouble();
		Cube cube1 = new Cube(userNumber);
		System.out.println("Surface area: "+ cube1.surfaceArea());
		
		System.out.println("Volume is: "+cube1.volume());
		
		userInput.close();
	}

}
