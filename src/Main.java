import java.util.ArrayList;
import java.util.List;

public class Main { //Collections
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add("first");
        list.add("second");
        for (String string : list){
            System.out.println(string);
        }
    }
}