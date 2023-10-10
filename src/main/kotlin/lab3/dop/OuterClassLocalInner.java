package lab3.dop;

public class OuterClassLocalInner {
    private int outerField = 30;

    public void outerMethod() {
        class LocalInnerClass {
            public void display() {
                System.out.println("Value of outerField: " + outerField);
            }
        }

        LocalInnerClass inner = new LocalInnerClass();
        inner.display();
    }

    public static void main(String[] args) {
        OuterClassLocalInner outer = new OuterClassLocalInner();
        outer.outerMethod();
    }
}
