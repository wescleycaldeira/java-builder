package com.wcaldeira.recursivegenerics;

public class Demo {

    public static void main(String[] args) {
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();

        Person person = employeeBuilder
                .withName("John")
                .workAs("Data Engineer")
                .build();

        System.out.println(person);
    }

}
