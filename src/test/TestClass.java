package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestClass {

    public static void main(String[] args) {
       /* Employee emp1 = new Employee(100, "test1");
        Employee emp2 = new Employee(50, "test2");

        System.out.println(emp1.compareTo(emp2));
*/

      /*  List<String> list = new ArrayList<>();

        list.add("test3");
        list.add("test1");
        list.add("fads");
*/

      Employee emp1 = new Employee(100, "test1");
        Employee emp2 = new Employee(50, "test2");
        Employee emp3 = new Employee(20, "test3");
        Employee emp4 = new Employee(70, "test4");

        List<Employee> elist = new ArrayList<>();
        elist.add(emp1);
        elist.add(emp2);
        elist.add(emp3);
        elist.add(emp4);


        Collections.sort(elist, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                Employee e1 = (Employee) o1;
                Employee e2 = (Employee) o2;

                if(e1.id == e2.id){
                    return 0;
                }else if(e1.id < e2.id){
                    return 1;
                }else{
                    return -1;
                }
            }
        });

        System.out.println(elist);

    }




}
