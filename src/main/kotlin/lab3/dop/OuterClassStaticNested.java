package lab3.dop;

public class OuterClassStaticNested {
    private static int staticOuterField = 20;

    // Static nested class
    public static class StaticNestedClass {
        public void display() {
            System.out.println("Value of staticOuterField: " + staticOuterField);
        }
    }

    public static void main(String[] args) {
        StaticNestedClass nested = new StaticNestedClass();
        nested.display();
    }
}
