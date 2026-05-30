import java.util.StringJoiner;

public class Java31 {

    public static void main(String[] args) {
        String text = "Java Programming";
        // length() длина строки
        System.out.println(text.length());
        // charAt() символ по индексу
        System.out.println(text.charAt(0));
        // substring() часть строки
        System.out.println(text.substring(5));
        // contains() проверка подстроки
        System.out.println(text.contains("Java"));
        // equals() сравнение строк
        System.out.println(text.equals("Java Programming"));
        // toUpperCase() верхний регистр
        System.out.println(text.toUpperCase());
        // toLowerCase() нижний регистр
        System.out.println(text.toLowerCase());
        // replace() замена символов
        System.out.println(text.replace("Java", "C++"));
        // startsWith() начало строки
        System.out.println(text.startsWith("Java"));
        // endsWith() конец строки
        System.out.println(text.endsWith("ing"));
        // практика 2 StringJoiner
        StringJoiner joiner =
                new StringJoiner(", ");
        joiner.add("one");
        joiner.add("two");
        joiner.add("three");
        System.out.println(joiner);
        // StringJoiner с префиксом и суффиксом
        StringJoiner joiner2 =
                new StringJoiner(" - ", "[", "]");
        joiner2.add("A");
        joiner2.add("B");
        System.out.println(joiner2);
        // практика 3 три двойные кавычки
        // text block нужен для
        // многострочного текста
        String html = """
                <html>
                    <body>
                        hello
                    </body>
                </html>
                """;
        System.out.println(html);
    }
}