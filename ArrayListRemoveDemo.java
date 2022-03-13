import java.util.ArrayList;

public class ArrayListRemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("python");
        arrayList.add("java");
        arrayList.add("Cprogramming");
        System.out.println(arrayList);
        ArrayList<String> oops = new ArrayList<>();
        oops.add("python");
        oops.add("java");
        System.out.println(oops);
        arrayList.removeAll(oops);
        System.out.println(arrayList);
        oops.removeAll(oops);
        System.out.println(oops);
        arrayList.clear();
        System.out.println(arrayList);
    }
}
