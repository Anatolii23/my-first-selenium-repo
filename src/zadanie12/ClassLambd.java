package zadanie12;

public class ClassLambd {
    interface lalala{
        boolean isTrue(String s, int x);
    }

    public static void main(String[] args) {
        lalala lalala = (s, x) -> s.length()==x;
        lalala.isTrue("Hello", 10);
        System.out.println(lalala.isTrue("Welkome", 7));
    }
}
