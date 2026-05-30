public class Java34 {

    public static void main(String[] args) {

        // практика 1 основные классы исключений
        /*Throwable:
        базовый класс всех ошибок и исключений
        Error:критические ошибки JVM,
        обычно не обрабатываются
        Exception:
        исключения, которые можно
        обработать в программе
        RuntimeException:
        ошибки времени выполнения*/

        // практика 2 ArithmeticException
        try {
            int a = 10 / 0;
            System.out.println(a);

        } catch (ArithmeticException e) {
            System.out.println(
                    "ArithmeticException"
            );
        }

        // ArrayIndexOutOfBoundsException

        try {
            int[] arr = {1,2,3};
            System.out.println(arr[5]);
        } catch (
                ArrayIndexOutOfBoundsException e
        ) {
            System.out.println(
                    "ArrayIndexOutOfBoundsException"
            );
        }

        // IllegalArgumentException
        try {
            checkAge(-5);

        } catch (IllegalArgumentException e) {
            System.out.println(
                    "IllegalArgumentException"
            );
        }

        // ClassCastException
        try {
            Object obj = "java";
            Integer num = (Integer) obj;
            System.out.println(num);

        } catch (ClassCastException e) {
            System.out.println(
                    "ClassCastException"
            );
        }

        // NullPointerException
        try {
            String text = null;

            System.out.println(
                    text.length()
            );

        } catch (NullPointerException e) {

            System.out.println(
                    "NullPointerException"
            );
        }
    }

    static void checkAge(int age) {

        if (age < 0) {

            throw new IllegalArgumentException(
                    "age < 0"
            );
        }
    }
}