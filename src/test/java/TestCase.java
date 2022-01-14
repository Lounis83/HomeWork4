import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.print.DocFlavor;
import java.sql.SQLSyntaxErrorException;
import java.util.*;

public class TestCase {

    @Test
    public void Test1(){
        int a=50;
        int b=50;
        Assertions.assertEquals(a,b);
        System.out.println("Passed1");
    }
    @Test
    public void Test2(){
        int a =5;
        int b=18;
        Assertions.assertNotEquals(a-b,0);
        System.out.println("Passed2");
    }

    @Test
    public void Test3() {
        String s = "Hi there !";
        Assertions.assertNotNull(s);
        System.out.println("Passed3");
    }
    @Test
    public void ArrayContains(){
        ArrayList<Integer> x= new ArrayList<>();
        x.add(5);
        x.add(0);
        x.add(8);
        x.add(19);
        Assertions.assertTrue(x.contains(5));
        System.out.println("Passed4");
    }
    @Test
    public void ArrayNotEmpty() {
        ArrayList<Integer> x= new ArrayList<>();
        x.add(5);
        x.add(0);
        x.add(8);
        x.add(19);
        Assertions.assertTrue(x.isEmpty());
        System.out.println("Passed5");
    }
    @Test
    public void StringContains() {
        String str="Hi there !!";

        Assertions.assertTrue(str.contains("Hi"));
        System.out.println("Passed6");


    }
    @Test
    public void checkIfNotNull() {
        Object x= null;
        Assertions.assertNull(x);
        System.out.println("Passed7");
    }
    @Test
    public void checkString() {
        String str= "Hi there !";
        Assertions.assertTrue(str.equals("Hi there !"));
        System.out.println("Passed8");
    }
    @Test
    public void checkSUbString2() {
        String str= "Hi there !";
        Assertions.assertTrue(str.contains("Lounis"));
        System.out.println("Passed9");
    }
    @Test
    public void checkMap() {
        Map<Integer,String> map = new HashMap<Integer, String>() ;
        map.put(1,"Alex");
        map.put(2,"John");
        map.put(3,"Jonny");
        map.put(4,"Alex");

        Assertions.assertTrue(map.containsKey(6));
    }

}
