package lab3.dop;

public class OuterClassInner {
    private int outerField = 10;

    // Inner class
    public class InnerClass {
        public void display() {
            System.out.println("Value of outerField: " + outerField);
        }
    }

    public void outerMethod() {
        InnerClass inner = new InnerClass();
        inner.display();
    }

    public static void main(String[] args) {
        OuterClassInner outer = new OuterClassInner();
        outer.outerMethod();
    }
}

