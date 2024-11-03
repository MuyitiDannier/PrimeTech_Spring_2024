package Hands_On_Lab;

public class Session1AnotherClass {

    String name = "Dan";

    public static void main(String[] args) {
        Session1AnotherClass object1 = new Session1AnotherClass();
        System.out.println(object1.name);
        Session1JavaRefresh object2 = new Session1JavaRefresh();
        System.out.println(object2.name);
        System.out.println(Session1JavaRefresh.ID);
        object2.printName();
    }
}
