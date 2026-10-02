// Claim: The program needs Scanner for input. Evidence: `import java.util.Scanner;`. Means: Scanner becomes available. Matter: Without it, the menu cannot read user input.
import java.util.Scanner;

// Claim: Defines the public runner class. Evidence: `public class AIRunner {`. Means: Creates the program container. Matter: Java execution needs a class.
public class AIRunner {

    // Claim: Defines the main entry point. Evidence: `public static void main(String[] args) {`. Means: The JVM starts here. Matter: No main means the program cannot run.
    public static void main(String[] args) {

        // Claim: Creates a Scanner for keyboard input. Evidence: `new Scanner(System.in)`. Means: Allows nextInt and nextDouble calls. Matter: Enables menu choices and measurements.
        Scanner scanner = new Scanner(System.in);

        // Claim: Declares a Circle reference set to null. Evidence: `Circle circle = null;`. Means: No shape is created yet. Matter: Prevents using an uninitialized object.
        Circle circle = null;

        // Claim: Declares height for cylinder mode. Evidence: `double height = 0.0;`. Means: Stores height when needed. Matter: Needed to compute cylinder volume.
        double height = 0.0;

        // Claim: Declares a flag for cylinder mode. Evidence: `boolean isCylinder = false;`. Means: Tracks whether to show volume or area. Matter: Controls correct output after radius update.
        boolean isCylinder = false;

        // Claim: Declares loop control flag. Evidence: `boolean running = true;`. Means: Keeps the menu repeating. Matter: Lets the user perform multiple actions until exit.
        boolean running = true;

        // Claim: Starts the menu loop. Evidence: `while (running) {`. Means: Repeats until running becomes false. Matter: Provides interactive menu behavior.
        while (running) {

            // Claim: Prints the main menu instruction. Evidence: `System.out.println("Please enter a number from 1 to 4 to choose an option:");`. Means: Tells the user to enter 1-4. Matter: Guides input.
            System.out.println("Please enter a number from 1 to 4 to choose an option:");

            // Claim: Prints option 1. Evidence: `System.out.println("1. Create a Circle");`. Means: Shows the circle choice. Matter: Informs the user.
            System.out.println("1. Create a Circle");

            // Claim: Prints option 2. Evidence: `System.out.println("2. Create a Cylinder");`. Means: Shows the cylinder choice. Matter: Informs the user.
            System.out.println("2. Create a Cylinder");

            // Claim: Prints option 3. Evidence: `System.out.println("3. Update the radius");`. Means: Shows the update choice. Matter: Informs the user.
            System.out.println("3. Update the radius");

            // Claim: Prints option 4. Evidence: `System.out.println("4. Exit");`. Means: Shows the exit choice. Matter: Informs the user.
            System.out.println("4. Exit");

            // Claim: Prompts for the menu choice without a newline. Evidence: `System.out.print("Enter your choice (1-4): ");`. Means: Cursor stays on the same line. Matter: Makes the input prompt clear.
            System.out.print("Enter your choice (1-4): ");

            // Claim: Reads the integer choice. Evidence: `int choice = scanner.nextInt();`. Means: Stores the user's menu selection. Matter: Determines which branch runs.
            int choice = scanner.nextInt();

            // Claim: Tests if the choice is 1. Evidence: `if (choice == 1) {`. Means: Enters the circle creation block. Matter: Routes to the correct option.
            if (choice == 1) {

                // Claim: Prompts for the circle radius. Evidence: `System.out.print("Please enter the radius of the circle: ");`. Means: Asks the user for a radius. Matter: Needed to construct the Circle.
                System.out.print("Please enter the radius of the circle: ");

                // Claim: Reads the radius as a double. Evidence: `double radius = scanner.nextDouble();`. Means: Stores the circle radius. Matter: Required for the Circle constructor.
                double radius = scanner.nextDouble();

                // Claim: Creates a Circle object. Evidence: `circle = new Circle(radius);`. Means: Instantiates Circle with the radius. Matter: Enables area calculation.
                circle = new Circle(radius);

                // Claim: Sets the cylinder flag to false. Evidence: `isCylinder = false;`. Means: The current shape is a circle. Matter: Ensures area is shown later.
                isCylinder = false;

                // Claim: Prints the circle area. Evidence: `System.out.println("The area of the circle is " + circle.area());`. Means: Displays the computed area. Matter: Gives the user a result.
                System.out.println("The area of the circle is " + circle.area());

            // Claim: Tests if the choice is 2. Evidence: `} else if (choice == 2) {`. Means: Enters the cylinder creation block. Matter: Routes to the correct option.
            } else if (choice == 2) {

                // Claim: Prompts for the cylinder radius. Evidence: `System.out.print("Please enter the radius of the cylinder: ");`. Means: Asks for the base radius. Matter: Needed for the Circle base.
                System.out.print("Please enter the radius of the cylinder: ");

                // Claim: Reads the cylinder radius. Evidence: `double radius = scanner.nextDouble();`. Means: Stores the radius. Matter: Required for the Circle constructor.
                double radius = scanner.nextDouble();

                // Claim: Prompts for the cylinder height. Evidence: `System.out.print("Please enter the height of the cylinder: ");`. Means: Asks for the height. Matter: Needed for volume.
                System.out.print("Please enter the height of the cylinder: ");

                // Claim: Reads the height. Evidence: `height = scanner.nextDouble();`. Means: Stores the height in the outer variable. Matter: Used in the volume formula.
                height = scanner.nextDouble();

                // Claim: Creates the Circle base. Evidence: `circle = new Circle(radius);`. Means: Instantiates the base circle. Matter: Provides the area for volume.
                circle = new Circle(radius);

                // Claim: Sets the cylinder flag to true. Evidence: `isCylinder = true;`. Means: The current shape is a cylinder. Matter: Ensures volume is shown later.
                isCylinder = true;

                // Claim: Prints the cylinder volume. Evidence: `System.out.println("The volume of the cylinder is " + (circle.area() * height));`. Means: Computes area times height. Matter: Gives the user a result.
                System.out.println("The volume of the cylinder is " + (circle.area() * height));

            // Claim: Tests if the choice is 3. Evidence: `} else if (choice == 3) {`. Means: Enters the radius update block. Matter: Routes to the correct option.
            } else if (choice == 3) {

                // Claim: Checks if the circle is null. Evidence: `if (circle == null) {`. Means: Detects that no shape was created. Matter: Prevents a NullPointerException.
                if (circle == null) {

                    // Claim: Prints an error message. Evidence: `System.out.println("Please create a circle or cylinder first.");`. Means: Informs the user. Matter: Explains why the update cannot happen.
                    System.out.println("Please create a circle or cylinder first.");

                // Claim: Else branch for an existing shape. Evidence: `} else {`. Means: Runs when the circle exists. Matter: Allows the update.
                } else {

                    // Claim: Prompts for the new radius. Evidence: `System.out.print("Please enter the new radius: ");`. Means: Asks for a new value. Matter: Needed for the update.
                    System.out.print("Please enter the new radius: ");

                    // Claim: Reads the new radius. Evidence: `double newRadius = scanner.nextDouble();`. Means: Stores the new radius. Matter: Passed to the update method.
                    double newRadius = scanner.nextDouble();

                    // Claim: Calls updateRadius. Evidence: `circle.updateRadius(newRadius);`. Means: Changes the circle's radius. Matter: Updates the shape data.
                    circle.updateRadius(newRadius);

                    // Claim: Checks cylinder mode. Evidence: `if (isCylinder) {`. Means: Chooses volume output. Matter: Shows the correct result type.
                    if (isCylinder) {

                        // Claim: Prints the updated cylinder volume. Evidence: `System.out.println("The volume of the cylinder is now " + (circle.area() * height));`. Means: Recomputes the volume. Matter: Shows the effect of the update.
                        System.out.println("The volume of the cylinder is now " + (circle.area() * height));

                    // Claim: Else branch for circle mode. Evidence: `} else {`. Means: Runs when not a cylinder. Matter: Shows area instead.
                    } else {

                        // Claim: Prints the updated circle area. Evidence: `System.out.println("The area of the circle is now " + circle.area());`. Means: Recomputes the area. Matter: Shows the effect of the update.
                        System.out.println("The area of the circle is now " + circle.area());

                    // Claim: Closes the inner if-else. Evidence: `}`. Means: Ends the cylinder/circle output choice. Matter: Maintains block structure.
                    }

                // Claim: Closes the else for the null check. Evidence: `}`. Means: Ends the update logic. Matter: Maintains block structure.
                }

            // Claim: Tests if the choice is 4. Evidence: `} else if (choice == 4) {`. Means: Enters the exit block. Matter: Routes to the correct option.
            } else if (choice == 4) {

                // Claim: Prints the goodbye message. Evidence: `System.out.println("Thank you for using the program. Goodbye!");`. Means: Informs the user of exit. Matter: Provides closure.
                System.out.println("Thank you for using the program. Goodbye!");

                // Claim: Sets running to false. Evidence: `running = false;`. Means: Stops the loop. Matter: Ends the program.
                running = false;

            // Claim: Else branch for an invalid choice. Evidence: `} else {`. Means: Handles numbers outside 1-4. Matter: Prevents silent failure.
            } else {

                // Claim: Prints the invalid choice message. Evidence: `System.out.println("Invalid choice. Please enter a number from 1 to 4.");`. Means: Tells the user to retry. Matter: Improves usability.
                System.out.println("Invalid choice. Please enter a number from 1 to 4.");

            // Claim: Closes the invalid else. Evidence: `}`. Means: Ends the if-else chain. Matter: Maintains block structure.
            }

        // Claim: Closes the while loop. Evidence: `}`. Means: Ends the menu repetition. Matter: Maintains block structure.
        }

        // Claim: Closes the Scanner. Evidence: `scanner.close();`. Means: Releases the input resource. Matter: Good resource management.
        scanner.close();

    // Claim: Closes the main method. Evidence: `}`. Means: Ends the main block. Matter: Maintains block structure.
    }

// Claim: Closes the class. Evidence: `}`. Means: Ends the class block. Matter: Maintains block structure.
}