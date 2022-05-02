package main;
/**
 * Cube class that calculates surface area and volume 
 * @author simon
 *
 */
public class Cube {
	private double sideLength;
	
	/**
	 * Constructor
	 * @param sideLength the value of side of a cube. 
	 */
	public Cube(double sideLength) {
		this.sideLength = sideLength;
	}
	
	/**
	 * calculates the surface area of a cube by 
	 * multiplying 6 with side length twice.
	 * @return surface area 
	 */
	public double surfaceArea() {
		return 6 * sideLength * sideLength;
	}
	
	/**
	 * calculates the volume of a cube by 
	 * multiplying side length by itself 3 times. 
	 * @return volume
	 */
	public double volume() {
		return sideLength * sideLength * sideLength;
	}
}
