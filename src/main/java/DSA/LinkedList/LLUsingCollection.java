import java.util.*;
public class LLUsingCollection {
    public static void main (String[] args){
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("b");
        list.addFirst("a");

        System.out.println(list);

        System.out.println(list.size());
    }
}
