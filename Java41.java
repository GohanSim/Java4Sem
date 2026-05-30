import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Java41 {

    public static void main(String[] args) {
        // файл example.txt должен
        // находиться в папке проекта
        File file = new File("example.txt");
        try {
            Scanner scanner =
                    new Scanner(file);
            // чтение файла построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(
                    "файл не найден"
            );
        }
    }
}