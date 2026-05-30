import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Java40 {

    public static void main(String[] args) {
        // практика 1 read()
        byte[] data = {52,55,67};
        ByteArrayInputStream input =
                new ByteArrayInputStream(data);
        try {
            int value;
            while ((value = input.read()) != -1) {
                System.out.println(
                        (char) value
                );
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        // практика 2 write(int)
        ByteArrayOutputStream output =
                new ByteArrayOutputStream();
        output.write(72);
        output.write(105);
        System.out.println(
                output.toString()
        );
        // практика 3 Reader и Writer

        /*InputStream и OutputStream
        работают с байтами
        Reader и Writer работают
        с символами
        Reader и Writer удобны
        для текстовых данных
        и поддерживают кодировки*/

        // практика 4 AutoCloseable

        /*AutoCloseable нужен для
        автоматического закрытия
        ресурсов через try-with-resources*/
        try (
                ByteArrayInputStream stream =
                        new ByteArrayInputStream(data)
        ) {
            System.out.println(
                    stream.read()
            );
        } catch (IOException e) {

            System.out.println(e);
        }
    }
}