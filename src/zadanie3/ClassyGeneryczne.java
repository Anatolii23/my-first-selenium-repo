package zadanie3;

import java.util.ArrayList;
import java.util.List;

public class ClassyGeneryczne {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add("Heloo");
        list.add(-23.6543);
        list.add('x');
        System.out.println(list);
        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add((int) 45.234);
        //integerList.add("Hello");
        System.out.println(integerList);
    }
}
