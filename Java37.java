// собственный класс исключения
class MyFirstException37 extends Exception {

    // конструктор без параметров
    public MyFirstException37() {
        super();
    }

    // конструктор с сообщением
    public MyFirstException37(String message) {
        super(message);
    }

    // конструктор с причиной ошибки
    public MyFirstException37(
            String message,
            Throwable cause
    ) {
        super(message, cause);
    }
}

public class Java37 {

    public static void main(String[] args) {
        try {
            checkNumber(-5);

        } catch (MyFirstException37 e) {
            System.out.println(
                    "ошибка: " + e.getMessage()
            );
        }
    }

    static void checkNumber(int number)
            throws MyFirstException37 {
        if (number < 0) {
            throw new MyFirstException37(
                    "число меньше нуля"
            );
        }
        System.out.println(number);
    }
}