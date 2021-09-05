package com.training.exercise;

import java.util.ArrayList;

public class EmployeeMainApp {
    public static void main(String[] args) {

        Employee empOne = new Employee(1, "Mani", 28, 150000, "Manager", "IT");
        Employee empTwo = new Employee(2, "Binay", 29, 160000, "Senior Associate", "IT");
        Employee empThree = new Employee(4, "Rahul", 32, 170000, "Senior Manager", "Marketing");
        Employee empFour = new Employee(3, "Abhishek", 24, 80000, "Associate", "Finance");
        Employee empFive = new Employee(5, "Rajesh", 38, 250000, "Director", "IT");
        Employee empSix = new Employee(6, "Venkat", 29, 100000, "Associate", "Admin");
        Employee empSeven = new Employee(4, "Ram", 32, 140000, "Senior Manager", "Marketing");
        Employee empEight = new Employee(3, "Robert", 24, 110000, "Associate", "Finance");

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(empOne);
        employees.add(empTwo);
        employees.add(empThree);
        employees.add(empFour);
        employees.add(empFive);
        employees.add(empOne);
        employees.add(empSix);
        employees.add(empSeven);
        employees.add(empEight);

        //System.out.println("No of Employee: "+employees.stream()


        //List<Employee> list= Arrays.asList(employees);
        System.out.println("Average salary is: " + employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble());


    }
}

