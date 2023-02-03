package methods;

public class Main {
    public static void main(String[] args) {

        ThreeMethodsInterface instance = new ThreeMethodsInterface() {
            @Override
            public void do1() {
                System.out.println("Б");
            }

            @Override
            public void do2() {
                System.out.println("Р");
            }

            @Override
            public void do3() {
                System.out.print("У");
            }
        };
        instance.do1();
        instance.do2();
        instance.do3();
    }
}