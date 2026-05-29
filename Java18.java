public class Java18 {
    // 1: принимает int
    public static void printNumbers(int... numbers) {
        System.out.print("int...: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    // 2: принимает double
    public static void printNumbers(double... numbers) {
        System.out.print("double...: ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    // 3: принимает String
    public static void printNumbers(String... strings) {
        System.out.print("String...: ");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
    // 4: принимает Object общая
    public static void printNumbers(Object... objects) {
        System.out.print("Object...: ");
        for (Object obj : objects) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    // 5: с дополнительным параметром
    public static void printNumbers(String prefix, int... numbers) {
        System.out.print(prefix + ": ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Вызов int
        printNumbers(1, 2, 3);           // int...: 1 2 3
        // Вызов double
        printNumbers(1.1, 2.2, 3.3);     // double...: 1.1 2.2 3.3
        // Вызов String
        printNumbers("a", "b", "c");      // String...: a b c
        // Вызов Object (int → Integer, затем автоупаковка в Object)
        printNumbers(1, "privet", 2.72);   // Object: 1 privet 2.72
        // Вызов String prefix, int
        printNumbers("Сумма", 10, 20, 30); // Сумма: 10 20 30
    }
}
/* ВЫВОД:
int...: 1 2 3
double...: 1.1 2.2 3.3
String...: a b c
Object...: 1 privet 2.72
Сумма: 10 20 30
*/