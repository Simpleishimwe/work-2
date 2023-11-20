// Parent class
class Shape {
    // Method in the parent class
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Child class inheriting from Shape
class Circle extends Shape {
    // Additional method in the child class
    void computeArea() {
        System.out.println("Computing the area of the circle");
    }
}

 class single2 {
    public static void main(String[] args) {
        // Creating an object of the child class
        Circle myCircle = new Circle();

        // Calling methods from the parent class
        myCircle.draw();

        // Calling method from the child class
        myCircle.computeArea();
    }
}
