package zadanie4;

public class Main {
    public static void main(String[] args) {
        Generic<Integer> integerGeneric = new Generic<>();
        Generic<String> stringGeneric = new Generic<>();

        integerGeneric.setContent(6);
        stringGeneric.setContent("Shdsf");
        GenericObject genericObject = new GenericObject();
        genericObject.setContent(54);
        genericObject.setContent("54");

    }
}
