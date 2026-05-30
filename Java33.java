import java.util.Date;
import java.util.Formatter;

public class Java33 {

    public static void main(String[] args) {

        // практика 1 спецификаторы

        Formatter formatter =
                new Formatter();
        formatter.format(
                "boolean: %b%n",
                true
        );
        formatter.format(
                "char: %c%n",
                'A'
        );
        formatter.format(
                "decimal: %d%n",
                100
        );
        formatter.format(
                "float: %.2f%n",
                12.3456
        );
        formatter.format(
                "string: %s%n",
                "java"
        );
        System.out.println(formatter);

        // практика 2 flush()
        /*flush() принудительно
        отправляет данные из буфера
        используются чтобы вывести
        данные сразу, не дожидаясь
        закрытия потока*/
        formatter.flush();
        // практика 3 дата и время
        Date date = new Date();
        Formatter timeFormatter =
                new Formatter();
        // часы
        timeFormatter.format(
                "hour: %tH%n",
                date
        );
        // минуты
        timeFormatter.format(
                "minutes: %tM%n",
                date
        );
        // секунды
        timeFormatter.format(
                "seconds: %tS%n",
                date
        );
        // год
        timeFormatter.format(
                "year: %tY%n",
                date
        );
        // месяц
        timeFormatter.format(
                "month: %tB%n",
                date
        );
        System.out.println(timeFormatter);
        formatter.close();
        timeFormatter.close();
    }
}