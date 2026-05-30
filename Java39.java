public class Java39 {
    // final static поле
    final static int START_COUNTER;
    // static блок
    static {
        // ошибка преобразования строки в число
        START_COUNTER =
                Integer.parseInt("Y-");
    }
    public static void main(String[] args) {

        System.out.println("Hello");
    }
}
/*при запуске произойдет ошибка:
NumberFormatException
ошибка возникнет в static блоке
во время загрузки класса
класс не сможет корректно
инициализироваться
из-за этого main() не выполнится
и строка "Hello" не будет выведена*/