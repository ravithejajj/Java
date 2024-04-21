package Java8;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Streams {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"a",4000,"M");
        Employee e2 = null;
        Employee e3 = null;
        Set<Employee> set = new HashSet<Employee>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        System.out.println(set.size());
        List<Department> list = new ArrayList();
        List<Employee> employeeList = List.of(new Employee(1,"a",4000,"M"),
                new Employee(2,"e",6000,"M"),
                new Employee(3,"b",5000,"F"),
                new Employee(5,"c",9000,"F"),
                new Employee(4,"d",8000,"M"));

        List<Student> studentList1 = Arrays.asList(new Student(1,"a",80,40),new Student(1,"d",70,30)
                ,new Student(3,"f",40,55),new Student(4,"c",30,67));
        List<Student> studentList2 = Arrays.asList(new Student(1,"a",80,40),new Student(1,"d",70,30)
                ,new Student(3,"f",40,55));
        List<Student> studentList3 = Arrays.asList(new Student(1,"a",80,40),new Student(1,"d",70,30)
                );
        studentList1.stream().map(e->e.getName()).filter(e->e.startsWith("a")).collect(Collectors.toList());
        list.add(new Department(1,studentList1,employeeList));
        list.add(new Department(2,studentList2,employeeList));
        list.add(new Department(3,studentList3,employeeList));
        Map<Integer,Integer>   map =  list.stream().collect(Collectors.toMap(s->s.getDepartId(),s->s.getList().size()));
            map.entrySet().stream().map((Map.Entry::getValue)).filter(e->e%2==0).collect(Collectors.summingInt(Integer::intValue));
        System.out.println(map);

        list.stream();
   //  Map<Integer,Double> resultMap =    list.stream().collect(Collectors.summingInt(Department::getDepartId,d->d.getEmployees().stream().map(e->e.getSalary()).collect(Collectors.averagingInt(Integer::intValue)))));
    //   Map<String,Double> empMap =  employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getSalary)));
      //  System.out.println(resultMap);
      //  System.out.println(employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get());
    }
}
