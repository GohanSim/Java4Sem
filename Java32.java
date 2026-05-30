public class Java32 {

    public static void main(String[] args) {

        StringBuilder builder =
                new StringBuilder("java");
        // append() добавление
        builder.append(" code");
        System.out.println(builder);
        // insert() вставка
        builder.insert(4, " new");
        System.out.println(builder);
        // replace() замена
        builder.replace(0, 4, "JAVA");
        System.out.println(builder);
        // delete() удаление
        builder.delete(4, 8);
        System.out.println(builder);
        // reverse() переворот строки
        builder.reverse();
        System.out.println(builder);
        // reverse() обратно
        builder.reverse();
        // charAt() символ по индексу
        System.out.println(builder.charAt(0));
        // setCharAt() изменение символа
        builder.setCharAt(0, 'j');
        System.out.println(builder);
        // length() длина строки
        System.out.println(builder.length());
        // capacity() размер буфера
        System.out.println(builder.capacity());
        // substring() часть строки
        System.out.println(builder.substring(0, 4));
        // StringBuffer
        StringBuffer buffer =
                new StringBuffer("hello");

        buffer.append(" world");
        System.out.println(buffer);
        // практика 2 преобразования
        // String -> StringBuilder
        String str = "text";
        StringBuilder b1 =
                new StringBuilder(str);
        // String -> StringBuffer
        StringBuffer b2 =
                new StringBuffer(str);
        // StringBuilder -> String
        String str2 = b1.toString();
        // StringBuffer -> String
        String str3 = b2.toString();
        // StringBuilder -> StringBuffer
        StringBuffer b3 =
                new StringBuffer(b1.toString());
        // StringBuffer -> StringBuilder
        StringBuilder b4 =
                new StringBuilder(b2.toString());
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(b3);
        System.out.println(b4);
    }
}