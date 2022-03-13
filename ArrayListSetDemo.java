import java.util.ArrayList;

public class ArrayListSetDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("java");
        arrayList.add("Physics");
        arrayList.add("c Programming");
        System.out.println("The current list : "+arrayList);
        String element = arrayList.set(1,"Python");
        System.out.println("Updated List : "+arrayList);
        System.out.println("The updated Language :"+element);
    }
}
