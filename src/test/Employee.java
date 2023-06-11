package test;

public class Employee implements Comparable<Employee>{

    public int id;
    public String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.id >o.id){
            return 1;
        }else{
            return 0;
        }
    }
}
