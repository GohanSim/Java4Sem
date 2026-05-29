interface Info27 {

    // вложенный класс в интерфейсе
    class Nested27 {
        void print() {
            System.out.println("nested class in interface");
        }
    }

    // static nested class
    static class StaticNested27 {
        static void show() {
            System.out.println("static method");
        }
    }
}

public class Java27 {

    public static void main(String[] args) {
        // создание объекта вложенного класса
        Info27.Nested27 obj =
                new Info27.Nested27();
        obj.print();
        // вызов static метода
        Info27.StaticNested27.show();
    }
}