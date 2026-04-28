package CollectionFramework;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(3);
        set.add(67);
        set.add(43);
        set.add(50);
        set.add(30);
        set.add(30);

        System.out.println(set);
    }
}
