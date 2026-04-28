package CollectionFramework;
import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Sahil");
        students.add("Moin");
        students.add(0, "wajid");
        System.out.println(students);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        IO.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.addAll(list);

        list2.set(2,3000);
        System.out.println(list2);

        System.out.println(list2.contains(11));
        for(int i=0; i<list2.size(); i++){
            System.out.println("Element is: " + list2.get(i));
        }
        System.out.println("========");
        for(int element:list2){
            System.out.println("Element is: " + element);
        }
    }
}
