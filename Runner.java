Import java.util.Scanner; 
public class Runner
{
    public static void main
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a radius");
        double radius = keyboard.nextDouble();
        Circle circle = new Circle(radius);
        area = circle.area()
        System.out.println("the area is"+area)
        System.out.println("enter a new radius");
        radius = keyboard.nextDouble();      
        circle.updateRadius(radius);
        circumference = circle.circumference();
        System.out.println("The circumference is" + circumference);
        System.out.println("enter a height");
        double height = keyboard.nextDouble();           
        double volume = circle.cylinderVolume(height);
        System.out.println("The volume is"+volume) 
    }
}
