// практика 1
interface Interface30 {
    // default метод
    default void print() {
        System.out.println("default method");
    }
    // static метод
    static void show() {
        System.out.println("static method");
    }
}

class Test30 implements Interface30 {
    // переопределение default метода
    @Override
    public void print() {
        System.out.println("print из Test30");
    }
}

// практика 2 одинаковые default методы
interface A30 {
    default void hello() {
        System.out.println("hello from A30");
    }
}

interface B30 {
    default void hello() {
        System.out.println("hello from B30");
    }
}

// ошибка без переопределения hello()

class C30 implements A30, B30 {
    @Override
    public void hello() {
        // выбор конкретного метода
        A30.super.hello();
        B30.super.hello();
        System.out.println("hello from C30");
    }
}

public class Java30 {
    public static void main(String[] args) {
        // вызов default метода
        Test30 obj = new Test30();
        obj.print();
        // вызов static метода
        Interface30.show();
        // одинаковые default методы
        C30 c = new C30();
        c.hello();
    }
}