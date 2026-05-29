// практика 1 перегрузка методов

class Calculator23 {

    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// практика 2 переопределение методов

class Parent23 {

    void print() {
        System.out.println("метод Parent23");
    }
}

class Child23 extends Parent23 {

    @Override
    void print() {
        System.out.println("метод Child23");
    }

    /*
    ошибка:

    нельзя изменить тип возвращаемого значения,
    если сигнатура метода одинаковая

    пример ошибки:

    int print() {
        return 1;
    }
    */
}

// практика 3 @Override

class Animal23 {

    void sound() {
        System.out.println("звук");
    }
}

class Anime23 extends Animal23 {

    @Override
    void sound() {
        System.out.println("ня");
    }

    /*
    если написать так:

    void sounds()

    то это уже будет новый метод,
    а не переопределение

    @Override сразу покажет ошибку
    компиляции и поможет найти опечатку
    */
}

public class Java23 {

    public static void main(String[] args) {

        // перегрузка
        Calculator23 calc = new Calculator23();

        System.out.println(calc.sum(2, 3));
        System.out.println(calc.sum(2.5, 3.5));
        System.out.println(calc.sum(1, 2, 3));

        // переопределение
        Parent23 obj = new Child23();

        obj.print();

        // override
        Anime23 dog = new Anime23();

        dog.sound();
    }
}