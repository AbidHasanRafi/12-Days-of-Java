package package1;

import package2.*;

public class A {
    public static void main(String[] args) {

        // public: visible in all classes in all packages
        // protected: visible to all classes in the same package or classes in other
        // packages that are a subclass
        // default: visible to all classes in the same package
        // private: visible only in the same class

        B b = new B();
        // not visible as it is private
        System.out.println(b.privateMessage);
    }
}
