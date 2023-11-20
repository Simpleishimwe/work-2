// Define an interface with a method and a constant
interface Printable {
    void print();  // Method declaration

    String TYPE = "Printer";  // Constant declaration (implicitly public, static, and final)
}

// Implement the interface in a class
class Printer implements Printable {
    // Implement the method from the interface
    public void print() {
        System.out.println("Printing with " + TYPE);
    }
}

 class Interface2 {
    public static void main(String[] args) {
        // Create an object of the class that implements the interface
        Printer myPrinter = new Printer();

        // Call the method and access the constant from the interface
        myPrinter.print();
        System.out.println("Printer type: " + Printable.TYPE);
    }
}
