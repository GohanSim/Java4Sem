// Практика 6 классы-оболочки

public class P6 {
    public static void main(String[] args) {
        // decode()
        Integer d1 = Integer.decode("52");
        System.out.println("decode(\"52\") = " + d1);

        Integer d2 = Integer.decode("0xFF");
        System.out.println("decode(\"0xFF\") = " + d2);

        Integer d3 = Integer.decode("067");
        System.out.println("decode(\"067\") = " + d3);

        Integer d4 = Integer.decode("-42");
        System.out.println("decode(\"-42\") = " + d4);

        Integer d5 = Integer.decode("-0x10");
        System.out.println("decode(\"-0x10\") = " + d5);

        // Boolean
        Boolean bool1 = Boolean.valueOf(true);
        System.out.println("valueOf(true) = " + bool1);

        Boolean bool2 = Boolean.valueOf("true");
        Boolean bool3 = Boolean.valueOf("TrUe");
        Boolean bool4 = Boolean.valueOf("false");
        Boolean bool5 = Boolean.valueOf("любая_другая_строка");

        System.out.println("valueOf(\"true\") = " + bool2);
        System.out.println("valueOf(\"TrUe\") = " + bool3);
        System.out.println("valueOf(\"false\") = " + bool4);
        System.out.println("valueOf(\"abc\") = " + bool5);

        boolean bp1 = Boolean.parseBoolean("true");
        boolean bp2 = Boolean.parseBoolean("yes");

        System.out.println("parseBoolean(\"true\") = " + bp1);
        System.out.println("parseBoolean(\"yes\") = " + bp2);

        // автоупаковка
        Boolean bool6 = true;
        Boolean bool7 = false;

        System.out.println("автоупаковка: " + bool6 + ", " + bool7);

        // константы
        Boolean bool8 = Boolean.TRUE;
        Boolean bool9 = Boolean.FALSE;

        System.out.println("Boolean.TRUE/FALSE: " + bool8 + ", " + bool9);

        // null
        Integer nullInteger = null;

        System.out.println("nullInteger = " + nullInteger);

        if (nullInteger != null) {
            int safe = nullInteger;
            System.out.println("Безопасная распаковка: " + safe);
        } else
            System.out.println("Integer равен null, распаковка невозможна");

        // IntegerCache
        int i1 = 128;

        Integer a1 = i1;
        Integer b1 = i1;

        System.out.println("a1 == i1: " + (a1 == i1));
        System.out.println("b1 == i1: " + (b1 == i1));
        System.out.println("a1 == b1: " + (a1 == b1));

        System.out.println("a1.equals(i1): " + a1.equals(i1));
        System.out.println("b1.equals(i1): " + b1.equals(i1));
        System.out.println("a1.equals(b1): " + a1.equals(b1));

        int i2 = 127;

        Integer a2 = i2;
        Integer b2 = i2;

        System.out.println("a2 == i2: " + (a2 == i2));
        System.out.println("b2 == i2: " + (b2 == i2));
        System.out.println("a2 == b2: " + (a2 == b2));

        System.out.println("a2.equals(i2): " + a2.equals(i2));
        System.out.println("b2.equals(i2): " + b2.equals(i2));
        System.out.println("a2.equals(b2): " + a2.equals(b2));

        System.out.println("\n--- IntegerCache ---");
        System.out.println("IntegerCache кэширует значения от -128 до 127.");
    }
}