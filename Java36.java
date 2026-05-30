class Ex136 extends Exception {
}

class Ex236 extends Ex136 {
}

class Ex336 extends Ex236 {
}

public class Java36 {

    public static void main(String[] args) {

        // практика 1 одинаковая обработка
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[10]);

        } catch (
                ArithmeticException |
                ArrayIndexOutOfBoundsException e
        ) {
            System.out.println(
                    "одинаковая обработка исключений"
            );
        }

        // практика 1 иерархия исключений
        try {
            testException(3);

        } catch (Ex336 e) {
            System.out.println("catch Ex336");
        } catch (Ex236 e) {
            System.out.println("catch Ex236");
        } catch (Ex136 e) {
            System.out.println("catch Ex136");
        }
        /*нельзя писать так:
        catch (Ex136 | Ex236 e)
        потому что Ex236 наследуется
        от Ex136*/

        // практика 2 final в catch
        try {
            int a = 10 / 0;

        } catch (final Exception e) {
            System.out.println(
                    "final запрещает менять ссылку e"
            );
            // ошибка:
            // e = new Exception();
        }
    }

    static void testException(int value)
            throws Ex136 {

        if (value == 1)
            throw new Ex136();

        if (value == 2)
            throw new Ex236();

        if (value == 3)
            throw new Ex336();
    }
}