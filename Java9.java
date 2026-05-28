public class Java9 {

    public static void main(String[] args) {
        // while
        int value1 = 1;
        while (value1 < 5) {
            System.out.println("while: " + value1);
            value1++;
        }
        // do-while
        int value2 = 1;
        do {
            System.out.println("do-while: " + value2);
            value2++;
        } while (value2 < 5);
        // for
        for (int i = 0; i < 5; i++)
            System.out.println("for: " + i);
        // for с двумя переменными
        for (int i = 0, j = 5; i < 5; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
        // практика 1 бесконечные циклы
        // while(true)
        // while (true) {
        //     System.out.println("бесконечный while");
        // }
        // do-while(true)
        // do {
        //     System.out.println("бесконечный do-while");
        // } while (true);
        // практика 2 break и continue
        for (int i = 0; i < 10; i++) {
            // пропуск нечётных чисел
            if (i % 2 != 0)
                continue;
            // выход из цикла
            if (i == 8)
                break;
            System.out.println("i = " + i);
        }
        // for-each для массива
        int[] arr = {2, 4, 6, 8, 10};
        for (int elem : arr)
            System.out.println("elem = " + elem);
    }
}