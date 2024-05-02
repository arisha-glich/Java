# Java
here are some important concepts of java 
Certainly! Here's an overview of each of these important concepts in Java:

1. Basics:
   - Java is a high-level programming language developed by Sun Microsystems (now owned by Oracle) in 1995.
   - It is designed to be platform-independent (write once, run anywhere) and is based on the concept of OOP (Object-Oriented Programming).

2. GUI (Graphical User Interface):
   - Java provides libraries like Swing and JavaFX for creating GUI applications.
   - GUI applications in Java involve creating windows, buttons, text fields, and other graphical components to interact with users.

3. Inheritance:
   - Inheritance is a fundamental concept in OOP where a class (subclass/child) can inherit attributes and methods from another class (superclass/parent).
   - It promotes code reusability and supports the "is-a" relationship.

4. Abstract:
   - Abstract classes in Java cannot be instantiated and may contain abstract methods (methods without implementation).
   - Abstract classes are used to provide a template for subclasses and can also contain concrete methods.

5. Interfaces:
   - Interfaces define a contract specifying a set of methods that a class must implement if it implements that interface.
   - Java allows multiple inheritance through interfaces (a class can implement multiple interfaces).

6. File Stream:
   - File I/O (Input/Output) in Java involves reading from and writing to files using streams.
   - Java provides classes like `FileInputStream`, `FileOutputStream`, `BufferedReader`, `BufferedWriter`, etc., for file handling.

7. ArrayList:
   - `ArrayList` is a dynamic array implementation in Java that can grow and shrink dynamically.
   - It provides methods to add, remove, and access elements based on index.

8. Serialization:
   - Serialization in Java is the process of converting an object into a stream of bytes to persist or transmit it across a network.
   - It allows objects to be stored, sent, and reconstructed later in their original state.

9. Exceptions:
   - Exceptions are events that can occur during the execution of a program that disrupts the normal flow of instructions.
   - Java provides a robust exception-handling mechanism using `try-catch` blocks to handle exceptions gracefully.

10. Packages:
    - Packages in Java are used to organize classes and interfaces into namespaces.
    - They help in modularizing code, providing encapsulation, and avoiding naming conflicts.
    - Java provides built-in packages like `java.util`, `java.io`, `java.awt`, etc., and allows creating custom packages.

These concepts form the foundation of Java programming and are essential for developing robust, scalable, and maintainable Java applications. Understanding and mastering these concepts will enable you to build a wide range of software solutions using Java.


There are some differences which my teacher (SIR HASSAN) taught me which i gonna explain there:
//DIFFERENCE BETWEEN FINAL, FINALIZE, FINALLY
final:
final is a keyword in Java that can be applied to classes, methods, and variables.
When applied to a class, it indicates that the class cannot be subclassed (i.e., it's a final class and cannot have subclasses).
When applied to a method, it indicates that the method cannot be overridden by subclasses (i.e., it's a final method and cannot be changed).

finalize:
finalize() is a method in the Object class in Java. It's called by the garbage collector before an object is reclaimed.
The finalize() method can be overridden in a class to perform cleanup operations (like closing resources) before the object is garbage collected.
However, the use of finalize() is discouraged because it's unpredictable and unreliable due to the indeterminate nature of when the garbage collector will run.

finally:
finally is a block in Java used in exception handling with try-catch blocks.
The finally block always executes after the try block, regardless of whether an exception occurs or not.
It's typically used to perform cleanup actions, such as closing files or releasing resources, that must be executed regardless of exceptions.



//PACKAGES ACCESS
                  PUBLIC             PRIVATE              PROTECTED            DEFAULT
Within class        YES                YES                   YES                 YES

Child class         YES                 NO                   YES                 YES
(same pkg)

Child class         YES                 NO                   YES                 YES
(diff pkg)

Non-child class     YES                NO                   NO                  NO
(diff pkg)


//ERRORS TYPES:
SYNTAX ERROR
LOGICAL ERROR
RUNTIME ERROR(EXCEPTION)
Exceptions used for 
----proper termination of program
----meaniful msg to end user



DEFAULT SIZE OF BUFFERINPUT STREAM: 8192


//FILE STREAM
byte by byte
char by char
serialization(save a whole object in file)


