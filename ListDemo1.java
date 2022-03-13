import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class ListDemo1 {
    public static void main(String[] args) {
        //creating list by using ArrayList 
        List<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(50);
        System.out.println(list1);
        System.out.println(list1.get(1));
        list1.remove(0);
        System.out.println(list1);
        List<String> list2 = new LinkedList<>();
        list2.add("kerala");
        list2.add("punjab");
        System.out.println(list2);
    }
}
