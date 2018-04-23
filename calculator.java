import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class test{
	
	public static void main(String args[]){
		
		float PI = 3.14159265359f;
		
		String sideSquareAsString = JOptionPane.showInputDialog("Please enter the side of the square");
		float resultSideSquare = Float.parseFloat(sideSquareAsString);
		JOptionPane.showMessageDialog(null, "The area of the square is " + areaOfSquare(resultSideSquare) + ".", "", JOptionPane.INFORMATION_MESSAGE);
		
		String radiusCircleAsString = JOptionPane.showInputDialog("Please enter the radius of the circle");
		float resultRadiusCircle = Float.parseFloat(radiusCircleAsString);
		JOptionPane.showMessageDialog(null, "The area of the circle is: " + areaOfCircle(resultRadiusCircle), "Area of Circle", JOptionPane.INFORMATION_MESSAGE);
		
		String widthRectangleAsString = JOptionPane.showInputDialog("Please enter the width of the rectangle");
		String lengthRectangleAsString = JOptionPane.showInputDialog("Please enter the length of the rectangle");
		float resultWidthRectangle = Float.parseFloat(widthRectangleAsString);
		float resultLengthRectangle = Float.parseFloat(lengthRectangleAsString);
		JOptionPane.showMessageDialog(null, "The area of the rectangle is " + areaOfRectangle(resultWidthRectangle, resultLengthRectangle), "Area of Rectangle", JOptionPane.INFORMATION_MESSAGE);
		

	}

	public static float areaOfSquare(float side){
		float result = side*side;

		return result;

	}
	
	public static float areaOfCircle (float radius){
		float result = 3.14 * radius * radius

		return result;
	}
	
	public static float areaOfRectangle (float length, float width){
		float result = width * length;

		return result;
	}
	
	public static float perimeterOfSquare (float side){
		float result = 4*side;

		return result;
	}
}
	
	/*public static float max (float x, float y){
		float maximum = Math.max(x, y);

		return maximum;
	}
	
	public static float max (float x, float y){
		float maximum = Math.max(x, y);

		return maximum;
	}
	
	public static float max (float x, float y){
		float maximum = Math.max(x, y);

		return maximum;
	}
	
	public static float max (float x, float y){
		float maximum = Math.max(x, y);

		return maximum;
	}
	
	public static float max (float x, float y){
		float maximum = Math.max(x, y);

		return maximum;
	}
	
	public static float max (float x, float y){
		float maximum = Math.max(x, y);

		return maximum;
	}
	
	public static float max (float x, float y){
		float maximum = Math.max(x, y);

		return maximum;
	}
	
	public static float max (float x, float y){
		float maximum = Math.max(x, y);

		return maximum;
	}
*/
