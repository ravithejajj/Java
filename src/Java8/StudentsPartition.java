package Java8;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class StudentsPartition {
    public static void main(String[] args) {
        List<Student> list =Arrays.asList(new Student(1,"a",80,40),new Student(1,"d",70,30)
        ,new Student(3,"f",40,55),new Student(4,"c",30,67));
      Map<Boolean,List<Student>> map =   list.stream().collect(Collectors.partitioningBy(s->s.getMarks()>60));
    //   map.get(true).forEach(System.out::println);
      //  System.out.println("-----------------------------------------------");
      //  map.get(false).forEach(System.out::println);
       List topPerformingStudents =  list.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).limit(3).collect(Collectors.toList());
       // System.out.println(topPerformingStudents);
        List listOfNamePercentage = list.stream().map(s->"percentage :"+s.getPercentage()+" name: "+s.getName()).collect(Collectors.toList());
     //   System.out.println(listOfNamePercentage);
        System.out.println(list.stream().map(s->s.getMarks()).max(Comparator.comparing(Integer::intValue)).get());
        System.out.println(list.stream().max(Comparator.comparing(Student::getMarks)).get());
        System.out.println(list.stream().map(s->s.getMarks()).min(Comparator.comparing(Integer::intValue)).get());
        System.out.println(list.stream().map(Student::getMarks).collect(Collectors.averagingInt(Integer::intValue)));
        System.out.println(list.stream().count());
        Map<String,Student> subjectMap = list.stream().collect(Collectors.toMap(s->s.getName(),s->s));
       /* Map<String,List<Student>> subjectMapBy = list.stream().collect(
                Collectors.groupingBy(Student::getName, Collectors.mapping(s1 -> {
                    return new Student(s1.getMarks(), s1.getId(), s1.getMarks());
                }),Collectors.toList()));*/
        System.out.println(subjectMap);
    }
    }



