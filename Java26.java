public class Java26 {

    public static void main(String[] args) {

        Outer26 outer = new Outer26();

        // public inner class
        Outer26.PublicInner26 p =
                outer.new PublicInner26();

        p.show();

        // protected inner class
        Outer26.ProtectedInner26 pr =
                outer.new ProtectedInner26();

        pr.show();

        // default inner class
        Outer26.DefaultInner26 d =
                outer.new DefaultInner26();

        d.show();

        // static nested class
        Outer26.StaticNested26 s =
                new Outer26.StaticNested26();

        s.show();

        // доступ внешнего класса к inner class
        outer.testInnerAccess();
    }
}

class Outer26 {

    private String privateField = "private";
    public String publicField = "public";

    private void privateMethod() {
        System.out.println("private method");
    }

    public void publicMethod() {
        System.out.println("public method");
    }

    // практика 1 public inner class

    public class PublicInner26 {

        void show() {

            // практика 2 доступ к полям внешнего класса

            System.out.println(privateField);
            System.out.println(publicField);

            privateMethod();
            publicMethod();
        }
    }

    // protected inner class

    protected class ProtectedInner26 {

        void show() {
            System.out.println("protected inner");
        }
    }

    // default inner class

    class DefaultInner26 {

        void show() {
            System.out.println("default inner");
        }
    }

    // private inner class

    private class PrivateInner26 {

        private String text = "inner text";

        private void print() {
            System.out.println(text);
        }
    }

    // static nested class

    static class StaticNested26 {

        void show() {
            System.out.println("static nested");
        }
    }

    // практика 3 доступ внешнего класса к inner class

    void testInnerAccess() {

        PrivateInner26 inner =
                new PrivateInner26();

        // внешний класс имеет доступ
        // даже к private членам inner class

        System.out.println(inner.text);

        inner.print();
    }
}