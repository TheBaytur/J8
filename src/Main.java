import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main { //Collections, list add...
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("first");
        list.add("second");
        list.add("third");
        list.add("forth");
        list.add("fifth");
        list.add("so");
//        list.clear();
        list.add("new item");
        list.sort((s, t1) -> s.length() - t1.length());

        for (String string : list){
            System.out.println(string);
        }

//        list.remove("first");
//        for (int i = 0; i < list.size(); i++){
//            System.out.println("i " + i + " item " + list.get((i)));
//        }
//
//        list.add(0, "forth");
//        list.add("fifth");
//        System.out.println("added 2 items");
//        list.remove(list.size() - 1);
//        for (int i = 0; i < list.size(); i++){
//            System.out.println("i " + i + " item " + list.get(i));
//        }
    }
}