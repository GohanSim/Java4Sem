// практика 7 оператор условного перехода

public class Java7 {

    public static void main(String[] args) {

        int a = 2;

        // запись через тернарный оператор
        int i = (a == 1) ? 1 :
                (a == 2) ? 2 : 3;

        // вывод результата
        System.out.println("i = " + i);
    }
}