package zadanie61;

import zadanie6.GetString;

public class Test {
    private GetString getString = new GetString("1");

    {
        System.out.println("3");
    }
    static {
        System.out.println("4 static");
    }
    static GetString getString1 = new GetString("2 static");
    public Test(){
        System.out.println("5. konstr");
    }
     private GetString getString2 = new GetString("6");

    public static void main(String[] args) {
        GetString getString = new GetString("7");
        Test test = new Test();
    }
}
