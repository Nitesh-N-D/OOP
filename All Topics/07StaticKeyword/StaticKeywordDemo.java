// ===============================
// Static Keyword – Complete Demo
// ===============================

// NOTE:
// Only ONE public class is allowed per Java file.
// Other classes are non-public (default access).

// ------------------------------------------------
// 1. STATIC VARIABLE (Class Variable)
// ------------------------------------------------
class Student {

    // Instance variable (each object gets its own copy)
    int marks;

    // Static variable (shared by all objects)
    static String schoolName = "ABC School";

    Student(int marks) {
        this.marks = marks;
    }
}

// ------------------------------------------------
// 2. STATIC METHOD
// ------------------------------------------------
class MathUtil {

    // Static method → can be called without creating object
    static int add(int a, int b) {
        return a + b;
    }
}

// ------------------------------------------------
// 3. STATIC vs NON-STATIC ACCESS
// ------------------------------------------------
class DemoAccess {

    int x = 10; // non-static (instance variable)
    static int y = 20; // static (class variable)

    static void staticMethod() {
        // System.out.println(x); ❌ NOT allowed
        System.out.println(y); // ✅ Allowed
    }

    void nonStaticMethod() {
        // Non-static method can access BOTH
        System.out.println(x);
        System.out.println(y);
    }
}

// ------------------------------------------------
// 4. STATIC BLOCK (Runs once when class loads)
// ------------------------------------------------
class StaticBlockExample {

    static int value;

    static {
        value = 100;
        System.out.println("Static block executed");
    }
}

// ------------------------------------------------
// 5. STATIC INNER CLASS
// ------------------------------------------------
class Outer {

    static class Inner {
        void show() {
            System.out.println("Inside static inner class");
        }
    }
}

// ------------------------------------------------
// 6. STATIC METHOD HIDING (NOT OVERRIDING)
// ------------------------------------------------
class Parent {
    static void show() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child static method");
    }
}

// ------------------------------------------------
// 7. MAIN CLASS (Execution starts here)
// ------------------------------------------------
public class StaticKeywordDemo {

    // main() is static because JVM calls it without creating object
    public static void main(String[] args) {

        System.out.println("===== STATIC VARIABLE =====");
        Student s1 = new Student(80);
        Student s2 = new Student(90);

        // Same static variable shared
        System.out.println(Student.schoolName);
        System.out.println(s1.marks);
        System.out.println(s2.marks);

        System.out.println("\n===== STATIC METHOD =====");
        int sum = MathUtil.add(10, 20);
        System.out.println("Sum = " + sum);

        System.out.println("\n===== STATIC vs NON-STATIC =====");
        DemoAccess.staticMethod(); // calling static method

        DemoAccess obj = new DemoAccess();
        obj.nonStaticMethod(); // calling non-static method

        System.out.println("\n===== STATIC BLOCK =====");
        // Static block already executed before this line
        System.out.println("Value = " + StaticBlockExample.value);

        System.out.println("\n===== STATIC INNER CLASS =====");
        Outer.Inner inner = new Outer.Inner();
        inner.show();

        System.out.println("\n===== STATIC METHOD HIDING =====");
        Parent.show(); // Parent version
        Child.show(); // Child version

        Parent p = new Child();
        p.show(); // Still Parent version (NO overriding)
    }
}