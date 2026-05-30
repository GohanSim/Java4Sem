public class Java35 {

    public static void main(String[] args) {

        // первое исключение перехватывается
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(
                    "ArithmeticException обработано"
            );
        }
        // второе исключение не перехватывается
        // программа завершится аварийно
        String text = null;
        System.out.println(text.length());
    }
}