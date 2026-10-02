public class AICircle {
    // Claim: The radius must be stored as a private double instance variable.
    // Evidence: The line declares "private double radius;" with no public getter for the raw field.
    // Reasoning: Private access enforces encapsulation, so the radius can only change through
    //            controlled methods, preventing invalid external modification.
    //
    // Claim: The radius is deliberately hidden from outside classes.
    // Quote: "private double radius;"
    // Means: "private" restricts access to code inside the AICircle class only.
    // Matter: This protects the object's integrity, so no outside code can corrupt the radius value.
    private double radius;

    // Claim: The class needs exactly one constructor that accepts a double and assigns it to radius.
    // Evidence: The only constructor is "public AICircle(double radius)" and it sets "this.radius = radius;".
    // Reasoning: A single constructor guarantees every AICircle is born with a valid radius, avoiding
    //            uninitialized or ambiguous object states.
    //
    // Claim: Every AICircle is created with a defined size from the moment it exists.
    // Quote: "public AICircle(double radius) { this.radius = radius; }"
    // Means: The parameter "radius" is copied into the object's own field on creation.
    // Matter: This ensures no AICircle can exist without a radius, which is essential for valid geometry.
    public AICircle(double radius) {
        this.radius = radius;
    }

    // Claim: The area() method must compute and return the area of the circle.
    // Evidence: It returns "Math.PI * radius * radius", matching the formula π * r².
    // Reasoning: Applying the standard formula to the stored radius produces an accurate area for
    //            the circle's current size.
    //
    // Claim: The area() method translates the geometric definition of a circle's area into code.
    // Quote: "return Math.PI * radius * radius;"
    // Means: The radius is squared and multiplied by π to produce the enclosed space.
    // Matter: This gives callers a precise numeric area, which is the foundation for further calculations
    //         like cylinder volume.
    public double area() {
        return Math.PI * radius * radius;
    }

    // Claim: The circumference() method must compute and return the circle's circumference.
    // Evidence: It returns "2 * Math.PI * radius", matching the formula 2 * π * r.
    // Reasoning: Using the correct formula with the stored radius yields the exact distance around
    //            the circle.
    //
    // Claim: The circumference() method expresses the boundary length of the circle in code.
    // Quote: "return 2 * Math.PI * radius;"
    // Means: The diameter (2r) is multiplied by π to yield the perimeter.
    // Matter: This provides the full distance around the circle, which matters for any problem
    //         involving boundaries or wrapping.
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    // Claim: The cylinderVolume() method must return a cylinder's volume using this circle as its base.
    // Evidence: It returns "area() * height", calling area() first then multiplying by the height parameter.
    // Reasoning: A cylinder's volume equals base area times height, so reusing area() keeps the
    //            calculation consistent instead of duplicating the formula.
    //
    // Claim: The cylinderVolume() method builds a three-dimensional measurement on top of the circle's area.
    // Quote: "return area() * height;"
    // Means: The base area is extended upward by the height to fill a cylinder.
    // Matter: This reuses existing logic, which matters because it keeps the code DRY and consistent.
    public double cylinderVolume(double height) {
        return area() * height;
    }

    // Claim: The updateRadius() method must change the radius and return nothing.
    // Evidence: It is declared "public void updateRadius(double radius)" and assigns "this.radius = radius;".
    // Reasoning: A void return type signals a state change rather than a value, and reassigning the
    //            private field lets callers safely resize the circle.
    //
    // Claim: The updateRadius() method allows the circle's size to be changed after creation.
    // Quote: "public void updateRadius(double radius) { this.radius = radius; }"
    // Means: The new parameter value overwrites the old radius stored in the object.
    // Matter: This matters because objects may need to change over time without being recreated.
    public void updateRadius(double radius) {
        this.radius = radius;
    }
}
