import javax.swing.*;

public class test{
	public static void main(String args[]){
		
		String sideSquareAsString = JOptionPane.showInputDialog("Please enter the side of the square");
		float resultSideSquare = Float.parseFloat(sideSquareAsString);
		JOptionPane.showMessageDialog(null, "The area of the square is " + areaOfSquare(result) + ".", "", JOptionPane.INFORMATION_MESSAGE);
		
		String radiusCircleAsString = JOptionPane.showInputDialogDialog("Please enter the radius of the circle");
		float resultRadiusCircleAsString = Float.parseFloat(radiusCircleAsString);
		JOptionPane.showMessageDialog(null, "The area of the circle is: " + areaOfCircle(resultAreaCircleAsString), "Area of Circle", JOptionPane.INFORMATION_MESSAGE);
		
		String widthRectangleAsString = JOptionPane.showInputDialogDialog("Please enter the width of the rectangle");
		String lengthRectangleAsString = JOptionPane.showInputDialog("Please enter the length of the rectangle")
		float resultWidthRectangleAsString = Float.parseFloat(widthRectangleAsString);
		float resultLengthRectangleAsString = Float.parseFloat(lengthRectangleAsStringAsString);
		JOptionPane.showMessageDialog(null, "The area of the rectangle is " + areaOfRectangle(widthRectangleAsString, lengthRectangleAsString), "Area of Rectangle", JOptionPane.INFORMATION_MESSAGE);
		

	}

	public static float areaOfSquare(float side){
		float result = side*side;

		return result;

	}
	
	public static float areaOfCircle (float radius){
		float result = String.format("%.2f",(PI * Math.pow(radius, 2)));

		
		return result;
	}
	
	public static float areaOfRectangle (float length, float width){
		float result = width * length

		return result;
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
	
	public static float max (float x, float y){
		float maximum = Math.max(x, y);

		return maximum;
	}
	
	public static float max (float x, float y){
		float maximum = Math.max(x, y);

		return maximum;
	}

}
