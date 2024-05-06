package Java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private int departId;
    private List<Student> list;
    private List<Employee> employees;
}
