// Define a simple interface with a method
interface MyInterface {
    void myMethod();
}

// Implement the interface in a class
class MyClass implements MyInterface {
    // Implement the method from the interface
    public void myMethod() {
        System.out.println("Implementation of myMethod in MyClass");
    }
}

 class Interface1 {
    public static void main(String[] args) {
        // Create an object of the class that implements the interface
        MyClass myObject = new MyClass();

        // Call the method defined in the interface
        myObject.myMethod();
    }
}
