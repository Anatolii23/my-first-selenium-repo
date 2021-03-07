package sample;

public class Rzutownie {
    public static void main(String[] args) {
        Integer i = 50;
        String s = "Hello world";
        Double d = -521.53432;
        char c = 'X';

        chekedObject(i);
        chekedObject(s);
        chekedObject(d);
        chekedObject(c);

    }
    public  static void chekedObject(Object object){
        if(object instanceof String){
            System.out.println(object);
            System.out.println("To jest string");
        }
        else if(object instanceof Integer){
            System.out.println(object);
            System.out.println("To jest integer");
        }
        else if(object instanceof Double){
            System.out.println(object);
            System.out.println("To jest double");
        }
        else{
            System.out.println(object);
            System.out.println("Nieznany object");
        }


    }
}
