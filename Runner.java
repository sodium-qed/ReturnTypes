import java.util.Scanner; 
public class Runner
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a radius");

        //Instantiate the scanner
        double radius = keyboard.nextDouble();

        //Take in an input for the radius 
        Circle circle = new Circle(radius);
        //Instantiate the circle
        double area = circle.area();
        //Call the area method to set to the area
        System.out.println("the area is"+area);
        System.out.println("enter a new radius");

        // Update the radius 
        radius = keyboard.nextDouble();      
        circle.updateRadius(radius);
        double circumference = circle.circumference();
        // Call the circumference method to set the circumference
        System.out.println("The circumference is" + circumference);
        System.out.println("enter a height");
        double height = keyboard.nextDouble();           
        double volume = circle.cylinderVolume(height); //Take in input for the height of the cylinder
        System.out.println("The volume is"+volume); //Use the cylinder volume method to calculate the volume of the cylinder
    }
}
