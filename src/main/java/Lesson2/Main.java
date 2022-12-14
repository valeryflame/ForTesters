package Lesson2;

public class Main {
    public static void main(String[] args) {
        //int a = 1 / 0;
        test();
        System.out.println("Method Main");
    }

    public static void test() {
        test1();
        System.out.println("Test");
    }
    public static void test1() {
        test2();
        System.out.println("Test1");
    }
    public static void test2() {
        //int a = 1 / 0;
        //test();
        System.out.println("Test2");
    }
}
