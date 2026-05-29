class Parent {

    String name = "parent";

    void method() {
        System.out.println("метод суперкласса");
    }
}

class Child extends Parent {

    String name = "child";

    // использование this
    void printThis() {
        System.out.println(this.name);
    }

    // использование super
    void printSuper() {
        System.out.println(super.name);
    }

    @Override
    void method() {
        System.out.println("метод подкласса");
    }

    // вызов метода суперкласса
    void callParentMethod() {
        super.method();
    }
}

class A {

    int a1 = 1; // доступ только внутри пакета
    public int a2 = 2; // доступ отовсюду
    protected int a3 = 3; // доступ в наследниках
    private int a4 = 4; // доступ только внутри A

    void method1() {
        System.out.println("method1");
    }

    public void method2() {
        System.out.println("method2");
    }

    protected void method3() {
        System.out.println("method3");
    }

    private void method4() {
        System.out.println("method4");
    }
}

class B extends A {

    void test() {

        // доступ есть
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        // ошибки не будет
        method1();
        method2();
        method3();

        // ошибка доступа
        // System.out.println(a4);
        // method4();
    }
}

class C extends B {

    void print() {

        // поля доступны через наследование
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}

public class Java20 {

    public static void main(String[] args) {

        Child child = new Child();

        child.method();
        child.callParentMethod();

        child.printThis();
        child.printSuper();

        B b = new B();
        b.test();
    }
}