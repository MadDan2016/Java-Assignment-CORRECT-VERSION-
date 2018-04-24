import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;


public class Calculator implements ActionListener {
    float PI = 3.14159265359f;
    public Calculator() { // Constructor Method - same name as the class - no return type = used to initialize objects

        JFrame frame = new JFrame("Basic Geometry Calculations");
        frame.setSize(800, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(10, 25, 50));
        panel.setLayout(null);
        frame.add(panel);
        JLabel label = new JLabel("Daniel Heelan, Sean Ogoro, Javed Khan, Graham Coughlan");
        label.setForeground(new Color(255, 255, 255));
        label.setBounds(220, -10, 400, 100);
        panel.add(label);

        JButton button1 = new JButton("Area of Square");
        panel.add(button1);
        button1.setBackground(new Color(255, 255, 255));
        button1.setForeground(new Color(0, 0, 0));
        button1.setFocusPainted(false);
        button1.addActionListener(this); // refers to the class object (ActionListener)
        button1.setBounds(10, 60, 180, 50);

        JButton button2 = new JButton("Area of Circle");
        panel.add(button2);
        button2.setBackground(new Color(255, 255, 255));
        button2.setForeground(new Color(0, 0, 0));
        button2.setFocusPainted(false);
        button2.addActionListener(this);
        button2.setBounds(10, 120, 180, 50);

        JButton button3 = new JButton("Area of Rectangle");
        panel.add(button3);
        button3.setBackground(new Color(255, 255, 255));
        button3.setForeground(new Color(0, 0, 0));
        button3.setFocusPainted(false);
        button3.addActionListener(this);
        button3.setBounds(10, 180, 180, 50);

        JButton button4 = new JButton("Perimeter of Square");
        panel.add(button4);
        button4.setBackground(new Color(255, 255, 255));
        button4.setForeground(new Color(0, 0, 0));
        button4.setFocusPainted(false);
        button4.addActionListener(this);
        button4.setBounds(200, 60, 180, 50);

        JButton button5 = new JButton("Perimeter of Circle");
        panel.add(button5);
        button5.setBackground(new Color(255, 255, 255));
        button5.setForeground(new Color(0, 0, 0));
        button5.setFocusPainted(false);
        button5.addActionListener(this);
        button5.setBounds(200, 120, 180, 50);

        JButton button6 = new JButton("Perimeter of Rectangle");
        panel.add(button6);
        button6.setBackground(new Color(255, 255, 255));
        button6.setForeground(new Color(0, 0, 0));
        button6.setFocusPainted(false);
        button6.addActionListener(this);
        button6.setBounds(200, 180, 180, 50);

        JButton button7 = new JButton("Surface Area of Cylinder");
        panel.add(button7);
        button7.setBackground(new Color(255, 255, 255));
        button7.setForeground(new Color(0, 0, 0));
        button7.setFocusPainted(false);
        button7.addActionListener(this);
        button7.setBounds(390, 60, 180, 50);

        JButton button8 = new JButton("Surface Area of Cone");
        panel.add(button8);
        button8.setBackground(new Color(255, 255, 255));
        button8.setForeground(new Color(0, 0, 0));
        button8.setFocusPainted(false);
        button8.addActionListener(this);
        button8.setBounds(390, 120, 180, 50);

        JButton button9 = new JButton("Surface Area of Sphere");
        panel.add(button9);
        button9.setBackground(new Color(255, 255, 255));
        button9.setForeground(new Color(0, 0, 0));
        button9.setFocusPainted(false);
        button9.addActionListener(this);
        button9.setBounds(390, 180, 180, 50);

        JButton button10 = new JButton("Volume of Cylinder");
        panel.add(button10);
        button10.setBackground(new Color(255, 255, 255));
        button10.setForeground(new Color(0, 0, 0));
        button10.setFocusPainted(false);
        button10.addActionListener(this);
        button10.setBounds(580, 60, 180, 50);

        JButton button11 = new JButton("Volume of Cone");
        panel.add(button11);
        button11.setBackground(new Color(255, 255, 255));
        button11.setForeground(new Color(0, 0, 0));
        button11.setFocusPainted(false);
        button11.addActionListener(this);
        button11.setBounds(580, 120, 180, 50);

        JButton button12 = new JButton("Volume of Sphere");
        panel.add(button12);
        button12.setBackground(new Color(255, 255, 255));
        button12.setForeground(new Color(0, 0, 0));
        button12.setFocusPainted(false);
        button12.addActionListener(this);
        button12.setBounds(580, 180, 180, 50);
    }

    public void actionPerformed(ActionEvent e) { // Method for ActionListener which passes an ActionEvent object as its argument
        String btn = e.getActionCommand();

        if (btn.equals("Area of Square")) {
            String sideSquareAsString = JOptionPane.showInputDialog("Please enter the side of the square");
            float resultSideSquare = Float.parseFloat(sideSquareAsString);
            JOptionPane.showMessageDialog(null, "The area of the square is " + areaOfSquare(resultSideSquare) + ".", "", JOptionPane.INFORMATION_MESSAGE);
        } 
		else if (btn.equals("Area of Circle")) {
            String radiusAsString = JOptionPane.showInputDialog("Please enter the radius of the circle");

            float radius = Float.parseFloat(radiusAsString);

            JOptionPane.showMessageDialog(null, "The area of the circle is: " + areaOfCircle(radius), "Area of Circle", JOptionPane.INFORMATION_MESSAGE);
        }
		else if (btn.equals("Area of Rectangle")) {
            String lengthAsString = JOptionPane.showInputDialog("Please enter the length of the rectangle: ");
            String widthAsString = JOptionPane.showInputDialog("Please enter the width of the rectangle: ");

            float length = Float.parseFloat(lengthAsString);
            float width = Float.parseFloat(widthAsString);

            JOptionPane.showMessageDialog(null, "The area of the rectangle is: " + areaOfRectangle(length, width), "Area of Rectangle", JOptionPane.INFORMATION_MESSAGE);
        } 
		else if (btn.equals("Perimeter of Square")) {
            String sideAsString = JOptionPane.showInputDialog("Please enter the side of the square: ");

            float side = Float.parseFloat(sideAsString);

            JOptionPane.showMessageDialog(null, "The perimeter of the square is: " + perimeterOfSquare(side), "Perimeter of Rectangle", JOptionPane.INFORMATION_MESSAGE);
        }
		else if (btn.equals("Perimeter of Circle")) {
            String radiusAsString = JOptionPane.showInputDialog("Please enter the radius of the circle: ");

            float radius = Float.parseFloat(radiusAsString);

            JOptionPane.showMessageDialog(null, "The perimeter of the circle is: " + String.format("%.2f", (perimeterOfCircle(radius))), "Perimeter of Circle", JOptionPane.INFORMATION_MESSAGE);
        } 
		else if (btn.equals("Perimeter of Rectangle")) {
            String lengthAsString = JOptionPane.showInputDialog("Please enter in the length of your rectangle.");
            String widthAsString = JOptionPane.showInputDialog("Please put in the width of your rectangle.");

            float length = Float.parseFloat(lengthAsString);
            float width = Float.parseFloat(widthAsString);

            JOptionPane.showMessageDialog(null, "The perimeter of the rectangle is: " + String.format("%.2f", (perimeterOfRectangle(length, width))), "Perimeter of Rectangle", JOptionPane.INFORMATION_MESSAGE);
        } 
		else if (btn.equals("Surface Area of Cylinder")) {
            String radiusAsString = JOptionPane.showInputDialog("Please enter a radius: ");
            String heightAsString = JOptionPane.showInputDialog("Please enter a height: ");

            float radius = Float.parseFloat(radiusAsString);
            float height = Float.parseFloat(heightAsString);

            JOptionPane.showMessageDialog(null, "The surface area of the cylinder is: " + String.format("%.2f", (surfaceAreaOfCylinder(radius, height))), "Surface Area of Cylinder", JOptionPane.INFORMATION_MESSAGE);
        }
		else if (btn.equals("Surface Area of Cone")) {
            String radiusAsString = JOptionPane.showInputDialog("Please enter a radius.");
            String heightAsString = JOptionPane.showInputDialog("Please enter a height.");

            float radius = Float.parseFloat(radiusAsString);
            float height = Float.parseFloat(heightAsString);

            JOptionPane.showMessageDialog(null, "The surface area of the cone is: " + String.format("%.2f", (surfaceAreaOfCone(radius, height))), "Surface Area of Cone", JOptionPane.INFORMATION_MESSAGE);
        } 
		else if (btn.equals("Surface Area of Sphere")) {
            String radiusAsString = JOptionPane.showInputDialog("Please enter a radius: ");

            float radius = Float.parseFloat(radiusAsString);

            JOptionPane.showMessageDialog(null, "The surface area of the sphere is: " + String.format("%.2f", (surfaceAreaOfSphere(radius))), "Surface Area of Cone", JOptionPane.INFORMATION_MESSAGE);
        } 
		else if (btn.equals("Volume of Cylinder")) {
            String radiusAsString = JOptionPane.showInputDialog("Please enter the radius of the cylinder: ");
            String heightAsString = JOptionPane.showInputDialog("Please enter the height of the cylinder ");

            float radius = Float.parseFloat(radiusAsString);
            float height = Float.parseFloat(heightAsString);

            JOptionPane.showMessageDialog(null, "The volume of the cylinder is: " + String.format("%.2f", (volumeOfCylinder(radius, height))), "Volume of Cylinder", JOptionPane.INFORMATION_MESSAGE);
        } 
		else if (btn.equals("Volume of Cone")) {
            String radiusAsString = JOptionPane.showInputDialog("Please enter the radius of the cone: ");
            String heightAsString = JOptionPane.showInputDialog("Please enter the height of the cone ");

            float radius = Float.parseFloat(radiusAsString);
            float height = Float.parseFloat(heightAsString);

            JOptionPane.showMessageDialog(null, "The volume of the cylinder is: " + String.format("%.2f", (volumeOfCone(radius, height))), "Volume of Cone", JOptionPane.INFORMATION_MESSAGE);
        } 
		else if (btn.equals("Volume of Sphere")) {
            String radiusAsString = JOptionPane.showInputDialog("Please enter the radius of the sphere: ");

            float radius = Float.parseFloat(radiusAsString);

            JOptionPane.showMessageDialog(null, "The volume of the Sphere is: " + String.format("%.2f", (volumeOfSphere(radius))), "Volume of Sphere", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static float areaOfSquare(float side) {
        float result = side * side;

        return result;
    }

    public static float areaOfCircle(float radius) {
        float PI = 3.14159265359f;
        float result = PI * radius * radius;

        return result;
    }

    public static float areaOfRectangle(float width, float length) {
        float result = width * length;

        return result;
    }

    public static float perimeterOfSquare(float side) {
        float result = 4 * side;

        return result;
    }

    public static float perimeterOfCircle(float radius) {
        float PI = 3.14159265359f;
        float result = 2 * PI * radius;

        return result;
    }

    public static float perimeterOfRectangle(float width, float length) {
        float result = 2 * (length + width);

        return result;
    }

    public static float surfaceAreaOfCylinder(float radius, float height) {
        float PI = 3.14159265359f;
        float result = 2 * PI * radius * height + 2 * PI * radius * radius;

        return result;
    }

    public static float surfaceAreaOfCone(float radius, float height) {
        float PI = 3.14159265359f;
        float result = PI * radius * (radius + (float) Math.sqrt(height * height + radius * radius));

        return result;
    }

    public static float surfaceAreaOfSphere(float radius) {
        float PI = 3.14159265359f;
        float result = 4 * PI * (float) Math.pow(radius, 2);

        return result;
    }

    public static float volumeOfCylinder(float radius, float height) {
        float PI = 3.14159265359f;
        float result = PI * (float) Math.pow(radius, 2) * height;

        return result;
    }

    public static float volumeOfCone(float radius, float height) {
        float PI = 3.14159265359f;
        float result = PI * (float) Math.pow(radius, 2) * height / 3;

        return result;
    }

    public static float volumeOfSphere(float radius) {
        float PI = 3.14159265359f;
        float result = 4.0f / 3.0f * PI * (float) Math.pow(radius, 3);

        return result;
    }

    public static void main(String args[]) {
        new Calculator();
    }
}
