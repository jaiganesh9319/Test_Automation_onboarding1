package jai.jai;

//The CandyMaker class has two attributes, empty and boiled, which represent the state of the candy maker.
//Initially, the constructor is private to ensure no external class can create an instance directly. The constructor sets the empty flag to true and boiled to false.

public class CandyMaker {

    private boolean empty;
    private boolean boiled;
    
    // Step 1: Create a private static instance variable of CandyMaker
//    This static variable holds the single instance of the class. 
//    Initially, it is null, and only one instance will ever be assigned to it during the lifetime of the program. 
//    Since it's static, it belongs to the class and is shared across all objects of the class.
    
    private static CandyMaker uniqueInstance;

    // Step 2: Make the constructor private so it cannot be called outside this class
//    By making the constructor private, we prevent other classes from creating an instance of CandyMaker using the new keyword. 
//    This ensures that the only way to create an object is through the getInstance() method.
    
    private CandyMaker() {
        empty = true;
        boiled = false;
    }

    // Step 3: Provide a public static method to get the single instance
    // Use synchronized for thread safety
//    The getInstance() method provides a controlled way to access the single instance of the CandyMaker class.
//    The method checks if the instance (uniqueInstance) is null. 
//    If it is, the class is synchronized (using the synchronized keyword) to ensure that no two threads can enter this block at the same time.
//    Double-checked locking: Inside the synchronized block, it checks again if the instance is null. 
//    If it's still null, it creates a new instance of CandyMaker. 
//    This ensures that the instance is only created once, even when multiple threads try to access it at the same time.
    
//    The getInstance() method checks if an instance of CandyMaker already exists. If it doesn’t (i.e., uniqueInstance == null), it creates the instance.
//    This method uses double-checked locking, which helps to avoid the overhead of synchronization after the object is initialized.
    
    public static CandyMaker getInstance() {
        if (uniqueInstance == null) {
            synchronized (CandyMaker.class) {
                if (uniqueInstance == null) { // Double-checked locking
                    uniqueInstance = new CandyMaker();
                }
            }
        }
        return uniqueInstance;
    }
    
//    The use of the synchronized keyword ensures that even in a multithreaded environment, only one thread can create the instance, while other threads will have to wait if they try to access the synchronized block.
//    Once the instance is created, subsequent calls to getInstance() will bypass the synchronization, as the instance will no longer be null, making the access more efficient after initialization.
    
//    The synchronized block ensures thread safety, which is crucial in multithreaded applications where multiple threads might try to access the getInstance() method simultaneously.
//    The double-checked locking ensures that the instance is created only once. After the instance is created, subsequent calls do not enter the synchronized block, improving performance.
    
    
    // Method to fill the boiler, it must be empty to fill it
    // Fills the candy maker only when it’s empty.
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // Fill the candyMaker with ingredients
            System.out.println("Filling the candy maker with milk and chocolate mix.");
        }
    }

    // Method to drain the boiler, it must be full and boiled
    // Drains the candy maker only if it’s full and boiled
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // Drain the boiled content
            empty = true;
            System.out.println("Draining the boiled milk and chocolate.");
        }
    }

    // Method to boil the mixture, the boiler must be full and not already boiled
    // Boils the content if it’s full and hasn’t been boiled yet
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // Boil the content
            boiled = true;
            System.out.println("Boiling the milk and chocolate mixture.");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
