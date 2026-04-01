class Words{
    /**
     * @param a Первое слово
     * @param b Второе слово
     * @return
     */
    public static String Unite(String a, String b){
        return a + " " + b;
    }
}

public class Java4{
    void main(String[] argc){
        String a = "Slava";
        String b = "KPSS";
        System.out.println(Words.Unite(a, b));
    }
}