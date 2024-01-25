import com.workintech.employee.Employee;

import java.util.*;

import static com.workintech.utils.setUtils.printLinkedList;
import static com.workintech.utils.setUtils.printMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("____________Employee__________");
        Employee jack = new Employee(1,"Jack","Sparrow");
        Employee logan = new Employee(2, "Logan","Wolverine");
        Employee scarlet = new Employee(3,"Black","Widow");
        Employee bruce = new Employee(4,"Bruce", "Banner");
        Employee jim = new Employee(2,"Jim","Halpert");
        Employee micheal = new Employee(3,"Micheal", "Scott");


        LinkedList<Employee> allEmployee = new LinkedList();
        allEmployee.add(jack);
        allEmployee.add(logan);
        allEmployee.add(scarlet);
        allEmployee.add(bruce);
        allEmployee.add(jim);
        allEmployee.add(micheal);

        printLinkedList(allEmployee);

        Map<Long, Employee> unique = new HashMap<>();
        LinkedList<Employee> duplicate = new LinkedList<>();

        Iterator<Employee> iterator = allEmployee.iterator();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            if(unique.containsKey(employee.getId())){
                duplicate.add(employee);
                iterator.remove();
            } else {
                unique.put(employee.getId(), employee);
            }
        }

        System.out.println("_____Duplicate___________");
        printLinkedList(duplicate);

        System.out.println("_____Unique____________");
        printMap(unique);

    }
}