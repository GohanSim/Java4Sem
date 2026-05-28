public class Java8 {
    public static void main(String[] args) {
        // практика 1
        // int
        int intValue = 1;
        switch (intValue) {
            case 1:
                System.out.println("int");
                break;
        }
        // byte
        byte byteValue = 2;
        switch (byteValue) {
            case 2:
                System.out.println("byte");
                break;
        }
        // short
        short shortValue = 3;
        switch (shortValue) {
            case 3:
                System.out.println("short");
                break;
        }
        // char
        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("char");
                break;
        }
        // String
        String stringValue = "java";
        switch (stringValue) {
            case "java":
                System.out.println("String");
                break;
        }
        // enum
        Day day = Day.WEDNESDAY;
        switch (day) {
            case WEDNESDAY:
                System.out.println("enum");
                break;
        }
        // практика 2
        int value = 2;
        int i = 0;
        switch (value) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                // break отсутствует
            case 3:
                i = 3;
                break;
            default:
                i = 4;
                break;
        }
        // при value == 2 выполнение перейдёт в case 3
        System.out.println("i = " + i);
    }
}
// перечисление для switch
enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY
}