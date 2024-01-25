package com.workintech.utils;
import  com.workintech.employee.Employee;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class setUtils {
        public static  void printLinkedList(LinkedList<Employee> employees) {
        Iterator iterator = employees.iterator();
        while (iterator.hasNext()){

            Employee employee = (Employee) iterator.next();
            System.out.println("Employee Detail: ID: " + employee.getId() + " Name: " + employee.getFirstname() + " " + employee.getLastname() );
        }
    }
        public static  void printMap(Map<Long, Employee> map){
            for(Map.Entry<Long,Employee> entry: map.entrySet()){
                Employee employee = entry.getValue();
                System.out.println("Employee Detail: ID: " + employee.getId() + " Name: " + employee.getFirstname() + " " + employee.getLastname());
            }

        }
}


