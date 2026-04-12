import java.util.*;

public class LinkedList_Utils {

    public static void main (String arg[]){

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        for (int i= list.size()-1; i>=0;i--){
            if(list.get(i) >= 5){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
