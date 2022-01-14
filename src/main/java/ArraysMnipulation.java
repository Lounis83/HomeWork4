
import java.util.HashSet;
import java.util.Set;

public class ArraysMnipulation {


    public void union(Set<Integer> set1,Set<Integer> set2) {
        set1.addAll(set2);
        System.out.println("Union of the two arrays : ");
        System.out.println(set1.toString());
    }

    public void Intersection(Set<Integer> set1,Set<Integer> set2) {
        set1.retainAll(set2);
        System.out.println("Intersection of the two arrays : ");
        System.out.println(set1.toString());
    }
    public void SymDiff(Set<Integer> set1,Set<Integer> set2) {
        set1.addAll(set2);
        set1.removeAll(set2);
        System.out.println("Symmetric difference of the two arrays : ");
        System.out.println(set1.toString());

    }

}
