import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        int[] array1={1,3,2,4,8,9,0};
        int[] array2={1,3,7,5,4,0,7,5};

        ArraysMnipulation manip = new ArraysMnipulation();

        //conversion to sets
        Set<Integer> set1 = Arrays.stream(array1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(array2).boxed().collect(Collectors.toSet());

        //union **************************************************************************
        manip.union(set1,set2);

        //intersection **************************************************************************
        set1 = Arrays.stream(array1).boxed().collect(Collectors.toSet());
        set2 = Arrays.stream(array2).boxed().collect(Collectors.toSet());
        manip.Intersection(set1,set2);

        //sym diff **************************************************************
        set1 = Arrays.stream(array1).boxed().collect(Collectors.toSet());
        set2 = Arrays.stream(array2).boxed().collect(Collectors.toSet());
        manip.SymDiff(set1,set2);


        System.out.println("***********************************************************************************");

        //map creation **************************************************************
        System.out.println("The map contains : ");
        List<String> list1 = new ArrayList<>();
        list1.add("White");
        list1.add("Blue");
        list1.add("Red");

        List<String> list2 = new ArrayList<>();
        list2.add("March");
        list2.add("April");
        list2.add("June");

        List<String> list3 = new ArrayList<>();
        list3.add("Friday");
        list3.add("Saturday");
        list3.add("Monday");

        Map<String,List> map = new HashMap<>();
        map.put("Colors",list1);
        map.put("Months",list2);
        map.put("Days",list3);

        for(Map.Entry<String,List> entry:map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue().toString());
        }
    }
}
