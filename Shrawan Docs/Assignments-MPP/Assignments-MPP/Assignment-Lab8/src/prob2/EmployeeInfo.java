package prob2;

import jdk.dynalink.linker.ConversionComparator;

import java.util.*;

public class EmployeeInfo {
    static enum SortMethod {BYNAME, BYSALARY}

    ;
    private SortMethod method;

    public EmployeeInfo(SortMethod method) {
        this.method = method;
    }

    //Comparators are unaware of the value in method
    public void sort(List<Employee> emps) {
        if (method == SortMethod.BYNAME) {
            Collections.sort(emps, new EmployeeNameComparator());
        } else if (method == SortMethod.BYSALARY) {
            Collections.sort(emps, new EmployeeSalaryComparator());
        }
    }


    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Joe", 100000));
        emps.add(new Employee("Joe", 50000));
        emps.add(new Employee("Andy", 60000));
        Employee joe = new Employee("Joe", 100000);
        Employee joe2 = new Employee("Joe", 200000);
        List<Employee> list = Arrays.asList(joe, joe2);
        EmployeeNameComparator employeeNameComparator = new EmployeeNameComparator();
        Collections.sort(list, employeeNameComparator);
        System.out.println(list);


        System.out.println("joe object equals joe2? " + joe.equals(joe2));

        // Employee Comparator
        Comparator<Employee> employeeComparator = (e1, e2) -> {
            int nameCompareResult = new EmployeeNameComparator().compare(e1, e2);
            if(nameCompareResult != 0) return nameCompareResult;

            int salaryCompareResult = new EmployeeSalaryComparator().compare(e1, e2);
            if(salaryCompareResult != 0) return salaryCompareResult;

            return 0;
        };

        // Employee Object should be equal, if all attributes are also equal.
        // While using only EmployeeNameComparator, it should be equal if name attributes are equal, regardless of other attribute
        System.out.println("joe object NAME EQUALS to joe2? " + (employeeNameComparator.compare(joe, joe2) == 0));
        System.out.println("joe object compare equals joe2? " + (employeeComparator.compare(joe, joe2) == 0));

        EmployeeInfo ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);
        ei.sort(emps);
        System.out.println(emps);
        ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYSALARY);
        ei.sort(emps);
        System.out.println(emps);
    }

}
	
