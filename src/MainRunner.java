import java.util.*;

public class MainRunner {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Homework");
        list.add("Practice");
        list.add("Sleep");
        list.add("Live");
        System.out.println(list);
        String initial = list.set(0, list.get(3));
        list.set(3, initial);
        System.out.println(list.get(0));
        System.out.println(list.get(3));
        list.set(0, "HELLO!");
        System.out.println(list);
    }
}
