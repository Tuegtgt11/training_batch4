import inheritance.SubClass;
import inheritance.SuperClass;
import interface_demo.ClassUsingInterface;

public class Main {
    public final static int finalInt = 10; // const

    public static void main(String[] args) {
        inheritanceDemo();
        System.out.println("=====================");
        interfaceDemo(20, 100);
        System.out.println("=====================");
        Integer a = 2000;
        Integer b = 2000;
        boolean c = a == b;

        System.out.println(c);

    }

    private static void inheritanceDemo() {
        SubClass subClass = new SubClass();
        SuperClass superClass = new SuperClass();
        System.out.println("Super Class: ");
        System.out.println("Ten: " + superClass.getName());
        System.out.println("Tuoi: " + superClass.getAge());
        System.out.println("Dia chi: " + superClass.getAddress());

        System.out.println("=====================");

        System.out.println("Sub Class: ");
        System.out.println("Ten: " + subClass.getName());
        System.out.println("Tuoi: " + subClass.getAge());
        System.out.println("Dia chi duoc thua huong tu super class: " + subClass.getAddress());
    }

    private static void interfaceDemo(Integer a, int b) {
        ClassUsingInterface classUsingInterface = new ClassUsingInterface();
        System.out.println("a + b = " + classUsingInterface.sum(a, b));
        System.out.println("a - b = " + classUsingInterface.minus(a, b));
    }

    static {
        int staticInt = 100;
    }
}
