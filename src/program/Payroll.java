//Name: Ari Chicheportiche
//ID: 319306684
//Execrsice 0
//Make class of employees and salary

package program;

import entities.*;

import java.sql.SQLOutput;

public class Payroll {
    public static void main(String[] args) {
        Employee[] arr = new Employee[3];
        arr[0] = new HourlyEmployee("Ari", "Chiche", 123456798, 45f, 20);
        arr[1] = new CommissionEmployee("Ari", "Chiche", 123456789, 25, 10);
        arr[2] = new BasePlusCommissionEmployee("Ari", "Chiche", 123456789, 25, 10, 20);

        for (Employee employee : arr) {
            if(employee instanceof BasePlusCommissionEmployee baseEmployee){
                baseEmployee.setBaseSalary(baseEmployee.getBaseSalary()*1.1f);
            }
            System.out.println(employee);
            System.out.println(String.format("Earnings: %.2f",employee.earnings()));
        }
    }
}
