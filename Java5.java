class Operations {
    public static void main(String[] argc){
        int a1 = 9;
        int a = a1;
        a1 += 3;
        a1 -= 7;
        a1 /= 2;
        a1 %= 3;

        int b = 10;
        int max = (a > b) ? a:b;

        if(a == 5 || b == 10){
            System.out.println("Either a is 5 or b is 10");
        }
        if(a == 5 && b == 10){
            System.out.println("Both a is 5 and b is 10");
        }
        int c = a | b; // Возвращает 15, 5 в двоичном виде - 0101, а 10 - 1010, получается 1111 (15 в десятичной системе)
        int e = a ^ b; // Возвращает 15, так как при побитовом ИСКЛЮЧАЮЩЕМ ИЛИ получается 1111 (15 в десятичной системе)
        int d = a & b; // Возвращает 0, так как при побитовом И получается 0000 (0 в десятичной системе)
        if(a == b){
            System.out.println("a and b are equal");
        } else {
            System.out.println("a and b are not equal");
        }

        if(a > b){
            System.out.println("a is greater than b");
        } else if(a < b){
            System.out.println("a is less than b");
        } else {
            System.out.println("a and b are equal");
        }
        if(b >= a){
            System.out.println("b is greater than or equal to a");
        } else {
            System.out.println("b is less than a");
        }
        if(a < b){
            System.out.println("a is less than b");
        } else {
            System.out.println("a is greater than or equal to b");
        }
        if(a <= b){
            System.out.println("a is less than or equal to b");
        } else {
            System.out.println("a is greater than b");
        }
        int f = a>>1; // Возвращает 4, так как при сдвиге вправо на 1 бит 9 (1001) становится 4 (0100)
        int g = a<<1; // Возвращает 18, так как при сдвиге влево на 1 бит 9 (1001) становится 18 (10010)
        int h = b>>>1; // Возвращает 5, так как при беззнаковом сдвиге вправо на 1 бит 10 (1010) становится 5 (0101)
        f = f + a; // Возвращает 13, так как 4 + 9 = 13
        g = g - a; // Возвращает 9, так как 18 - 9 = 9
        h = h * a; // Возвращает 25, так как 5 * 9 = 45
        h = h / a; // Возвращает 5, так как 45 / 9 = 5
        h = h % b; // Возвращает 5, так как 45 % 10 = 5

        int j = 5;
        System.out.println(j++);  // постфикс: 5 (потом j=6)
        System.out.println(++j);  // префикс: j=7 (потом вывод 7)
        System.out.println(j--);  // постфикс: 7 (потом j=6)
        System.out.println(--j);  // префикс: j=5 (потом вывод 5)
        
        int i = ~5;        // побитовое НЕ: -6
        boolean not = !true;  // false
        
        // ( ) [ ] - скобки и индексы
        int[] array = new int[3];
        array[0] = (a + b) * 2;
        
        // С String
        String s1 = "Hello";
        String s2 = "Java";
        String s3 = s1 + " " + s2;  // конкатенация строк
        s1 += "!";  // s1 = "Java!"
        
        System.out.println("Результаты: " + s3 + ", " + i + ", " + not);
    }
}

class InstanceofExample {
    public static void main(String[] args) {
        String text = "Hi";
        Integer number = 5267;
        String nullString = null;
        
        System.out.println(text instanceof String);      // true
        System.out.println(text instanceof Object);      // true (String наследник Object)
        
        // Несовместимые типы - ошибка компиляции
        // System.out.println(text instanceof Integer); // Ошибка
        
        // null всегда выдаёт false
        System.out.println(nullString instanceof String);  // false
        System.out.println(null instanceof Object);        // false
    }
}
