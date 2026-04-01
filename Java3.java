class example1 {
    void main(String[] argc){
        byte a = 46;
        short b = 100;
        int c = 235;
        long d = 1203;
        float e = 74.7f;
        double f = 63.8;
        char g = 'B';
        boolean h = true;
    }
}

class example2 {
    void main(String[] argc){
        System.out.println("\u0413\u0440\u0438\u0448\u0430");
    }
}

// Будет ошибка, так как b определена только внутри фигурных скобок
class example3{
    void main(String[] argc){
        int a = 1;        
        {
            int b = 2;
        }
        int c = a + b;
        System.out.println(c);        
    }
}

class example4{
    void main(String[] argc){
        String a = "Antihype";
        int b = 52;
        System.out.println(a + b);
    }
}

// В ответе будет число типа double так как "a" из int преобразовалось в double
class example5{
    void main(String[] argc){
        int a = 35;
        double b = 14.3554275;
        System.out.println(a + b);
    }
}

class example6{
    void main(String[] argc){
        float a = 42.7364505f;
        int b = (int) a;
        System.out.println(b); // Выводится 42
    }
}

class example7{
    void main(String[] argc){
        int a = 120;
        byte b = a + 10; // Будет ошибка т.к. int не преобразовывается в byte
        byte c = (byte)(a + 10); // Будет -126 т.к. мы вышли за рамки byte
        byte d = a + 1; // Аналогично с b
    }
}

class example8{
    void main(String[] argc){
        var count = 14; //int
        var text = "Slava"; //string
        var letter = 'K'; //char
        System.out.println(count + text + letter);
    }
}