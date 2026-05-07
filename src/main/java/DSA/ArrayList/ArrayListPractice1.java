package DSA.ArrayList;
import java.util.ArrayList;
public class ArrayListPractice1 {
    static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(3);
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);
        for(int i= 0; i < al.size(); i++){
            System.out.println(al.get(i));
        }
    }
}
